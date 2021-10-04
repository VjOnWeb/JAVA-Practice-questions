import java.util.Scanner;
class seventeen
{
    public static void main (String [] args)
    {
        long factorial = 1;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = input.nextInt();
        for(int i = 1; i <= num; ++i)
        {
            // factorial = factorial * i;
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}