package liskov;

class Sub extends Base {
//  @Override
//  void doBaseStuff() {
//    System.out.println("doSubStuff");
//  }

  void doOtherStuff() {
    System.out.println("doOtherStuff");
  }
}
//  In the Base and Sub classes, which are true in isolation?
//   F A) doBaseStuff in Base can be marked public without causing errors
//   T B) doBaseStuff in Base can be marked private without causing errors
//   T C) doBaseStuff in Sub can be marked public without causing errors
//   T D) doBaseStuff in Sub can be marked protected without causing errors
//   F E) doBaseStuff in Sub can be marked private without causing errors
public class Ex1 {
}
