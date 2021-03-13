package gof_design_pattern.creation.abstruct.factory;

import gof_design_pattern.creation.abstruct.factory.example.ExampleA;
import gof_design_pattern.creation.abstruct.factory.example.ExampleB;
import gof_design_pattern.creation.abstruct.factory.example.Pattern2ExampleA;
import gof_design_pattern.creation.abstruct.factory.example.Pattern2ExampleB;

public class Pattern2Factory implements Factory {

	@Override
	public ExampleA createExampleA() {
		return new Pattern2ExampleA();
	}

	@Override
	public ExampleB createExampleB() {
		return new Pattern2ExampleB();
	}
}
