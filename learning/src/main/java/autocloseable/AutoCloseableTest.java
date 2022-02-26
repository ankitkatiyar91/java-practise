package autocloseable;

public class AutoCloseableTest {

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            System.out.println("Using resource");
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Exit from the resource try");

    }

}

class MyResource implements AutoCloseable {

    @Override
    public void close() throws Exception {
        System.out.println("MyResource.close()");

    }

}