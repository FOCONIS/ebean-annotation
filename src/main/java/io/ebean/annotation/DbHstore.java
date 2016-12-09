package io.ebean.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Used for mapping a Map<String,String> type property to Postgres HSTORE data type.
 * <p>
 * The Map property should have keys and values of type String.
 * </p>
 * <p>
 * <h3>Example:</h3>
 * <pre>{@code
 *
 *   @DbHstore
 *   Map<String, String> tags;
 *
 * }</pre>
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DbHstore {

  /**
   * For VARCHAR storage specify the column length (defaults to 1000).
   */
  int length() default 0;
}