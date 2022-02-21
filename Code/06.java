import java.util.Scanner;
class six
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers -");
        int a = input.nextInt();
        int b = input.nextInt();
        int c =a+b ;
        System.out.println("Sum of the numbers is :- " + c);
    }
}
