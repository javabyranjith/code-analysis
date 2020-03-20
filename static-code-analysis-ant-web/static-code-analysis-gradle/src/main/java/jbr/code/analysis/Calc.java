package jbr.code.analysis;

import java.util.ArrayList;

/**
 *
 * Static code analysis example with Checkstyle, Findbugs, PMD and SonarQube
 * 
 * @author Ranjith Sekar
 * @since 2018, 19 June
 *
 */
public class Calc {

  String name = null;

  public int add(int a, int b) {
    return a + b;
  }

  public int sub(int a, int b) {
    return a - b;
  }

  public int mul(int a, int b) {
    String s = null;
    if (s != null) {
      System.out.println("Non Null");
    }
    return a * b;
  }

  public int div(int a, int b) {

    int c = 0;
    if (c == 2) {
      System.out.println("c is 2");
    }

    return a / b;
  }

}
