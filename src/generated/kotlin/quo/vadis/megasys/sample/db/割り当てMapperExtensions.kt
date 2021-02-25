/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2021-02-25T17:44:43.235835+09:00
 */
package quo.vadis.megasys.sample.db

import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*
import quo.vadis.megasys.sample.db.割り当てDynamicSqlSupport.割り当て
import quo.vadis.megasys.sample.db.割り当てDynamicSqlSupport.割り当て.タスク外部キー
import quo.vadis.megasys.sample.db.割り当てDynamicSqlSupport.割り当て.主キー
import quo.vadis.megasys.sample.db.割り当てDynamicSqlSupport.割り当て.作成情報タイムスタンプ
import quo.vadis.megasys.sample.db.割り当てDynamicSqlSupport.割り当て.作成者
import quo.vadis.megasys.sample.db.割り当てDynamicSqlSupport.割り当て.修正情報タイムスタンプ
import quo.vadis.megasys.sample.db.割り当てDynamicSqlSupport.割り当て.修正者
import quo.vadis.megasys.sample.db.割り当てDynamicSqlSupport.割り当て.担当者外部キー
import quo.vadis.megasys.sample.db.割り当てRecord

fun 割り当てMapper.count(completer: CountCompleter) =
    countFrom(this::count, 割り当て, completer)

fun 割り当てMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, 割り当て, completer)

fun 割り当てMapper.insertMultipleHelper(multipleInsertStatement: MultiRowInsertStatementProvider<割り当てRecord>) =
    insertMultiple(multipleInsertStatement.insertStatement, multipleInsertStatement.records)

fun 割り当てMapper.insert(record: 割り当てRecord) =
    insert(this::insert, record, 割り当て) {
        map(担当者外部キー).toProperty("担当者外部キー")
        map(作成者).toProperty("作成者")
        map(修正者).toProperty("修正者")
        map(タスク外部キー).toProperty("タスク外部キー")
        map(作成情報タイムスタンプ).toProperty("作成情報タイムスタンプ")
        map(修正情報タイムスタンプ).toProperty("修正情報タイムスタンプ")
    }

fun 割り当てMapper.insertMultiple(records: Collection<割り当てRecord>) =
    insertMultiple(this::insertMultipleHelper, records, 割り当て) {
        map(担当者外部キー).toProperty("担当者外部キー")
        map(作成者).toProperty("作成者")
        map(修正者).toProperty("修正者")
        map(タスク外部キー).toProperty("タスク外部キー")
        map(作成情報タイムスタンプ).toProperty("作成情報タイムスタンプ")
        map(修正情報タイムスタンプ).toProperty("修正情報タイムスタンプ")
    }

fun 割り当てMapper.insertMultiple(vararg records: 割り当てRecord) =
    insertMultiple(records.toList())

fun 割り当てMapper.insertSelective(record: 割り当てRecord) =
    insert(this::insert, record, 割り当て) {
        map(担当者外部キー).toPropertyWhenPresent("担当者外部キー", record::担当者外部キー)
        map(作成者).toPropertyWhenPresent("作成者", record::作成者)
        map(修正者).toPropertyWhenPresent("修正者", record::修正者)
        map(タスク外部キー).toPropertyWhenPresent("タスク外部キー", record::タスク外部キー)
        map(作成情報タイムスタンプ).toPropertyWhenPresent("作成情報タイムスタンプ", record::作成情報タイムスタンプ)
        map(修正情報タイムスタンプ).toPropertyWhenPresent("修正情報タイムスタンプ", record::修正情報タイムスタンプ)
    }

private val columnList = listOf(担当者外部キー, 主キー, 作成者, 修正者, タスク外部キー, 作成情報タイムスタンプ, 修正情報タイムスタンプ)

fun 割り当てMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, 割り当て, completer)

fun 割り当てMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, 割り当て, completer)

fun 割り当てMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, 割り当て, completer)

fun 割り当てMapper.update(completer: UpdateCompleter) =
    update(this::update, 割り当て, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: 割り当てRecord) =
    apply {
        set(担当者外部キー).equalTo(record::担当者外部キー)
        set(作成者).equalTo(record::作成者)
        set(修正者).equalTo(record::修正者)
        set(タスク外部キー).equalTo(record::タスク外部キー)
        set(作成情報タイムスタンプ).equalTo(record::作成情報タイムスタンプ)
        set(修正情報タイムスタンプ).equalTo(record::修正情報タイムスタンプ)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: 割り当てRecord) =
    apply {
        set(担当者外部キー).equalToWhenPresent(record::担当者外部キー)
        set(作成者).equalToWhenPresent(record::作成者)
        set(修正者).equalToWhenPresent(record::修正者)
        set(タスク外部キー).equalToWhenPresent(record::タスク外部キー)
        set(作成情報タイムスタンプ).equalToWhenPresent(record::作成情報タイムスタンプ)
        set(修正情報タイムスタンプ).equalToWhenPresent(record::修正情報タイムスタンプ)
    }