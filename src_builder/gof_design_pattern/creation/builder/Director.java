package gof_design_pattern.creation.builder;

public class Director {

	ProgramBuilder builder;
	
	public Director(ProgramBuilder builder) {
		this.builder = builder;
	}
	
	public String construct() {
		return builder.hello();
	}
}
