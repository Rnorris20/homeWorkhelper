import javax.lang.model.util.ElementScanner6;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean homeWork = true;
    boolean lawnMowed = true;

    Scanner Scan = new Scanner (System.in);
    System.out.println("What was your answer for Problem 1?");
    int problemOne = Scan.nextInt();

    if (problemOne >= 10 && lawnMowed) {
      System.out.println("Nice job, you got this problem correct, now you can play at your friends house");
    } else if (problemOne > 7) {
      System.out.println("The answer is wrong, you cannot go to your friends house ");
    }
  }
}