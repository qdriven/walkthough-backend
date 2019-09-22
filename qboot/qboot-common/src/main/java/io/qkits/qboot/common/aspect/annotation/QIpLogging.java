package io.qkits.qboot.common.aspect.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


/**
 *
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface QIpLogging {

  /**
   * 日志内容
   */
  String value() default "";

  /**
   * 日志类型
   *
   * @return 0:操作日志;1:登录日志;2:定时任务;
   */
  int logType() default 0;

  /**
   * 操作日志类型
   *
   * @return （1查询，2添加，3修改，4删除）
   */
  int operateType() default 0;
}