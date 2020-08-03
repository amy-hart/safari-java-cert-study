package equality;

public class StringComparison {
  public static void main(String[] args) {
    String x = "Hello";
    String y = "He";
    y += "llo";
//    String y = "Hello";
    System.out.println(x);
    System.out.println(y);
    System.out.println("x == y? " + (x == y));
    System.out.println("x.equals(y)? " + (x.equals(y)));

    StringBuilder sb1 = new StringBuilder("Hello");
    StringBuilder sb2 = new StringBuilder("Hello");
    System.out.println(sb1.equals(sb2));

    System.out.println(x);
    String z = x.toUpperCase();
    System.out.println(x);
    System.out.println(z);

    System.out.println("----------------------");
    sb2 = sb1;
    System.out.println(sb1);
    System.out.println(sb2);
    sb1.append(" world!");
    System.out.println(sb2);
    System.out.println("== " + (sb1 == sb2));
    System.out.println("equals " + (sb1.equals(sb2)));

    System.out.println("----------------------");

    System.out.println("x is " + x);

    y = "He";
    y += "llo";
    System.out.println("x == y " + (x == y));
    y = y.intern(); // Might happen "by magic" -- Garbage collectors sometimes, if configured, can do this.
    System.out.println("x == y " + (x == y));
  }
}
