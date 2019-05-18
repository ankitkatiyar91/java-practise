package annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedType;

public class MyAnnotationTest {

	public static void main(String[] args) {

		MyAnnotationObject annotationObject = new MyAnnotationObject();

		Annotation[] annotations = annotationObject.getClass().getDeclaredAnnotations();
		System.out.println("annotations-" + annotations.length);
		for (Annotation annotation : annotations) {
			System.out.println("Anno-" + annotation.toString());
		}

		annotations = annotationObject.getClass().getAnnotations();
		System.out.println("annotations-" + annotations.length);
		for (Annotation annotation : annotations) {
			System.out.println("Anno-" + annotation.toString());
		}

		AnnotatedType[] ann = annotationObject.getClass().getAnnotatedInterfaces();
		System.out.println("annotatedTypes-" + annotations.length);
		for (AnnotatedType annotatedType : ann) {
			System.out.println("annotatedType -" + annotatedType);
		}

		System.out.println("isAnnotation(): " + annotationObject.getClass().isAnnotation());

		System.out.println("isAnnotationPresent(MySourceAnnotation.class): "
				+ annotationObject.getClass().isAnnotationPresent(MySourceAnnotation.class));

		System.out.println("isAnnotationPresent(MyRuntimeAnnotation.class): "
				+ annotationObject.getClass().isAnnotationPresent(MyRuntimeAnnotation.class));
	}
}
