public class CurrDirectory {

    public static void main(String[] args) {

        String path = System.getProperty("user.dir");
        
        System.out.println("Working Directory = " + path);

    }
}


//Get the current working directory using Path
import java.nio.file.Paths;

public class CurrDirectory {

    public static void main(String[] args) {

        String path = Paths.get("").toAbsolutePath().toString();
        System.out.println("Working Directory = " + path);

    }
}
