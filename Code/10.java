import java.util.Scanner;
class ten
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers -");
        int a = input.nextInt();
        int b = input.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        /* We can also use third variable,i.e., c as-
        c=a
        a=b
        b=c
         */
        System.out.println("1st Number is :- " + a);
        System.out.println("2nd Number is :- " + b);
    }
}
