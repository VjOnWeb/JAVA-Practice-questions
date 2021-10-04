import java.util.Scanner;
class twenty6
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number-");
        int num = input.nextInt();
        int reversed=0;int x= num;
        while (num != 0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;

        }
            if (x == reversed){
                System.out.println("Palindrome" );
            }
            else{
                System.out.println(" Not Palindrome" );
            }
    }
}