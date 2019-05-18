package annotation;

import annotation.MySourceAnnotation;
import learning.User;

@MySourceAnnotation(user = User.SOME)
@MyRuntimeAnnotation(user = User.ALL)
public class MyAnnotationObject {

	public void testName() {
		@MySourceAnnotation(user = User.ALL)
		final String a = "Test";

	}
}
