package learning.io_nio;

import java.io.IOException;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample
{
    public static void main(String[] args)
    {
        // None of these methods requires that the file corresponding
        // to the Path exists.
        Path path = Paths.get("C:\\home\\joe\\foo");

        System.out.format("toString: %s%n", path.toString());
        System.out.format("getFileName: %s%n", path.getFileName());
        System.out.format("getName(0): %s%n", path.getName(0));
        System.out.format("getNameCount: %d%n", path.getNameCount());
        System.out.format("subpath(0,2): %s%n", path.subpath(0, 2));
        System.out.format("getParent: %s%n", path.getParent());
        System.out.format("getRoot: %s%n", path.getRoot());

        path = Paths.get("C:\\home\\joe\\foo\\..");
        System.out.format("toString: %s%n", path.toString());
        System.out.format("toAbsolutePath: %s%n", path.toAbsolutePath());
        System.out.format("normalize: %s%n", path.normalize());

        try
        {
            path = Paths.get("C:\\Users\\Public\\Desktop\\Acrobat Reader DC.lnk");
            Path fp = path.toRealPath();
            System.out.println(path + " Resolved to:" + fp);
        }
        catch (NoSuchFileException x)
        {
            System.err.format("%s: no such" + " file or directory%n", path);
            // Logic for case when file doesn't exist.
        }
        catch (IOException x)
        {
            System.err.format("%s%n", x);
            // Logic for other sort of file error.
        }
    }
}
