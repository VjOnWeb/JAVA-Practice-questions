import java.util.Scanner;
class fifteen
{
    public static void main (String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number");
        double num = input.nextDouble();
        if (num > 0.00)
        System.out.println("Number is Positive ");
        else if  (num == 0.0)
            System.out.println("Number is Zero ");
        else
            System.out.println("Number is Negative ");
    }
}