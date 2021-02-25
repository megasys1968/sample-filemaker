/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2021-02-25T17:44:43.251742+09:00
 */
package quo.vadis.megasys.sample.db

import java.sql.JDBCType
import java.time.LocalDate
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.SqlTable

object タスクDynamicSqlSupport {
    object タスク : SqlTable("\"タスク\"") {
        val タスク = column<String>("\"タスク\"", JDBCType.VARCHAR)

        val 期限 = column<LocalDateTime>("\"期限\"", JDBCType.TIMESTAMP)

        val 説明 = column<String>("\"説明\"", JDBCType.VARCHAR)

        val ステータス = column<String>("\"ステータス\"", JDBCType.VARCHAR)

        val カテゴリー = column<String>("\"カテゴリー\"", JDBCType.VARCHAR)

        val 完了日 = column<LocalDate>("\"完了日\"", JDBCType.DATE)

        val 優先度 = column<String>("\"優先度\"", JDBCType.VARCHAR)

        val 主キー = column<String>("\"主キー\"", JDBCType.VARCHAR)

        val 作成者 = column<String>("\"作成者\"", JDBCType.VARCHAR)

        val 修正者 = column<String>("\"修正者\"", JDBCType.VARCHAR)

        val 作成情報タイムスタンプ = column<LocalDateTime>("\"作成情報タイムスタンプ\"", JDBCType.TIMESTAMP)

        val 修正情報タイムスタンプ = column<LocalDateTime>("\"修正情報タイムスタンプ\"", JDBCType.TIMESTAMP)

        val 予定工数 = column<Double>("\"予定工数\"", JDBCType.DOUBLE)
    }
}