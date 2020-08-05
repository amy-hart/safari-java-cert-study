package lambdas;

import java.util.ArrayList;
import java.util.List;

public class School {
  public static List<Student> findSmartStudents(List<Student> ls) {
    List<Student> result = new ArrayList<>();
    for (Student s : ls) {
      if (s.getGrade() > 60) {
        result.add(s);
      }
    }
    return result;
  }
  public static void showAll(List<Student> ls) {
    for (Student s : ls) {
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
    showAll(findSmartStudents(roster));
  }
}
