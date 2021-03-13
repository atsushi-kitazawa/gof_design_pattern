package gof_design_pattern.creation.abstruct.factory;

import gof_design_pattern.creation.abstruct.factory.example.ExampleA;
import gof_design_pattern.creation.abstruct.factory.example.ExampleB;

public interface Factory {

	public ExampleA createExampleA();

	public ExampleB createExampleB();
}
