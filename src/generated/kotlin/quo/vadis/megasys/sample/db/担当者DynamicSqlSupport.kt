/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2021-02-25T17:44:43.260624+09:00
 */
package quo.vadis.megasys.sample.db

import java.sql.JDBCType
import java.time.LocalDateTime
import org.mybatis.dynamic.sql.SqlTable

object 担当者DynamicSqlSupport {
    object 担当者 : SqlTable("\"担当者\"") {
        val 名 = column<String>("\"名\"", JDBCType.VARCHAR)

        val 姓 = column<String>("\"姓\"", JDBCType.VARCHAR)

        val 敬称 = column<String>("\"敬称\"", JDBCType.VARCHAR)

        val 会社 = column<String>("\"会社\"", JDBCType.VARCHAR)

        val グループ = column<String>("\"グループ\"", JDBCType.VARCHAR)

        val 電話 = column<String>("\"電話\"", JDBCType.VARCHAR)

        val 電子メール = column<String>("\"電子メール\"", JDBCType.VARCHAR)

        val 名前 = column<String>("\"名前\"", JDBCType.VARCHAR)

        val イニシャル = column<String>("\"イニシャル\"", JDBCType.VARCHAR)

        val 主キー = column<String>("\"主キー\"", JDBCType.VARCHAR)

        val 作成者 = column<String>("\"作成者\"", JDBCType.VARCHAR)

        val 修正者 = column<String>("\"修正者\"", JDBCType.VARCHAR)

        val 作成情報タイムスタンプ = column<LocalDateTime>("\"作成情報タイムスタンプ\"", JDBCType.TIMESTAMP)

        val 修正情報タイムスタンプ = column<LocalDateTime>("\"修正情報タイムスタンプ\"", JDBCType.TIMESTAMP)

        val 写真 = column<ByteArray>("\"写真\"", JDBCType.LONGVARBINARY)
    }
}