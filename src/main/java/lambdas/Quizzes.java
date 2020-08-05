package lambdas;

import java.lang.reflect.Method;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class Quizzes {
  public static void main(String[] args) {
//    Comparator<String> cs = s1, s2 -> s2.compareTo(s1);
//    Comparator<String> cs = (s1, s2) -> s2.compareTo(s1);
//    Comparator<String> cs = (var s1, String s2) -> s2.compareTo(s1);
//    Comparator<String> cs = (var s1, s2) -> s2.compareTo(s1);
//    Comparator<String> cs = (String s1, String s2) -> s2.compareTo(s1);
    Comparator<String> cs  = (String s1, String s2) -> s2.compareTo(s1);
    System.out.println(cs.getClass().getName());
    Class<?> cl = cs.getClass();
    Method [] ma = cl.getMethods();
    for (Method m : ma) {
      System.out.println("> " + m);
    }

//     = (s, t) -> s.length() - t.length();
//
//    Which are correct inserted in place of ????
//    A) BiFunction<String, String, Integer> f =
//        B) BiPredicate<String> f =
//        C) Comparator<String> f =
//        D) Supplier<String, Integer> f =
//        E) BinaryOperator<String> f =
  }
}
