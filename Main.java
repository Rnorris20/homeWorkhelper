import javax.lang.model.util.ElementScanner6;

class Main {
  public static void main(String[] args) {
    
    boolean homeWork = true;
    boolean problemOne = true;
    boolean problemTwo = true;
    Snanner Scan = new Scanner ();
    if (homeWork && problemOne && problemTwo)
    {
      System.out.println("I have completed my homework!");
    }
    else
    {
      System.out.println("My Homework is not yet done!");
    }
  }
}