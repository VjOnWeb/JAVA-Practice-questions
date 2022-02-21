//Example 1: Convert char to String

public class CharString {

    public static void main(String[] args) {
        char ch = 'c';
        String st = Character.toString(ch);
        // Alternatively
        // st = String.valueOf(ch);

        System.out.println("The string is: " + st);
    }
}


//Example 2: Convert char array to String
//If you have a char array instead of just a char, we can easily convert it to String using String methods as follows:

public class CharString {

    public static void main(String[] args) {
        char[] ch = {'a', 'e', 'i', 'o', 'u'};

        String st = String.valueOf(ch);
        String st2 = new String(ch);

        System.out.println(st);
        System.out.println(st2);
    }
}


//Example 3: Convert String to char array
//We can also convert a string to char array (but not char) using String's method toCharArray().

import java.util.Arrays;

public class StringChar {

    public static void main(String[] args) {
        String st = "This is great";

        char[] chars = st.toCharArray();
        System.out.println(Arrays.toString(chars));
    }
}
