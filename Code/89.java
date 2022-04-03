//Java Program to Convert char to int

class Main {
  public static void main(String[] args) {

    // create char variables
    char a = '5';
    char b = 'c';

    // convert char variables to int
    // ASCII value of characters is assigned
    int num1 = a;
    int num2 = b;

    // print the values
    System.out.println(num1);    // 53
    System.out.println(num2);    // 99
  }
}

//char to int using getNumericValue() method

class Main {
  public static void main(String[] args) {

    // create char variables
    char a = '5';
    char b = '9';

    // convert char variables to int
    // Use getNumericValue()
    int num1 = Character.getNumericValue(a);
    int num2 = Character.getNumericValue(b);

    // print the numeric value of characters
    System.out.println(num1);    // 5
    System.out.println(num2);    // 9
  }
}

//char to int using parseInt() method

class Main {
  public static void main(String[] args) {

    // create char variables
    char a = '5';
    char b = '9';

    // convert char variables to int
    // Use parseInt()
    int num1 = Integer.parseInt(String.valueOf(a));
    int num2 = Integer.parseInt(String.valueOf(b));

    // print numeric value
    System.out.println(num1);    // 5
    System.out.println(num2);    // 9
  }
}

//char to int by subtracting with '0'

class Main {
  public static void main(String[] args) {

    // create char variables
    char a = '9';
    char b = '3';

    // convert char variables to int
    // by subtracting with char 0
    int num1 = a - '0';
    int num2 = b - '0';

    // print numeric value
    System.out.println(num1);    // 9
    System.out.println(num2);    // 3
  }
}
