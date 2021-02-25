/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2021-02-25T17:44:43.262392+09:00
 */
package quo.vadis.megasys.sample.db

import org.apache.ibatis.annotations.DeleteProvider
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.InsertProvider
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Options
import org.apache.ibatis.annotations.Param
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.ResultMap
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.SelectProvider
import org.apache.ibatis.annotations.UpdateProvider
import org.apache.ibatis.type.JdbcType
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider
import org.mybatis.dynamic.sql.util.SqlProviderAdapter
import quo.vadis.megasys.sample.db.担当者Record

@Mapper
interface 担当者Mapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    fun count(selectStatement: SelectStatementProvider): Long

    @DeleteProvider(type=SqlProviderAdapter::class, method="delete")
    fun delete(deleteStatement: DeleteStatementProvider): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.主キー")
    fun insert(insertStatement: InsertStatementProvider<担当者Record>): Int

    @Insert(
        "\${insertStatement}"
    )
    @Options(useGeneratedKeys=true,keyProperty="records.主キー")
    fun insertMultiple(@Param("insertStatement") insertStatement: String, @Param("records") records: List<担当者Record>): Int

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("担当者RecordResult")
    fun selectOne(selectStatement: SelectStatementProvider): 担当者Record?

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="担当者RecordResult", value = [
        Result(column="名", property="名", jdbcType=JdbcType.VARCHAR),
        Result(column="姓", property="姓", jdbcType=JdbcType.VARCHAR),
        Result(column="敬称", property="敬称", jdbcType=JdbcType.VARCHAR),
        Result(column="会社", property="会社", jdbcType=JdbcType.VARCHAR),
        Result(column="グループ", property="グループ", jdbcType=JdbcType.VARCHAR),
        Result(column="電話", property="電話", jdbcType=JdbcType.VARCHAR),
        Result(column="電子メール", property="電子メール", jdbcType=JdbcType.VARCHAR),
        Result(column="名前", property="名前", jdbcType=JdbcType.VARCHAR),
        Result(column="イニシャル", property="イニシャル", jdbcType=JdbcType.VARCHAR),
        Result(column="主キー", property="主キー", jdbcType=JdbcType.VARCHAR),
        Result(column="作成者", property="作成者", jdbcType=JdbcType.VARCHAR),
        Result(column="修正者", property="修正者", jdbcType=JdbcType.VARCHAR),
        Result(column="作成情報タイムスタンプ", property="作成情報タイムスタンプ", jdbcType=JdbcType.TIMESTAMP),
        Result(column="修正情報タイムスタンプ", property="修正情報タイムスタンプ", jdbcType=JdbcType.TIMESTAMP),
        Result(column="写真", property="写真", jdbcType=JdbcType.LONGVARBINARY)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<担当者Record>

    @UpdateProvider(type=SqlProviderAdapter::class, method="update")
    fun update(updateStatement: UpdateStatementProvider): Int
}