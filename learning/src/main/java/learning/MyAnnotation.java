package learning;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.SOURCE)
@Target(value = { LOCAL_VARIABLE, ANNOTATION_TYPE, ElementType.TYPE })
public @interface MyAnnotation
{
    String name() default " jsahdksajd";

    int rank() default 1;

    User user();
}
