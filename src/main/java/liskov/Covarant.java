package liskov;

class Base2 {
  Base doBaseStuff() {
    return null;
  }

  long getNum() {
    return 3L;
  }
}

class Sub2 extends Base2 {
  @Override
  // Covariant Return type
  Sub doBaseStuff() {
    return null;
  }

  // Covariance NOT ALLOWED for primitives
  /*int*/ long getNum() {
    return 3;
  }
}
public class Covarant {

}
