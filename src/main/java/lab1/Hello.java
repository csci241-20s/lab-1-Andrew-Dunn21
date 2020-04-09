package lab1;

public class Hello {
  public static void main(String[] args) {
    String input = "world";
    try{
      input = args[0];
    }
    catch(Exception e){
      System.out.println("Uh oh... \t No args given!");
    }
    System.out.println("Hello, " + input + "!");
  }
}
