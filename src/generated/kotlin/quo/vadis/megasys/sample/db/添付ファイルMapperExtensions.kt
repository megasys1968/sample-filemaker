/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2021-02-25T17:44:43.259439+09:00
 */
package quo.vadis.megasys.sample.db

import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*
import quo.vadis.megasys.sample.db.添付ファイルDynamicSqlSupport.添付ファイル as AttachementFileTable
import quo.vadis.megasys.sample.db.添付ファイルDynamicSqlSupport.添付ファイル.主キー
import quo.vadis.megasys.sample.db.添付ファイルDynamicSqlSupport.添付ファイル.作成情報タイムスタンプ
import quo.vadis.megasys.sample.db.添付ファイルDynamicSqlSupport.添付ファイル.作成者
import quo.vadis.megasys.sample.db.添付ファイルDynamicSqlSupport.添付ファイル.修正情報タイムスタンプ
import quo.vadis.megasys.sample.db.添付ファイルDynamicSqlSupport.添付ファイル.修正者
import quo.vadis.megasys.sample.db.添付ファイルDynamicSqlSupport.添付ファイル.外部キー
import quo.vadis.megasys.sample.db.添付ファイルDynamicSqlSupport.添付ファイル.添付ファイル
import quo.vadis.megasys.sample.db.添付ファイルDynamicSqlSupport.添付ファイル.説明
import quo.vadis.megasys.sample.db.添付ファイルRecord

fun 添付ファイルMapper.count(completer: CountCompleter) =
    countFrom(this::count, AttachementFileTable, completer)

fun 添付ファイルMapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, AttachementFileTable, completer)

fun 添付ファイルMapper.insertMultipleHelper(multipleInsertStatement: MultiRowInsertStatementProvider<添付ファイルRecord>) =
    insertMultiple(multipleInsertStatement.insertStatement, multipleInsertStatement.records)

fun 添付ファイルMapper.insert(record: 添付ファイルRecord) =
    insert(this::insert, record, AttachementFileTable) {
        map(説明).toProperty("説明")
        map(外部キー).toProperty("外部キー")
        map(作成者).toProperty("作成者")
        map(修正者).toProperty("修正者")
        map(作成情報タイムスタンプ).toProperty("作成情報タイムスタンプ")
        map(修正情報タイムスタンプ).toProperty("修正情報タイムスタンプ")
        map(添付ファイル).toProperty("添付ファイル")
    }

fun 添付ファイルMapper.insertMultiple(records: Collection<添付ファイルRecord>) =
    insertMultiple(this::insertMultipleHelper, records, AttachementFileTable) {
        map(説明).toProperty("説明")
        map(外部キー).toProperty("外部キー")
        map(作成者).toProperty("作成者")
        map(修正者).toProperty("修正者")
        map(作成情報タイムスタンプ).toProperty("作成情報タイムスタンプ")
        map(修正情報タイムスタンプ).toProperty("修正情報タイムスタンプ")
        map(添付ファイル).toProperty("添付ファイル")
    }

fun 添付ファイルMapper.insertMultiple(vararg records: 添付ファイルRecord) =
    insertMultiple(records.toList())

fun 添付ファイルMapper.insertSelective(record: 添付ファイルRecord) =
    insert(this::insert, record, AttachementFileTable) {
        map(説明).toPropertyWhenPresent("説明", record::説明)
        map(外部キー).toPropertyWhenPresent("外部キー", record::外部キー)
        map(作成者).toPropertyWhenPresent("作成者", record::作成者)
        map(修正者).toPropertyWhenPresent("修正者", record::修正者)
        map(作成情報タイムスタンプ).toPropertyWhenPresent("作成情報タイムスタンプ", record::作成情報タイムスタンプ)
        map(修正情報タイムスタンプ).toPropertyWhenPresent("修正情報タイムスタンプ", record::修正情報タイムスタンプ)
        map(添付ファイル).toPropertyWhenPresent("添付ファイル", record::添付ファイル)
    }

private val columnList = listOf(説明, 外部キー, 主キー, 作成者, 修正者, 作成情報タイムスタンプ, 修正情報タイムスタンプ, 添付ファイル)

fun 添付ファイルMapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, AttachementFileTable, completer)

fun 添付ファイルMapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, AttachementFileTable, completer)

fun 添付ファイルMapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, AttachementFileTable, completer)

fun 添付ファイルMapper.update(completer: UpdateCompleter) =
    update(this::update, AttachementFileTable, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: 添付ファイルRecord) =
    apply {
        set(説明).equalTo(record::説明)
        set(外部キー).equalTo(record::外部キー)
        set(作成者).equalTo(record::作成者)
        set(修正者).equalTo(record::修正者)
        set(作成情報タイムスタンプ).equalTo(record::作成情報タイムスタンプ)
        set(修正情報タイムスタンプ).equalTo(record::修正情報タイムスタンプ)
        set(添付ファイル).equalTo(record::添付ファイル)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: 添付ファイルRecord) =
    apply {
        set(説明).equalToWhenPresent(record::説明)
        set(外部キー).equalToWhenPresent(record::外部キー)
        set(作成者).equalToWhenPresent(record::作成者)
        set(修正者).equalToWhenPresent(record::修正者)
        set(作成情報タイムスタンプ).equalToWhenPresent(record::作成情報タイムスタンプ)
        set(修正情報タイムスタンプ).equalToWhenPresent(record::修正情報タイムスタンプ)
        set(添付ファイル).equalToWhenPresent(record::添付ファイル)
    }