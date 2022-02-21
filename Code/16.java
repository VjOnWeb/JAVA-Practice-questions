import java.util.Scanner;
class sixteen
{
    public static void main (String [] args)
    {
        char ch;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character");
        ch = input.next().charAt(0);
        if (ch>=65 && ch <=90)
            System.out.println("It is a character ");
        else if  (97<=ch && ch<=122)
            System.out.println("It is a character ");
        else
            System.out.println("INVALID");
    }
}