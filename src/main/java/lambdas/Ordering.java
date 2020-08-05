package lambdas;

import java.util.ArrayList;
import java.util.List;

public class Ordering {
  public static void main(String[] args) {
    List<Student> roster = new ArrayList<>(List.of(
        Student.of("Fred", 75, "Math", "Physics"),
        Student.of("Jim", 57, "Art"),
        Student.of("Sheila", 92, "Math", "Physics", "Astrophysics", "Quantum Mechanics")
    ));

//    Collections.sort(list, sorting behavior) // Pre java 8
    roster.forEach(s -> System.out.println("> " + s));
    System.out.println("----------------");
    roster.sort((s1, s2) -> s1.getGrade() - s2.getGrade());
    roster.forEach(s -> System.out.println(">> " + s));
    System.out.println("----------------");

    roster.sort((s1, s2) -> Integer.compare(s2.getCourses().size(), s1.getCourses().size()));
    roster.forEach(s -> System.out.println(">> " + s));
    System.out.println("----------------");

    List<Double> ld = new ArrayList<>(List.of(4.3D, 4.1D, 4.7D));
    ld.sort((d1, d2) -> Double.compare(d1, d2));

  }
}
