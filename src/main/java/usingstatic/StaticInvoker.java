package usingstatic;

class Y {
  static String sayHi() { return "Y-Hello"; }
  String sayHi2() { return "Y-Hello2"; }
}
class Z extends Y {
  static String sayHi() { return "Z-Hello"; } // hiding, or shadowing
  String sayHi2() { return "Z-Hello2"; }
  void doSomething() {
    System.out.println(Y.sayHi());
  }
}
public class StaticInvoker {
  public static void main(String[] args) {
//    Y y = new Z();
//    var y = new Z();
    var y = new Y();
    System.out.println(y.sayHi() + ", " + y.sayHi2());
//    System.out.println(((Y)null).sayHi() + ", " +y.sayHi2());
//    System.out.println(Y.sayHi() + ", " + y.sayHi2());
  }
}

class Date {
  int day, month, year;

  public Date(int day, int month, int year) {
    this.day = day;
    this.month = month;
    this.year = year;
  }
}
