package lambdas;

import java.util.List;
import java.util.function.Predicate;

public class Student {
  private String name;
  private int grade;
  private List<String> courses;

  private Student(String name, int grade, List<String> courses) {
    this.name = name;
    this.grade = grade;
    this.courses = courses;
  }

  public static Student of(String name, int grade, String ... courses) {
    return new Student(name, grade, List.of(courses));
  }

  public String getName() {
    return name;
  }

  public int getGrade() {
    return grade;
  }

  public List<String> getCourses() {
    return courses;
  }

  @Override
  public String toString() {
    return "Student{" +
        "name='" + name + '\'' +
        ", grade=" + grade +
        ", courses=" + courses +
        '}';
  }

  public static Criterion<Student> getSmartCriterion(int threshold) {
//    threshold++;
    return s -> s.getGrade() > threshold; // Java's closures must be final or effectively final
  }
}
