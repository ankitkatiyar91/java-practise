package classloader;

/**
 * 
 * @author Ankit Katiyar
 * Ref: https://www.baeldung.com/java-classloaders
 *
 */
public class CustomClassLoader extends ClassLoader{
	
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		return super.findClass(name);
	}

}
