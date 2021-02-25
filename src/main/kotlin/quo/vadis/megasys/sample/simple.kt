package quo.vadis.megasys.sample

import java.sql.DriverManager

fun main(args: Array<String>) {
  Class.forName("com.filemaker.jdbc.Driver")
  DriverManager.getConnection("jdbc:filemaker://test-fms/タスク", "admin", "sample123")
    .use { con ->
      val dmd = con.metaData

      dmd.getTables(null, null, "%", null).use { rs ->
        while (rs.next()) {
          println("--- Table ---")
          val catalogName = rs.getString("TABLE_CAT")
          println("カタログ名=$catalogName")

          val schemaName = rs.getString("TABLE_SCHEM")
          println("スキーマ名=$schemaName")

          val tableName = rs.getString("TABLE_NAME")
          println("デーブル名=$tableName")

          dmd.getColumns(catalogName, schemaName, tableName, null).use { columnRs ->
            while (columnRs.next()) {
              println(
                "カラム名=${columnRs.getString("COLUMN_NAME")}, java.sql.Types=${columnRs.getString("DATA_TYPE")}, 型名=${
                  columnRs.getString(
                    "TYPE_NAME"
                  )
                }"
              )
            }
          }
        }
      }

      con.createStatement().use { statement ->
        statement.executeUpdate("""delete from "タスク"""")
        statement.executeUpdate("""delete from "担当者"""")
      }

      con.prepareStatement("""insert into "タスク" ("タスク") values (?)""").use { statement ->
        statement.setString(1, "のんびりする")
        statement.executeUpdate()
      }

      con.prepareStatement("""insert into "担当者" ("名", "姓") values (?, ?) """).use { statement ->
        statement.setString(1, "シャア")
        statement.setString(2, "アズナブル")
        statement.executeUpdate()
      }

      dmd.getTables(null, null, "%", null).use { rs ->
        while (rs.next()) {
          val tableName = rs.getString("TABLE_NAME")
          println("--- Table: $tableName ---")
          con.createStatement().use { statement ->
            statement.executeQuery("""select * from "$tableName"""").use { rs ->
              while (rs.next()) {
                (1..rs.metaData.columnCount).forEach { columnIndex ->

                  val value: Any? = when (rs.metaData.getColumnType(columnIndex)) {
                    8 -> rs.getDouble(columnIndex)
                    else -> rs.getObject(columnIndex)
                  }

                  println(
                    """ ${rs.metaData.getColumnName(columnIndex)} = $value"""
                  )

                }
              }
            }
          }
        }
      }
    }
}
