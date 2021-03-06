package org.jnario.feature.tests.integration;

import org.jnario.jnario.test.util.FeatureExecutor;
import org.jnario.lib.JnarioIterableExtensions;
import org.jnario.lib.StepArguments;
import org.jnario.runner.FeatureRunner;
import org.jnario.runner.Named;
import org.jnario.runner.Order;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(FeatureRunner.class)
@Named("Scenario: Access a variable referencing a variable from background step")
@SuppressWarnings("all")
public class AccessOfVariablesFeatureAccessAVariableReferencingAVariableFromBackgroundStep {
  @Test
  @Order(0)
  @Named("When I reference a variable from the background")
  public void whenIReferenceAVariableFromTheBackground() {
    StepArguments _stepArguments = new StepArguments("package bootstrap5\nFeature: Variable test\n\tBackground:\n\t\tint x\n\t\tGiven some variable\n\t\t\tx = 3\n\tScenario: Some scenario\n\t\t\tint y\n\t\t\tWhen assigning the variable\n\t\t\t\ty = x\n\t\t\tThen it should be accessible\n\t\t\t\ty => 3\n\t\t\t");
    final StepArguments args = _stepArguments;
    String _first = JnarioIterableExtensions.<String>first(args);
    this.jnarioFile = _first;
  }
  
  @Test
  @Order(1)
  @Named("Then it should execute successfully")
  public void thenItShouldExecuteSuccessfully() {
    FeatureExecutor.isSuccessful(this.jnarioFile);
  }
  
  CharSequence jnarioFile;
}
