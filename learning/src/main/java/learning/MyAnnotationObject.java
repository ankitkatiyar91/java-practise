package learning;

import annotation.MyAnnotation;

@MyAnnotation(user = User.SOME)
public class MyAnnotationObject
{

    public void testName()
    {
        @MyAnnotation(user = User.ALL)
        final String a = "Test";

    }
}
