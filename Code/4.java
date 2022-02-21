public class four {
    public static void main(String [] args) {

        int a= 25;
        int b= 12;
        int c= 13,result;

        result = a > b ? a > c ? a : c : b > c ?b : c ;

        System.out.println("Largest Number is: " +result);
        
    }
    
}
