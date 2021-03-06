package org.jnario.spec.tests.unit.naming;

import org.eclipse.xtext.xbase.XBlockExpression;
import org.eclipse.xtext.xbase.XExpression;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.StringDescription;
import org.jnario.Should;
import org.jnario.lib.ExampleTable;
import org.jnario.lib.ExampleTableIterators;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.spec.spec.Example;
import org.jnario.spec.tests.unit.naming.ExampleImplementationSpecExamples;
import org.jnario.spec.tests.unit.naming.ExampleSpec;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("implementation")
public class ExampleImplementationSpec extends ExampleSpec {
  @Before
  public void _initExampleImplementationSpecExamples() {
    examples = ExampleTable.create("examples", 
      java.util.Arrays.asList("example", "type"), 
      new ExampleImplementationSpecExamples(  java.util.Arrays.asList("\"fact \'with body\' {1}\"", "typeof(XBlockExpression)"), "fact \'with body\' {1}", XBlockExpression.class),
      new ExampleImplementationSpecExamples(  java.util.Arrays.asList("\"fact \'with code\' should be \'with code\'\"", "typeof(Should)"), "fact \'with code\' should be \'with code\'", Should.class)
    );
  }
  
  protected ExampleTable<ExampleImplementationSpecExamples> examples;
  
  @Test
  @Named("examples.forEach[example.parse.implementation should be instanceOf[type]]")
  @Order(1)
  public void _examplesForEachExampleParseImplementationShouldBeInstanceOfType() throws Exception {
    final Procedure1<ExampleImplementationSpecExamples> _function = new Procedure1<ExampleImplementationSpecExamples>() {
        public void apply(final ExampleImplementationSpecExamples it) {
          Example _parse = ExampleImplementationSpec.this.parse(it.example);
          XExpression _implementation = _parse.getImplementation();
          Matcher<Object> _instanceOf = CoreMatchers.instanceOf(it.type);
          boolean _should_be = org.jnario.lib.Should.<Object>should_be(_implementation, _instanceOf);
          Assert.assertTrue("\nExpected example.parse.implementation should be instanceOf(type) but"
           + "\n     example.parse.implementation is " + new StringDescription().appendValue(_implementation).toString()
           + "\n     example.parse is " + new StringDescription().appendValue(_parse).toString()
           + "\n     example is " + new StringDescription().appendValue(it.example).toString()
           + "\n     instanceOf(type) is " + new StringDescription().appendValue(_instanceOf).toString()
           + "\n     type is " + new StringDescription().appendValue(it.type).toString() + "\n", _should_be);
          
        }
      };
    ExampleTableIterators.<ExampleImplementationSpecExamples>forEach(this.examples, _function);
  }
}
