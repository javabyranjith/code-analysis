package jbr.code.analysis;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 *
 * Static code analysis example with Checkstyle, Findbugs, PMD and SonarQube
 * 
 * @author Ranjith Sekar
 * @since 2018, 19 June
 *
 */
public class CalcTest {

  Calc calc;

  @Before
  public void setUp() throws Exception {
    calc = new Calc();
  }

  @After
  public void tearDown() throws Exception {
  }

  @Test
  public void testAdd() {
    Assert.assertEquals(8, calc.add(3, 5));
  }

  @Test
  public void testSub() {
    Assert.assertEquals(2, calc.sub(5, 3));
  }

  @Test
  public void testMul() {
    Assert.assertEquals(15, calc.mul(3, 5));
  }

  @Test
  public void testDiv() {
    Assert.assertEquals(4, calc.div(8, 2));
  }

}
