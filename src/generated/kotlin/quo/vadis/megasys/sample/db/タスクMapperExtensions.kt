/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2021-02-25T17:44:43.255498+09:00
 */
package quo.vadis.megasys.sample.db

import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*
import quo.vadis.megasys.sample.db.タスクDynamicSqlSupport.タスク  as TaskTable
import quo.vadis.megasys.sample.db.タスクDynamicSqlSupport.タスク.カテゴリー
import quo.vadis.megasys.sample.db.タスクDynamicSqlSupport.タスク.ステータス
import quo.vadis.megasys.sample.db.タスクDynamicSqlSupport.タスク.タスク
import quo.vadis.megasys.sample.db.タスクDynamicSqlSupport.タスク.主キー
import quo.vadis.megasys.sample.db.タスクDynamicSqlSupport.タスク.予定工数
import quo.vadis.megasys.sample.db.タスクDynamicSqlSupport.タスク.作成情報タイムスタンプ
import quo.vadis.megasys.sample.db.タスクDynamicSqlSupport.タスク.作成者
import quo.vadis.megasys.sample.db.タスクDynamicSqlSupport.タスク.修正情報タイムスタンプ
import quo.vadis.megasys.sample.db.タスクDynamicSqlSupport.タスク.修正者
import quo.vadis.megasys.sample.db.タスクDynamicSqlSupport.タスク.優先度
import quo.vadis.megasys.sample.db.タスクDynamicSqlSupport.タスク.完了日
import quo.vadis.megasys.sample.db.タスクDynamicSqlSupport.タスク.期限
import quo.vadis.megasys.sample.db.タスクDynamicSqlSupport.タスク.説明
import quo.vadis.megasys.sample.db.タスクRecord

fun タスクMapper.count(completer: CountCompleter) =
    countFrom(this::count, TaskTable, completer)

fun タスクMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, TaskTable, completer)

fun タスクMapper.insertMultipleHelper(multipleInsertStatement: MultiRowInsertStatementProvider<タスクRecord>) =
    insertMultiple(multipleInsertStatement.insertStatement, multipleInsertStatement.records)

fun タスクMapper.insert(record: タスクRecord) =
    insert(this::insert, record, TaskTable) {
        map(タスク).toProperty("タスク")
        map(期限).toProperty("期限")
        map(説明).toProperty("説明")
        map(ステータス).toProperty("ステータス")
        map(カテゴリー).toProperty("カテゴリー")
        map(完了日).toProperty("完了日")
        map(優先度).toProperty("優先度")
        map(作成者).toProperty("作成者")
        map(修正者).toProperty("修正者")
        map(作成情報タイムスタンプ).toProperty("作成情報タイムスタンプ")
        map(修正情報タイムスタンプ).toProperty("修正情報タイムスタンプ")
        map(予定工数).toProperty("予定工数")
    }

fun タスクMapper.insertMultiple(records: Collection<タスクRecord>) =
    insertMultiple(this::insertMultipleHelper, records, TaskTable) {
        map(タスク).toProperty("タスク")
        map(期限).toProperty("期限")
        map(説明).toProperty("説明")
        map(ステータス).toProperty("ステータス")
        map(カテゴリー).toProperty("カテゴリー")
        map(完了日).toProperty("完了日")
        map(優先度).toProperty("優先度")
        map(作成者).toProperty("作成者")
        map(修正者).toProperty("修正者")
        map(作成情報タイムスタンプ).toProperty("作成情報タイムスタンプ")
        map(修正情報タイムスタンプ).toProperty("修正情報タイムスタンプ")
        map(予定工数).toProperty("予定工数")
    }

fun タスクMapper.insertMultiple(vararg records: タスクRecord) =
    insertMultiple(records.toList())

fun タスクMapper.insertSelective(record: タスクRecord) =
    insert(this::insert, record, TaskTable) {
        map(タスク).toPropertyWhenPresent("タスク", record::タスク)
        map(期限).toPropertyWhenPresent("期限", record::期限)
        map(説明).toPropertyWhenPresent("説明", record::説明)
        map(ステータス).toPropertyWhenPresent("ステータス", record::ステータス)
        map(カテゴリー).toPropertyWhenPresent("カテゴリー", record::カテゴリー)
        map(完了日).toPropertyWhenPresent("完了日", record::完了日)
        map(優先度).toPropertyWhenPresent("優先度", record::優先度)
        map(作成者).toPropertyWhenPresent("作成者", record::作成者)
        map(修正者).toPropertyWhenPresent("修正者", record::修正者)
        map(作成情報タイムスタンプ).toPropertyWhenPresent("作成情報タイムスタンプ", record::作成情報タイムスタンプ)
        map(修正情報タイムスタンプ).toPropertyWhenPresent("修正情報タイムスタンプ", record::修正情報タイムスタンプ)
        map(予定工数).toPropertyWhenPresent("予定工数", record::予定工数)
    }

private val columnList = listOf(タスク, 期限, 説明, ステータス, カテゴリー, 完了日, 優先度, 主キー, 作成者, 修正者, 作成情報タイムスタンプ, 修正情報タイムスタンプ, 予定工数)

fun タスクMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, TaskTable, completer)

fun タスクMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, TaskTable, completer)

fun タスクMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, TaskTable, completer)

fun タスクMapper.update(completer: UpdateCompleter) =
    update(this::update, TaskTable, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: タスクRecord) =
    apply {
        set(タスク).equalTo(record::タスク)
        set(期限).equalTo(record::期限)
        set(説明).equalTo(record::説明)
        set(ステータス).equalTo(record::ステータス)
        set(カテゴリー).equalTo(record::カテゴリー)
        set(完了日).equalTo(record::完了日)
        set(優先度).equalTo(record::優先度)
        set(作成者).equalTo(record::作成者)
        set(修正者).equalTo(record::修正者)
        set(作成情報タイムスタンプ).equalTo(record::作成情報タイムスタンプ)
        set(修正情報タイムスタンプ).equalTo(record::修正情報タイムスタンプ)
        set(予定工数).equalTo(record::予定工数)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: タスクRecord) =
    apply {
        set(タスク).equalToWhenPresent(record::タスク)
        set(期限).equalToWhenPresent(record::期限)
        set(説明).equalToWhenPresent(record::説明)
        set(ステータス).equalToWhenPresent(record::ステータス)
        set(カテゴリー).equalToWhenPresent(record::カテゴリー)
        set(完了日).equalToWhenPresent(record::完了日)
        set(優先度).equalToWhenPresent(record::優先度)
        set(作成者).equalToWhenPresent(record::作成者)
        set(修正者).equalToWhenPresent(record::修正者)
        set(作成情報タイムスタンプ).equalToWhenPresent(record::作成情報タイムスタンプ)
        set(修正情報タイムスタンプ).equalToWhenPresent(record::修正情報タイムスタンプ)
        set(予定工数).equalToWhenPresent(record::予定工数)
    }