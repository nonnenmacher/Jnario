package org.jnario.feature.tests.integration;

import org.hamcrest.StringDescription;
import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.Should;
import org.jnario.lib.StepArguments;
import org.jnario.lib.StringConversions;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.Result;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Referencing steps with different keyword")
@SuppressWarnings("all")
public class ReferencesForStepsFeatureReferencingStepsWithDifferentKeyword {
  @Test
  @Order(0)
  @Named("When I have a scenario with reused steps with different keywords that throw an exception")
  public void whenIHaveAScenarioWithReusedStepsWithDifferentKeywordsThatThrowAnException() {
    StepArguments _stepArguments = new StepArguments("package bootstrap\nFeature: Test\n\tScenario: TestScenario 1\n\t\tGiven step\n\t\t\tthrow new RuntimeException()\n\t\t\n\tScenario: TestScenario 2\n\t\tWhen step\n\t\t\t");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Named("Then the number of failures should be \\\"2\\\"")
  public void thenTheNumberOfFailuresShouldBe2() {
    StepArguments _stepArguments = new StepArguments("2");
    final StepArguments args = _stepArguments;
    Result _run = FeatureExecutor.run(this.jnarioFile);
    int _failureCount = _run.getFailureCount();
    String _first = JnarioIterableExtensions.<String>first(args);
    int _int = StringConversions.toInt(_first);
    boolean _doubleArrow = Should.operator_doubleArrow(Integer.valueOf(_failureCount), Integer.valueOf(_int));
    Assert.assertTrue("\nExpected  but"
     + "\n      is " + new StringDescription().appendValue(Integer.valueOf(_failureCount)).toString() + "\n", _doubleArrow);
    
  }
  
  CharSequence jnarioFile;
}
