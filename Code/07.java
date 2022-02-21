import java.util.Scanner;
class seven
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers -");
        float a = input.nextFloat();
        float b = input.nextFloat();
        float c =a*b ;
        System.out.println("Product of the numbers is :- " + c);
    }
}
