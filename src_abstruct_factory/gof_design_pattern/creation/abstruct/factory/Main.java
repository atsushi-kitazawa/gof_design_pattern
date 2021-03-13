package gof_design_pattern.creation.abstruct.factory;

import gof_design_pattern.creation.abstruct.factory.example.ExampleA;
import gof_design_pattern.creation.abstruct.factory.example.ExampleB;

public class Main {
	public static void main(String[] args) {
		Factory pattern1 = new Pattern1Factory();
		ExampleA a1 = pattern1.createExampleA();
		ExampleB b1 = pattern1.createExampleB();
		a1.example();
		b1.example();

		Factory pattern2 = new Pattern2Factory();
		ExampleA a2 = pattern2.createExampleA();
		ExampleB b2 = pattern2.createExampleB();
		a2.example();
		b2.example();
	}
}
