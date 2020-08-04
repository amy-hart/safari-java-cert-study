package initializing;
class Base {
  Base() { super(); }
  private int x;
  public Base(int x) {
    this.x = x;
  }
}

// Java is single implementaion inheritance
// IF you implement interface as well as extends
// extends must come first, implements comes second
class Sub extends Base /*implements A, B, C */{
  // Zero explicit constructors?
  // Compiler generates
//  Sub() {
//    super();
//  }
  void doOtherStuff() {
    System.out.println("doOtherStuff");
  }
}

public class Ex1 {
  public static void main(String[] args) {
    Sub s = new Sub();
    s.doOtherStuff();
  }
}
