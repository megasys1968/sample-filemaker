/*
 * Auto-generated file. Created by MyBatis Generator
 * Generation date: 2021-02-25T17:44:43.22788+09:00
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
import quo.vadis.megasys.sample.db.割り当てRecord

@Mapper
interface 割り当てMapper {
    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    fun count(selectStatement: SelectStatementProvider): Long

    @DeleteProvider(type=SqlProviderAdapter::class, method="delete")
    fun delete(deleteStatement: DeleteStatementProvider): Int

    @InsertProvider(type=SqlProviderAdapter::class, method="insert")
    @Options(useGeneratedKeys=true,keyProperty="record.主キー")
    fun insert(insertStatement: InsertStatementProvider<割り当てRecord>): Int

    @Insert(
        "\${insertStatement}"
    )
    @Options(useGeneratedKeys=true,keyProperty="records.主キー")
    fun insertMultiple(@Param("insertStatement") insertStatement: String, @Param("records") records: List<割り当てRecord>): Int

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @ResultMap("割り当てRecordResult")
    fun selectOne(selectStatement: SelectStatementProvider): 割り当てRecord?

    @SelectProvider(type=SqlProviderAdapter::class, method="select")
    @Results(id="割り当てRecordResult", value = [
        Result(column="担当者外部キー", property="担当者外部キー", jdbcType=JdbcType.VARCHAR),
        Result(column="主キー", property="主キー", jdbcType=JdbcType.VARCHAR),
        Result(column="作成者", property="作成者", jdbcType=JdbcType.VARCHAR),
        Result(column="修正者", property="修正者", jdbcType=JdbcType.VARCHAR),
        Result(column="タスク外部キー", property="タスク外部キー", jdbcType=JdbcType.VARCHAR),
        Result(column="作成情報タイムスタンプ", property="作成情報タイムスタンプ", jdbcType=JdbcType.TIMESTAMP),
        Result(column="修正情報タイムスタンプ", property="修正情報タイムスタンプ", jdbcType=JdbcType.TIMESTAMP)
    ])
    fun selectMany(selectStatement: SelectStatementProvider): List<割り当てRecord>

    @UpdateProvider(type=SqlProviderAdapter::class, method="update")
    fun update(updateStatement: UpdateStatementProvider): Int
}