package learning.io_nio;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.DosFileAttributes;

public class FileOperationExamples
{
    public static void main(String[] args)
    {
        copy();
        // tempFile();

    }

    private static void tempFile()
    {
        try
        {
            Path tempFile = Files.createTempFile(null, ".myapp");
            System.out.format("The temporary file" +
                    " has been created: %s%n", tempFile);

            tempFile = Files.createTempFile("ankit_", ".myapp");

            System.out.format("The temporary file" +
                    " has been created: %s%n", tempFile);

            Files.newDirectoryStream(tempFile.getParent(), "*[0-9].myapp").forEach((c) -> {
                System.out.println("TempFile: " + c.getFileName());
            });

        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    private static void copy()
    {
        try
        {
            Path source = Paths.get("D:\\temp\\miniNitro.log");
            Path target = Paths.get("D:\\temp\\log\\miniNitro.log");
            if (Files.notExists(target.getParent()))
            {
                Files.createDirectories(target.getParent());
            }
            Files.copy(source, target, StandardCopyOption.REPLACE_EXISTING);
            System.out.println(Files.size(target) / 1024 + " KB");
            System.out.println(target + " \nOwner:" + Files.getOwner(target));

            BasicFileAttributes attr = Files.readAttributes(target, BasicFileAttributes.class);

            System.out.println("creationTime: " + attr.creationTime());
            System.out.println("lastAccessTime: " + attr.lastAccessTime());
            System.out.println("lastModifiedTime: " + attr.lastModifiedTime());

            System.out.println("isDirectory: " + attr.isDirectory());
            System.out.println("isOther: " + attr.isOther());
            System.out.println("isRegularFile: " + attr.isRegularFile());
            System.out.println("isSymbolicLink: " + attr.isSymbolicLink());
            System.out.println("size: " + attr.size());

            try
            {
                DosFileAttributes DOSAttr =
                        Files.readAttributes(target, DosFileAttributes.class);
                System.out.println("isReadOnly is " + DOSAttr.isReadOnly());
                System.out.println("isHidden is " + DOSAttr.isHidden());
                System.out.println("isArchive is " + DOSAttr.isArchive());
                System.out.println("isSystem is " + DOSAttr.isSystem());
            }
            catch (UnsupportedOperationException x)
            {
                System.err.println("DOS file" +
                        " attributes not supported:" + x);
            }

            Files.deleteIfExists(Paths.get(target.getParent().toString(), "short"));
            Path symbolik = Files.createSymbolicLink(Paths.get(target.getParent().toString(), "short"), target);
            System.out.println("Symbolic: " + symbolik + " Resolved To:" + symbolik.toRealPath());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }
}
