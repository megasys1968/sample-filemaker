/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2021-02-25T17:44:43.25119+09:00
 */
package quo.vadis.megasys.sample.db

import java.time.LocalDate
import java.time.LocalDateTime

data class タスクRecord(
    var タスク: String? = null,
    var 期限: LocalDateTime? = null,
    var 説明: String? = null,
    var ステータス: String? = null,
    var カテゴリー: String? = null,
    var 完了日: LocalDate? = null,
    var 優先度: String? = null,
    var 主キー: String? = null,
    var 作成者: String? = null,
    var 修正者: String? = null,
    var 作成情報タイムスタンプ: LocalDateTime? = null,
    var 修正情報タイムスタンプ: LocalDateTime? = null,
    var 予定工数: Double? = null
)