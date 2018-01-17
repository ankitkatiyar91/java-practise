package learning;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;

public class MyAnnotationTest
{

    public static void main(String[] args)
    {
        System.out.println("MyAnnotationTest.main()");
        MyAnnotationObject annotationObject = new MyAnnotationObject();
        Annotation[] annotations = annotationObject.getClass().getDeclaredAnnotations();
        System.out.println("annotations-" + annotations.length);
        for (Annotation annotation : annotations)
        {
            System.out.println("Anno-" + annotation.toString());
        }

        AnnotatedType[] ann = annotationObject.getClass().getAnnotatedInterfaces();
        System.out.println("annotatedTypes-" + annotations.length);
        for (AnnotatedType annotatedType : ann)
        {
            System.out.println("annotatedType -" + annotatedType);
        }
    }
}
