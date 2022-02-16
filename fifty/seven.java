Example 1: Program to Remove All Whitespaces
public class Whitespaces {

    public static void main(String[] args) {
        String sentence = "T    his is b  ett     er.";
        System.out.println("Original sentence: " + sentence);

        sentence = sentence.replaceAll("\\s", "");
        System.out.println("After replacement: " + sentence);
    }
}


Example 2: Take string from users and remove the white space
import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    // create an object of Scanner
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the string");

    // take the input
    String input = sc.nextLine();
    System.out.println("Original String: " + input);

    // remove white spaces
    input = input.replaceAll("\\s", "");
    System.out.println("Final String: " + input);
    sc.close();
  }
}
