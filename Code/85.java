//Example 1: Create a new directory in Java

import java.io.File;

class Main {
  public static void main(String[] args) {

    // creates a file object with specified path
    File file = new File("Java Example\\directory");

    // tries to create a new directory
    boolean value = file.mkdir();
    if(value) {
      System.out.println("The new directory is created.");
    }
    else {
      System.out.println("The directory already exists.");
    }
  }
}


//Example 2: Create a new Directory using the mkdirs() method

import java.io.File;

class Main {
  public static void main(String[] args) {

    // creates a file object in the current path
    File file = new File("Java Tutorial\\directory");

    // tries to create a new directory
    boolean value = file.mkdirs();
    if(value) {
      System.out.println("The new directory is created.");
    }
    else {
      System.out.println("The directory already exists.");
    }
  }
}
