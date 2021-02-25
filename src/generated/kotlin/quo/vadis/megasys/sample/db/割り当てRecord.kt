/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2021-02-25T17:44:43.219948+09:00
 */
package quo.vadis.megasys.sample.db

import java.time.LocalDateTime

data class 割り当てRecord(
    var 担当者外部キー: String? = null,
    var 主キー: String? = null,
    var 作成者: String? = null,
    var 修正者: String? = null,
    var タスク外部キー: String? = null,
    var 作成情報タイムスタンプ: LocalDateTime? = null,
    var 修正情報タイムスタンプ: LocalDateTime? = null
)