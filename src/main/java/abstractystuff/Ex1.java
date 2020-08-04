package abstractystuff;
abstract class Base { // line n1
  public abstract void doStuff(); // line n2
}

class Sub extends Base { // line n3
  public void doStuff() {}
}
public class Ex1 {
  public static void main(String[] args) {
//    Base b = new Base();
    Base b = new Sub();
  }
}
