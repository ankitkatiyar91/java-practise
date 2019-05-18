package annotation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import learning.User;

/**
 * Source annotations are not retained at runtime
 * 
 * @author ankitkatiyar91
 *
 */
@Retention(RetentionPolicy.SOURCE)
@Target(value = { LOCAL_VARIABLE, ANNOTATION_TYPE, ElementType.TYPE })
public @interface MySourceAnnotation {
	String name() default " jsahdksajd";

	int rank() default 1;

	User user();
}
