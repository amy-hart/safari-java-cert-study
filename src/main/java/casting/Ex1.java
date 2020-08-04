package casting;

/*final */class Base /*implements Runnable */{
//  public void run() {
//    System.out.println("Running...");
//  }
  void doBaseStuff() { System.out.println("doBaseStuff"); }
}

//class Sub extends Base {
//  void doBaseStuff() { System.out.println("doSubStuff"); }
//  void doOtherStuff() { System.out.println("doOtherStuff"); }
//}

public class Ex1 {
  public static void main(String[] args) {
    Base b = /*new SomeTypeThatIsSubclassOfBaseAndImplementsRunanble()*/new Base();
//    ((Sub)b).doOtherStuff();
    Runnable r = ((Runnable)b);
//    r.run();
  }
}
