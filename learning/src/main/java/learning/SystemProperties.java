package learning;

/**
 * 
 * @author Ankit Katiyar
 * 
 * @category bytefold
 * @see {@link https://www.bytefold.com/system-properties-in-java/}
 *
 */
public class SystemProperties {

	public static void main(String[] args) {
		System.getProperties().entrySet().forEach(e -> {
			System.out.println(e.getKey() + " : " + e.getValue());
		});
	}
}
