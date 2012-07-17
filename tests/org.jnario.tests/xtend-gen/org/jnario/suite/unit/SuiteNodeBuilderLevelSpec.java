package org.jnario.suite.unit;

import org.hamcrest.StringDescription;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.suite.jvmmodel.SuiteNodeBuilder;
import org.jnario.suite.suite.Suite;
import org.jnario.suite.unit.SuiteNodeBuilderSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("level")
public class SuiteNodeBuilderLevelSpec extends SuiteNodeBuilderSpec {
  @Subject
  public SuiteNodeBuilder subject;
  
  @Test
  @Named("level[\\\"-\\\"]        => 1")
  @Order(99)
  public void level1() throws Exception {
    int _level = this.level("#");
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_level), Integer.valueOf(1));
    Assert.assertTrue("\nExpected level(\"#\")        => 1 but"
     + "\n     level(\"#\") is " + new StringDescription().appendValue(Integer.valueOf(_level)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("level[\\\"-Suite\\\"]   => 1")
  @Order(99)
  public void levelSuite1() throws Exception {
    int _level = this.level("#Suite");
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_level), Integer.valueOf(1));
    Assert.assertTrue("\nExpected level(\"#Suite\")   => 1 but"
     + "\n     level(\"#Suite\") is " + new StringDescription().appendValue(Integer.valueOf(_level)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("level[\\\"--Suite\\\"]  => 2")
  @Order(99)
  public void levelSuite2() throws Exception {
    int _level = this.level("##Suite");
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_level), Integer.valueOf(2));
    Assert.assertTrue("\nExpected level(\"##Suite\")  => 2 but"
     + "\n     level(\"##Suite\") is " + new StringDescription().appendValue(Integer.valueOf(_level)).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("level[\\\"---Suite\\\"] => 3")
  @Order(99)
  public void levelSuite3() throws Exception {
    int _level = this.level("###Suite");
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_level), Integer.valueOf(3));
    Assert.assertTrue("\nExpected level(\"###Suite\") => 3 but"
     + "\n     level(\"###Suite\") is " + new StringDescription().appendValue(Integer.valueOf(_level)).toString() + "\n", _doubleArrow);
    
  }
  
  public int level(final String name) {
    Suite _suite = this.suite(name);
    int _level = this.subject.level(_suite);
    return _level;
  }
}
