import java.util.Scanner;
class twenty3
{
    public static void main(String[] args)
    {
                int count = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Number-");
        int num = input.nextInt();
                while (num != 0) {
                    // num = num/10
                    num /= 10;
                    ++count;
                }

                System.out.println("Number of digits: " + count);
            }
        }