package learning;

import java.lang.annotation.Documented;
import java.lang.annotation.Repeatable;

@MyAnnotationAnnotationExample(name = "Test")
public class AnnotationExample
{

    private String a;

    /**
     * @deprecated
     * 
     */
    @Deprecated
    public void show()
    {
        // TODO Auto-generated method stub

    }

}

@Documented
@Repeatable(MyAnnotationsAnnotationExample.class)
@interface MyAnnotationAnnotationExample
{
    String name();
}

@Documented
@interface MyAnnotationsAnnotationExample
{
    MyAnnotationAnnotationExample[] value();
}