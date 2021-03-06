package org.jnario.spec.tests.unit.naming;

import java.util.ArrayList;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;
import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.Query;
import org.jnario.lib.Should;
import org.jnario.runner.ExampleGroupRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.jnario.runner.Subject;
import org.jnario.spec.naming.ExampleNameProvider;
import org.jnario.spec.spec.Before;
import org.jnario.spec.tests.unit.naming.ExampleNameProviderSpec;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@SuppressWarnings("all")
@RunWith(ExampleGroupRunner.class)
@Named("toMethodName[Before]")
public class ExampleNameProviderToMethodNameBeforeSpec extends ExampleNameProviderSpec {
  @Subject
  public ExampleNameProvider subject;
  
  @Test
  @Named("should convert before description to camel case starting in lowercase")
  @Order(14)
  public void _shouldConvertBeforeDescriptionToCamelCaseStartingInLowercase() throws Exception {
    ArrayList<String> _newArrayList = CollectionLiterals.<String>newArrayList(
      "before \'my example\'", 
      "before \'my\nexample\'", 
      "before \'my\texample\'", 
      "before \'my_example\'");
    final Procedure1<String> _function = new Procedure1<String>() {
        public void apply(final String it) {
          String _firstMethodName = ExampleNameProviderToMethodNameBeforeSpec.this.firstMethodName(it);
          boolean _doubleArrow = Should.operator_doubleArrow(_firstMethodName, "_myExample");
          Assert.assertTrue("\nExpected firstMethodName => \'_myExample\' but"
           + "\n     firstMethodName is " + new StringDescription().appendValue(_firstMethodName).toString() + "\n", _doubleArrow);
          
        }
      };
    IterableExtensions.<String>forEach(_newArrayList, _function);
  }
  
  @Test
  @Named("should use before as default name")
  @Order(15)
  public void _shouldUseBeforeAsDefaultName() throws Exception {
    String _firstMethodName = this.firstMethodName("before{}");
    boolean _doubleArrow = Should.operator_doubleArrow(_firstMethodName, "before");
    Assert.assertTrue("\nExpected firstMethodName(\"before{}\") => \"before\" but"
     + "\n     firstMethodName(\"before{}\") is " + new StringDescription().appendValue(_firstMethodName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should enumerate befores without description")
  @Order(16)
  public void _shouldEnumerateBeforesWithoutDescription() throws Exception {
    String _secondMethodName = this.secondMethodName("before{}\r\n                 before{}");
    boolean _doubleArrow = Should.operator_doubleArrow(_secondMethodName, "before2");
    Assert.assertTrue("\nExpected secondMethodName(\"before{}\r\n                 before{}\") => \"before2\" but"
     + "\n     secondMethodName(\"before{}\r\n                 before{}\") is " + new StringDescription().appendValue(_secondMethodName).toString() + "\n", _doubleArrow);
    
  }
  
  @Test
  @Named("should escape invalid names")
  @Order(17)
  public void _shouldEscapeInvalidNames() throws Exception {
    String _firstMethodName = this.firstMethodName("before \'null\'{}");
    boolean _doubleArrow = Should.operator_doubleArrow(_firstMethodName, "_null");
    Assert.assertTrue("\nExpected firstMethodName(\"before \'null\'{}\") => \"_null\" but"
     + "\n     firstMethodName(\"before \'null\'{}\") is " + new StringDescription().appendValue(_firstMethodName).toString() + "\n", _doubleArrow);
    
  }
  
  public String firstMethodName(final String content) {
    String _xblockexpression = null;
    {
      String _plus = ("describe \'Context\'{" + content);
      final String contentWithContext = (_plus + "}");
      Query _parse = this.parse(contentWithContext);
      Before _first = _parse.<Before>first(Before.class);
      String _methodName = this.subject.toMethodName(_first);
      _xblockexpression = (_methodName);
    }
    return _xblockexpression;
  }
  
  public String secondMethodName(final String content) {
    String _xblockexpression = null;
    {
      String _plus = ("describe \'Context\'{" + content);
      final String contentWithContext = (_plus + "}");
      Query _parse = this.parse(contentWithContext);
      Before _second = _parse.<Before>second(Before.class);
      String _methodName = this.subject.toMethodName(_second);
      _xblockexpression = (_methodName);
    }
    return _xblockexpression;
  }
}
