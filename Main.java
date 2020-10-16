import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean lawnMowed = true;

    Scanner scan = new Scanner (System.in);
    System.out.println("Is your homework done, 'true' or 'false'?");
    boolean homeWork = scan.nextBoolean();
//Asking the audience to see if you they completed their homework.
    if ( homeWork == true && lawnMowed) {
      System.out.println("Nice job, now you can play at your friends house");

    } else if ( homeWork == false) {

      System.out.println("Sorry but you can't go to your friends house today.");
    }
  }
}