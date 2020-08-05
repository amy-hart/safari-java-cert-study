package myservice;

public class Useful {
  public static final String message = "I'm a message from myservice.Useful";
  private static String secretMessage = "Haha, you can't read this...";
  public static void showSecret() {
    System.out.println("Useful reports: " + secretMessage);
  }
}
