/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2021-02-25T17:44:43.263178+09:00
 */
package quo.vadis.megasys.sample.db

import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider
import org.mybatis.dynamic.sql.util.kotlin.*
import org.mybatis.dynamic.sql.util.kotlin.mybatis3.*
import quo.vadis.megasys.sample.db.担当者DynamicSqlSupport.担当者
import quo.vadis.megasys.sample.db.担当者DynamicSqlSupport.担当者.イニシャル
import quo.vadis.megasys.sample.db.担当者DynamicSqlSupport.担当者.グループ
import quo.vadis.megasys.sample.db.担当者DynamicSqlSupport.担当者.主キー
import quo.vadis.megasys.sample.db.担当者DynamicSqlSupport.担当者.会社
import quo.vadis.megasys.sample.db.担当者DynamicSqlSupport.担当者.作成情報タイムスタンプ
import quo.vadis.megasys.sample.db.担当者DynamicSqlSupport.担当者.作成者
import quo.vadis.megasys.sample.db.担当者DynamicSqlSupport.担当者.修正情報タイムスタンプ
import quo.vadis.megasys.sample.db.担当者DynamicSqlSupport.担当者.修正者
import quo.vadis.megasys.sample.db.担当者DynamicSqlSupport.担当者.写真
import quo.vadis.megasys.sample.db.担当者DynamicSqlSupport.担当者.名
import quo.vadis.megasys.sample.db.担当者DynamicSqlSupport.担当者.名前
import quo.vadis.megasys.sample.db.担当者DynamicSqlSupport.担当者.姓
import quo.vadis.megasys.sample.db.担当者DynamicSqlSupport.担当者.敬称
import quo.vadis.megasys.sample.db.担当者DynamicSqlSupport.担当者.電子メール
import quo.vadis.megasys.sample.db.担当者DynamicSqlSupport.担当者.電話
import quo.vadis.megasys.sample.db.担当者Record

fun 担当者Mapper.count(completer: CountCompleter) =
    countFrom(this::count, 担当者, completer)

fun 担当者Mapper.delete(completer: DeleteCompleter) =
    deleteFrom(this::delete, 担当者, completer)

fun 担当者Mapper.insertMultipleHelper(multipleInsertStatement: MultiRowInsertStatementProvider<担当者Record>) =
    insertMultiple(multipleInsertStatement.insertStatement, multipleInsertStatement.records)

fun 担当者Mapper.insert(record: 担当者Record) =
    insert(this::insert, record, 担当者) {
        map(名).toProperty("名")
        map(姓).toProperty("姓")
        map(敬称).toProperty("敬称")
        map(会社).toProperty("会社")
        map(グループ).toProperty("グループ")
        map(電話).toProperty("電話")
        map(電子メール).toProperty("電子メール")
        map(名前).toProperty("名前")
        map(イニシャル).toProperty("イニシャル")
        map(作成者).toProperty("作成者")
        map(修正者).toProperty("修正者")
        map(作成情報タイムスタンプ).toProperty("作成情報タイムスタンプ")
        map(修正情報タイムスタンプ).toProperty("修正情報タイムスタンプ")
        map(写真).toProperty("写真")
    }

fun 担当者Mapper.insertMultiple(records: Collection<担当者Record>) =
    insertMultiple(this::insertMultipleHelper, records, 担当者) {
        map(名).toProperty("名")
        map(姓).toProperty("姓")
        map(敬称).toProperty("敬称")
        map(会社).toProperty("会社")
        map(グループ).toProperty("グループ")
        map(電話).toProperty("電話")
        map(電子メール).toProperty("電子メール")
        map(名前).toProperty("名前")
        map(イニシャル).toProperty("イニシャル")
        map(作成者).toProperty("作成者")
        map(修正者).toProperty("修正者")
        map(作成情報タイムスタンプ).toProperty("作成情報タイムスタンプ")
        map(修正情報タイムスタンプ).toProperty("修正情報タイムスタンプ")
        map(写真).toProperty("写真")
    }

