package usingvar;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Q2 {
  // method arguments CANNOT be var (except for lambdas)
  public static void doStuff(/*var */int x) { // line n1 var NOT INITIALIZED
    x += 100;
    System.out.println("x is " + x);
  }

  public static void doWithMany(int [] ia) {

  }

  public static Map<String, List<Long>> getMap() {
    return null;
  }

  public static void main(String[] args) {
    doStuff(99); // line n2
//    doStuff("Hello "); // line n3

    var var = "var";

    for (var i = 0; i < 10; i++)
      ;

//    try {
//      if (Math.random() > 0.5) throw new SQLException();
//    } catch (var ex) { // Ambiguous SQL?? NPE OutOfMemoryError
//
//    }

    // CANNOT use var for the "base type" of an array;
    // need UNAMBIGUOUS initialization
    Object [] ia = {0,1,2,3};
//    doWithMany({0,1,2,3}); // NOT allowed
    doWithMany(new int[]{0,1,2,3});

//    var many = {0, 1, 2, 3};
//    var many = (int [])({0, 1, 2, 3});
//    var [] many2 = new int []{0, 1, 2, 3};
    var many = new int []{0, 1, 2, 3};

    // What's it for
    // laziness?
//    Map<String, List<Long>> msll = getMap();
    var msll = getMap(); // probably bad ??

    // *DEVELOPING* "fluent" oode
    var x = Stream.of("Fred", "Jim", "Sheila")
        .map(s -> s.length())
        .map(i -> "The length was " + i)
//    .forEach(v -> System.out.println(v))
        ;
  }
}
