//Java Program to Convert int to char

class Main {
  public static void main(String[] args) {

    // create int variables
    int num1 = 80;
    int num2 = 81;

    // convert int to char
    // typecasting
    char a = (char)num1;
    char b = (char)num2;

    // print value
    System.out.println(a);    // P
    System.out.println(b);    // Q
  }
}


//int to char by using forDigit()

class Main {
  public static void main(String[] args) {

    // create int variables
    int num1 = 1;
    int num2 = 13;

    // convert int to char
    // for value between 0-9
    char a = Character.forDigit(num1, 10);

    // for value between 0-9
    char b = Character.forDigit(num2, 16);

    // print value
    System.out.println(a);    // 1
    System.out.println(b);    // d
  }
}


//int to char by adding '0'

class Main {
  public static void main(String[] args) {

    // create int variables
    int num1 = 1;
    int num2 = 9;

    // convert int to char
    char a = (char)(num1 + '0');
    char b = (char)(num2 + '0');

    // print value
    System.out.println(a);    // 1
    System.out.println(b);    // 9
  }
}
