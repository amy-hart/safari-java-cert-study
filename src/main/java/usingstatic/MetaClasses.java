package usingstatic;

import java.lang.reflect.Field;

class Invetigate {
  int x = 99;
  String y = "Hello";
  static String name = "I'm called Investigate";
}

public class MetaClasses {
  public static void main(String[] args) {
    Invetigate i1 = new Invetigate();
    i1.x = 200;
    Class cl = i1.getClass();
    System.out.println(cl.getName());
    Field [] fields = cl.getDeclaredFields();
    for (Field f : fields) {
      System.out.println("field> " + f);
    }
  }
}
