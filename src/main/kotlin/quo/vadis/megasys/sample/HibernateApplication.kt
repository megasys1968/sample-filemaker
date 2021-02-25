package quo.vadis.megasys.sample

import org.hibernate.LockMode
import org.hibernate.dialect.Dialect
import org.hibernate.dialect.function.NoArgSQLFunction
import org.hibernate.dialect.function.StandardSQLFunction
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Controller
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table
import org.hibernate.dialect.pagination.LimitHelper

import org.hibernate.engine.spi.RowSelection

import org.hibernate.dialect.pagination.AbstractLimitHandler

import org.hibernate.dialect.pagination.LimitHandler
import org.hibernate.type.*
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration
import org.springframework.context.annotation.Profile
import java.sql.Types


@Entity
@Table(name = """"タスク"""")
data class Task(
  @Id
  @Column(name = """"主キー"""")
  var id: String,
  @Column(name = """"タスク"""")
  val taskName: String
)

interface TaskRepository : JpaRepository<Task, String>


@Controller
@SpringBootApplication(exclude = [MybatisAutoConfiguration::class])
@Profile("hibernate")
class HibernateApplication(val taskRepository: TaskRepository) : CommandLineRunner {

  override fun run(vararg args: String?) {
    taskRepository.findAll()
  }

}

fun main(args: Array<String>) {
  System.setProperty("spring.profiles.active", "hibernate")
  runApplication<HibernateApplication>(*args)
}


class FileMakerDialect : Dialect() {
  override fun getLimitHandler(): LimitHandler {
    return object : AbstractLimitHandler() {
      override fun supportsLimit(): Boolean {
        return true
      }

      override fun processSql(sql: String, selection: RowSelection): String {
        val soff = String.format(" offset %d rows /*?*/", selection.firstRow)
        val slim = String.format(" fetch first %d rows only /*?*/", selection.maxRows)
        val sb = StringBuilder(sql.length + soff.length + slim.length).append(sql)
        if (LimitHelper.hasFirstRow(selection)) {
          sb.append(soff)
        }
        if (LimitHelper.hasMaxRows(selection)) {
          sb.append(slim)
        }
        return sb.toString()
      }
    }
  }

  override fun dropConstraints(): Boolean {
    return false
  }

  override fun hasAlterTable(): Boolean {
    return false
  }

  override fun supportsColumnCheck(): Boolean {
    return false
  }

  override fun supportsCascadeDelete(): Boolean {
    return false
  }

  override fun supportsLockTimeouts(): Boolean {
    return false
  }

  override fun canCreateSchema(): Boolean {
    return false
  }

  override fun getCurrentTimestampSQLFunctionName(): String {
    return "current_timestamp"
  }

  override fun isCurrentTimestampSelectStringCallable(): Boolean {
    return false
  }

  override fun supportsCurrentTimestampSelection(): Boolean {
    return true
  }

  override fun supportsOuterJoinForUpdate(): Boolean {
    return false
  }

  override fun supportsTableCheck(): Boolean {
    return false
  }

  override fun supportsUnionAll(): Boolean {
    return false
  }

  override fun supportsUnique(): Boolean {
    return false
  }

  override fun toBooleanValueString(arg0: Boolean): String {
    return if (arg0) {
      "{b'true'}"
    } else "{b'false'}"
  }

  override fun getForUpdateNowaitString(): String {
    return ""
  }

  override fun getForUpdateNowaitString(aliases: String): String {
    return ""
  }

  override fun getForUpdateString(): String {
    return ""
  }

  override fun getForUpdateString(lockMode: LockMode): String {
    return ""
  }

  override fun getForUpdateString(aliases: String): String {
    return ""
  }

  override fun supportsSequences(): Boolean {
    return false
  }

  override fun supportsPooledSequences(): Boolean {
    return false
  }

  companion object {
    private val STRING = StringType.INSTANCE
    private val DOUBLE = DoubleType.INSTANCE
    private val DATE = DateType.INSTANCE
    private val TIME = TimeType.INSTANCE
    private val TIMESTAMP = TimestampType.INSTANCE
    private val BLOB = BlobType.INSTANCE
    private val LONG = LongType.INSTANCE
  }

  init {
    // Register types
    registerColumnType(Types.VARCHAR, "varchar")
    registerColumnType(Types.VARCHAR, "string")
    registerColumnType(Types.DOUBLE, "double")
    registerColumnType(Types.DOUBLE, "decimal")
    registerColumnType(Types.DATE, "date")
    registerColumnType(Types.TIME, "time")
    registerColumnType(Types.TIMESTAMP, "timestamp")
    registerColumnType(Types.BLOB, "blob")
    registerFunction("sum", StandardSQLFunction("sum", DOUBLE))
    registerFunction("avg", StandardSQLFunction("avg", DOUBLE))
    registerFunction("count", StandardSQLFunction("count", LONG))
    registerFunction("chr", StandardSQLFunction("chr", STRING))
    registerFunction("current_user", StandardSQLFunction("current_user", STRING))
    registerFunction("dayname", StandardSQLFunction("dayname", STRING))
    registerFunction("rtrim", StandardSQLFunction("rtrim", STRING))
    registerFunction("trim", StandardSQLFunction("trim", STRING))
    registerFunction("ltrim", StandardSQLFunction("ltrim", STRING))
    registerFunction("upper", StandardSQLFunction("upper", STRING))
    registerFunction("lower", StandardSQLFunction("lower", STRING))
    registerFunction("left", StandardSQLFunction("left", STRING))
    registerFunction("monthname", StandardSQLFunction("monthname", STRING))
    registerFunction("right", StandardSQLFunction("right", STRING))
    registerFunction("substring", StandardSQLFunction("substring", STRING))
    registerFunction("space", StandardSQLFunction("space", STRING))
    registerFunction("strval", StandardSQLFunction("strval", STRING))
    registerFunction("current_time", StandardSQLFunction("current_time", STRING))
    registerFunction("time", StandardSQLFunction("time", STRING))
    registerFunction("timeval", StandardSQLFunction("timeval", STRING))
    registerFunction("username", StandardSQLFunction("username", STRING))
    registerFunction("user", StandardSQLFunction("user", STRING))
    registerFunction("abs", StandardSQLFunction("abs", DOUBLE))
    registerFunction("atan", StandardSQLFunction("atan", DOUBLE))
    registerFunction("atan2", StandardSQLFunction("atan2", DOUBLE))
    registerFunction("ceiling", StandardSQLFunction("ceiling", DOUBLE))
    registerFunction("ceil", StandardSQLFunction("ceil", DOUBLE))
    registerFunction("degrees", StandardSQLFunction("degrees", DOUBLE))
    registerFunction("deg", StandardSQLFunction("deg", DOUBLE))
    registerFunction("day", StandardSQLFunction("day", DOUBLE))
    registerFunction("dayofweek", StandardSQLFunction("dayofweek", DOUBLE))
    registerFunction("mod", StandardSQLFunction("mod", DOUBLE))
    registerFunction("exp", StandardSQLFunction("exp", DOUBLE))
    registerFunction("floor", StandardSQLFunction("floor", DOUBLE))
    registerFunction("hour", StandardSQLFunction("hour", DOUBLE))
    registerFunction("int", StandardSQLFunction("int", DOUBLE))
    registerFunction("length", StandardSQLFunction("length", DOUBLE))
    registerFunction("month", StandardSQLFunction("month", DOUBLE))
    registerFunction("ln", StandardSQLFunction("ln", DOUBLE))
    registerFunction("log", StandardSQLFunction("log", DOUBLE))
    registerFunction("max", StandardSQLFunction("max", DOUBLE))
    registerFunction("min", StandardSQLFunction("min", DOUBLE))
    registerFunction("minute", StandardSQLFunction("minute", DOUBLE))
    registerFunction("numval", StandardSQLFunction("numval", DOUBLE))
    registerFunction("pi", StandardSQLFunction("pi", DOUBLE))
    registerFunction("radians", StandardSQLFunction("radians", DOUBLE))
    registerFunction("round", StandardSQLFunction("round", DOUBLE))
    registerFunction("second", StandardSQLFunction("second", DOUBLE))
    registerFunction("sign", StandardSQLFunction("sign", DOUBLE))
    registerFunction("sin", StandardSQLFunction("sin", DOUBLE))
    registerFunction("sqrt", StandardSQLFunction("sqrt", DOUBLE))
    registerFunction("tan", StandardSQLFunction("tan", DOUBLE))
    registerFunction("year", StandardSQLFunction("year", DOUBLE))
    registerFunction("curdate", NoArgSQLFunction("curdate", DATE))
    registerFunction("current_date", NoArgSQLFunction("current_date", DATE))
    registerFunction("curtime", NoArgSQLFunction("curtime", TIME))
  }
}