//Java Program to List all files

import java.io.File;

class Main {
  public static void main(String[] args) {

    // creates a file object
    File file = new File("C:\\Users\\Guest User\\Desktop\\Java File\\List Method");

    // returns an array of all files
    String[] fileList = file.list();

    for(String str : fileList) {
      System.out.println(str);
    }
  }
}

//List files present in a Directory excluding Subdirectories

import java.io.File;

class Main {
  public static void main(String[] args) {

    try {

      File folder = new File("C:\\Users\\Sudip Bhandari\\Desktop\\Java Article");

      // list all the files
      File[] files = folder.listFiles();
      for(File file : files) {
        if(file.isFile()) {
          System.out.println(file);
        }
      }
    } catch (Exception e) {
      e.getStackTrace();
    }
  }
}
