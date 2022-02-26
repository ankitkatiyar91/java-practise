package autocloseable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class AutoCloseableTest1 {

    /**
     * @param args
     */
    public static void main(String[] args) throws IOException {

        InputStream resource1 = null;
        File tempFile = Files.createTempFile("test", "tmp").toFile();
        try (InputStream resource = new FileInputStream(tempFile)) {
            resource1 = new FileInputStream(tempFile);
            System.out.println("Using resource:" + resource);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        System.out.println("Exit from the resource try");
        System.out.println("Resource is initialized: " + resource1);
    }

}