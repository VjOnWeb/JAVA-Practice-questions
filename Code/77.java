//Convert File to byte[]
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileByte {

    public static void main(String[] args) {

        String path = System.getProperty("user.dir") + "\\src\\test.txt";

        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            System.out.println(Arrays.toString(encoded));
        } catch (IOException e) {

        }
    }
}


//Convert byte[] to File
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ByteFile {

    public static void main(String[] args) {

        String path = System.getProperty("user.dir") + "\\src\\test.txt";
        String finalPath = System.getProperty("user.dir") + "\\src\\final.txt";

        try {
            byte[] encoded = Files.readAllBytes(Paths.get(path));
            Files.write(Paths.get(finalPath), encoded);
        } catch (IOException e) {

        }
    }
}
