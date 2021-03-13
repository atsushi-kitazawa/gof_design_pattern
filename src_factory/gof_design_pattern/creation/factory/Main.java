package gof_design_pattern.creation.factory;

public class Main {
	public static void main(String[] args) {
		Factory factory = new ExampleFactory();
		Example a = factory.createExample("ExampleA");
		a.example();
		Example b = factory.createExample("ExampleB");
		b.example();
	}
}