fun 担当者Mapper.insertMultiple(vararg records: 担当者Record) =
    insertMultiple(records.toList())

fun 担当者Mapper.insertSelective(record: 担当者Record) =
    insert(this::insert, record, 担当者) {
        map(名).toPropertyWhenPresent("名", record::名)
        map(姓).toPropertyWhenPresent("姓", record::姓)
        map(敬称).toPropertyWhenPresent("敬称", record::敬称)
        map(会社).toPropertyWhenPresent("会社", record::会社)
        map(グループ).toPropertyWhenPresent("グループ", record::グループ)
        map(電話).toPropertyWhenPresent("電話", record::電話)
        map(電子メール).toPropertyWhenPresent("電子メール", record::電子メール)
        map(名前).toPropertyWhenPresent("名前", record::名前)
        map(イニシャル).toPropertyWhenPresent("イニシャル", record::イニシャル)
        map(作成者).toPropertyWhenPresent("作成者", record::作成者)
        map(修正者).toPropertyWhenPresent("修正者", record::修正者)
        map(作成情報タイムスタンプ).toPropertyWhenPresent("作成情報タイムスタンプ", record::作成情報タイムスタンプ)
        map(修正情報タイムスタンプ).toPropertyWhenPresent("修正情報タイムスタンプ", record::修正情報タイムスタンプ)
        map(写真).toPropertyWhenPresent("写真", record::写真)
    }

private val columnList = listOf(名, 姓, 敬称, 会社, グループ, 電話, 電子メール, 名前, イニシャル, 主キー, 作成者, 修正者, 作成情報タイムスタンプ, 修正情報タイムスタンプ, 写真)

fun 担当者Mapper.selectOne(completer: SelectCompleter) =
    selectOne(this::selectOne, columnList, 担当者, completer)

fun 担当者Mapper.select(completer: SelectCompleter) =
    selectList(this::selectMany, columnList, 担当者, completer)

fun 担当者Mapper.selectDistinct(completer: SelectCompleter) =
    selectDistinct(this::selectMany, columnList, 担当者, completer)

fun 担当者Mapper.update(completer: UpdateCompleter) =
    update(this::update, 担当者, completer)

fun KotlinUpdateBuilder.updateAllColumns(record: 担当者Record) =
    apply {
        set(名).equalTo(record::名)
        set(姓).equalTo(record::姓)
        set(敬称).equalTo(record::敬称)
        set(会社).equalTo(record::会社)
        set(グループ).equalTo(record::グループ)
        set(電話).equalTo(record::電話)
        set(電子メール).equalTo(record::電子メール)
        set(名前).equalTo(record::名前)
        set(イニシャル).equalTo(record::イニシャル)
        set(作成者).equalTo(record::作成者)
        set(修正者).equalTo(record::修正者)
        set(作成情報タイムスタンプ).equalTo(record::作成情報タイムスタンプ)
        set(修正情報タイムスタンプ).equalTo(record::修正情報タイムスタンプ)
        set(写真).equalTo(record::写真)
    }

fun KotlinUpdateBuilder.updateSelectiveColumns(record: 担当者Record) =
    apply {
        set(名).equalToWhenPresent(record::名)
        set(姓).equalToWhenPresent(record::姓)
        set(敬称).equalToWhenPresent(record::敬称)
        set(会社).equalToWhenPresent(record::会社)
        set(グループ).equalToWhenPresent(record::グループ)
        set(電話).equalToWhenPresent(record::電話)
        set(電子メール).equalToWhenPresent(record::電子メール)
        set(名前).equalToWhenPresent(record::名前)
        set(イニシャル).equalToWhenPresent(record::イニシャル)
        set(作成者).equalToWhenPresent(record::作成者)
        set(修正者).equalToWhenPresent(record::修正者)
        set(作成情報タイムスタンプ).equalToWhenPresent(record::作成情報タイムスタンプ)
        set(修正情報タイムスタンプ).equalToWhenPresent(record::修正情報タイムスタンプ)
        set(写真).equalToWhenPresent(record::写真)
    }