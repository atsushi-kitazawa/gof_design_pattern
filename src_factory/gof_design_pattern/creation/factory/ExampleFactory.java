package gof_design_pattern.creation.factory;

public class ExampleFactory implements Factory {

	public Example createExample(String example) {
		Example ret;
		switch (example) {
		case "ExampleA":
			ret = new ExampleA();
			break;
		case "ExampleB":
			ret = new ExampleB();
			break;
		default:
			// default ExampleA.
			ret = new ExampleA();
			break;
		}
		return ret;
	}
}