import java.util.Scanner;
class nine
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers -");
        int a = input.nextInt();
        int b = input.nextInt();
        int c =a/b ;
        int d = a%b ;
        System.out.println("Quotient is :- " + c);
        System.out.println("Remainder is :- " + d);
    }
}