import javax.lang.model.util.ElementScanner6;

import java.until.Scanner;

class Main {
  public static void main(String[] args) {
    boolean homeWork = true;

    Scanner Scan = new Scanner (System.in);
    System.out.println("What was your answer for Problem 1?");
    int problemOne = scan.nextInt();

    if (problemOne >= 10);
    {
      System.out.println("I have completed my homework!");
    }
   else (problemOne < 10);
    {
      System.out.println("This answer is wrong, Keep working!");
    }
  }
}