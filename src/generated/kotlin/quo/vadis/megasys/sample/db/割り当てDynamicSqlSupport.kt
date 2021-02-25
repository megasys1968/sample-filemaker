/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2021-02-25T17:44:43.224712+09:00
 */
package quo.vadis.megasys.sample.db

import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.SqlTable

object 割り当てDynamicSqlSupport {
    object 割り当て : SqlTable("\"割り当て\"") {
        val 担当者外部キー = column<String>("\"担当者外部キー\"", JDBCType.VARCHAR)

        val 主キー = column<String>("\"主キー\"", JDBCType.VARCHAR)

        val 作成者 = column<String>("\"作成者\"", JDBCType.VARCHAR)

        val 修正者 = column<String>("\"修正者\"", JDBCType.VARCHAR)

        val タスク外部キー = column<String>("\"タスク外部キー\"", JDBCType.VARCHAR)

        val 作成情報タイムスタンプ = column<LocalDateTime>("\"作成情報タイムスタンプ\"", JDBCType.TIMESTAMP)

        val 修正情報タイムスタンプ = column<LocalDateTime>("\"修正情報タイムスタンプ\"", JDBCType.TIMESTAMP)
    }
}