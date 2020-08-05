package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

@FunctionalInterface
interface Criterion<E> {
  boolean test(E s);
//  void doStuff();
}

class SmartStudentCriterion implements Criterion<Student> {
  public boolean test(Student s) {
    return s.getGrade() > 60;
  }
}

class EnthusiasticStudentCriterion implements Criterion<Student> {
  @Override
  public boolean test(Student s) {
    return s.getCourses().size() > 3;
  }
}

class LongStrings implements Criterion<String> {

  @Override
  public boolean test(String s) {
    return s.length() > 4;
  }
}

public class School {
  // "design pattern: Functor"
  public static <E, F> List<F> map(List<E> in, Function<E, F> op) {
    List<F> result = new ArrayList<>();
    for (E e : in) {
      result.add(op.apply(e));
    }
    return result;
  }

  public static <E> List<E> filter(Iterable<E> ls, Criterion<E> crit) {
    List<E> result = new ArrayList<>();
    for (E s : ls) {
      if (crit.test(s)) {
        result.add(s);
      }
    }
    return result;
  }

  //  public static List<Student> findEnthusiasticStudents(List<Student> ls, int threshold) {
//    List<Student> result = new ArrayList<>();
//    for (Student s : ls) {
//      if (s.getCourses().size() > threshold) {
//        result.add(s);
//      }
//    }
//    return result;
//  }
//
  public static <E> void showAll(List<E> ls) {
    for (E s : ls) {
      System.out.println("> " + s);
    }
    System.out.println("------------------------------");
  }

  public static void main(String[] args) {
    List<Student> roster = List.of(
        Student.of("Fred", 75, "Math", "Physics"),
        Student.of("Jim", 57, "Art"),
        Student.of("Sheila", 92, "Math", "Physics", "Astrophysics", "Quantum Mechanics")
    );

    showAll(roster);
//    showAll(findSmartStudents(roster, 60));
//    showAll(findEnthusiasticStudents(roster, 2));
    showAll(filter(roster, new SmartStudentCriterion()));
    showAll(filter(roster, new EnthusiasticStudentCriterion()));

//    showAll(filter(roster, /* new ??? implements Criterion<Student> */
//        /* We must be satisfied ONLY defining a SINGLE method in this object */
//        // THEREFORE, the abstract thing we're providing must only have ONE abstract method
//        // RULE: This argument (context) MUST be an interface that declares EXACTLY ONE
//        // abstract method
//        (Student s) -> {
//          return s.getGrade() < 80;
//        }
//    ));
//
    showAll(filter(roster, (Student s) -> { return s.getGrade() < 80; }));
    // if argument types are unambiguous you can leave *all* of them out
    showAll(filter(roster, (s) -> { return s.getGrade() < 80; }));
    // or if you want, you can use var for ALL of them. (Java 10+)
    showAll(filter(roster, (@Deprecated var s) -> { return s.getGrade() < 80; }));
    // IFF you have exactly one argument, and you do NOT specify the type...
    // can leave out parens
    showAll(filter(roster, s -> { return s.getGrade() < 80; }));
    // IFF function body ONLY returns one expression then can use "expression lambda"
    // i.e. shortcut the body:
    showAll(filter(roster, s -> s.getGrade() < 80));

    showAll(filter(List.of("Fred", "Jim", "Sheila"), new LongStrings()));

    showAll(map(roster, s -> "Student " + s.getName() + " has a grade of " + s.getGrade()));
  }
}
