public class three {
    public static void main(String[] args)
    {
        int  a = 25;
        int b = 12;
        int c = 13;
        int d = a+b+c;

        System.out.println("Sum -" +d);

        if(a>b && a>c)
        System.out.println("Largest-" +a);
        else if (b>a && b>c)
        System.out.println("Largest -" +b);
        else {
        System.out.println("Largest -" +c);
        }

    }
}
