package usingvar;

import java.util.HashMap;
import java.util.Map;

public class Ex1 {
  // private var count = 100; // Stylistically, things with "wide scope"

  public static void main(String[] args) {
    Map<String, Long> msl = new HashMap<>();
    int x = 99;
    var y = 200; // Unambiguously "int",  Declaration MUST BE INITIALIZED
    y = 99;
    y = 100;
//    y = "Hello";
  }
}
