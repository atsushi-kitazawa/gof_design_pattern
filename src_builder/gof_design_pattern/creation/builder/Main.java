package gof_design_pattern.creation.builder;

public class Main {
	public static void main(String[] args) {
		Director javaDirector = new Director(new JavaHelloProgramBuilder());
		System.out.println(javaDirector.construct());

		Director goDirector = new Director(new GoHelloProgramBuilder());
		System.out.println(goDirector.construct());
	}
}