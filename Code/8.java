import java.util.Scanner;
class eight
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a character -");
        char a = input.next().charAt(0);
        System.out.println("ASCII value of the numbers is :- " + (int)a);
    }
}