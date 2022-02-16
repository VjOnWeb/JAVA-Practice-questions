Example 1: Print an Array using For loop
public class Array {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        for (int element: array) {
            System.out.println(element);
        }
    }
}


Example 2: Print an Array using standard library Arrays
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        System.out.println(Arrays.toString(array));
    }
}


Example 3: Print a Multi-dimensional Array
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}, {5, 6, 7}};

        System.out.println(Arrays.deepToString(array));
    }
}Example 3: Print a Multi-dimensional Array
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        int[][] array = {{1, 2}, {3, 4}, {5, 6, 7}};

        System.out.println(Arrays.deepToString(array));
    }
}


