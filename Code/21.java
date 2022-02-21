import java.util.Scanner;

class twenty1 {
    public static void main(String[] args) {

        // find LCM between n1 and n2
        int lcm;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Numbers -");
        int n1 = input.nextInt();
        int n2 = input.nextInt();

        //The LCM of two integers is the smallest positive integer
        // that is perfectly divisible by both the numbers (without a remainder).
        lcm = (n1 > n2) ? n1 : n2;

        // Always true
        while(true) {
            if( lcm % n1 == 0 && lcm % n2 == 0 ) {
                System.out.printf("The LCM of %d and %d is %d.", n1, n2, lcm);
                break;
            }
            ++lcm;
        }
    }
}