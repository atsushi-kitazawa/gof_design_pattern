package gof_design_pattern.creation.abstruct.factory;

import gof_design_pattern.creation.abstruct.factory.example.ExampleA;
import gof_design_pattern.creation.abstruct.factory.example.ExampleB;
import gof_design_pattern.creation.abstruct.factory.example.Pattern1ExampleA;
import gof_design_pattern.creation.abstruct.factory.example.Pattern1ExampleB;

public class Pattern1Factory implements Factory {

	@Override
	public ExampleA createExampleA() {
		return new Pattern1ExampleA();
	}

	@Override
	public ExampleB createExampleB() {
		return new Pattern1ExampleB();
	}
}
