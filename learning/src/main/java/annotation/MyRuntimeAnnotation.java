package annotation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.LOCAL_VARIABLE;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import learning.User;

@Retention(RetentionPolicy.RUNTIME)
@Target(value = { LOCAL_VARIABLE, ANNOTATION_TYPE, ElementType.TYPE })
public @interface MyRuntimeAnnotation
{
    String name() default "default name";

    int rank() default 1;

    User user();
}
