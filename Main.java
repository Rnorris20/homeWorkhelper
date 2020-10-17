import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    boolean lawnMowed = true;

    Scanner scan = new Scanner (System.in);
    System.out.println("Is your homework done, 'true' or 'false'?");
    boolean homeWork = scan.nextBoolean();
//Asking the audience to see if you they completed their homework.
    if ( homeWork == true && lawnMowed) {
      System.out.println("Nice job, now you can move onto the next problem.");
      
      System.out.println("You still have to complete the next couple of problems to go to your friends house.");

     for(int count = 2; count <= 10; count++)
     
        System.out.println(count);


    } else if ( homeWork == false) {


      System.out.println("Once you complete these problems you are done with your homework!");

      }
     }
    }
  
