package usingstatic;

public interface AnInterface {
  static final int A_VALUE = 100;
  static void doStuff() {}
}

class UseIt {
  public void doStuff(AnInterface a) {
    int v = a.A_VALUE;
    AnInterface.doStuff();
//    a.doStuff();
  }
}