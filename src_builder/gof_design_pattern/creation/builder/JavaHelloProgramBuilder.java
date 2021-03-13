package gof_design_pattern.creation.builder;

public class JavaHelloProgramBuilder implements ProgramBuilder {

	public JavaHelloProgramBuilder() {
	}

	public String hello() {
		StringBuffer bf = new StringBuffer();
		bf.append("public class Hello {");
		bf.append(System.lineSeparator());
		bf.append("public static void main(String[] args) {");
		bf.append(System.lineSeparator());
		bf.append("System.out.println(\"Hello\")");
		bf.append(System.lineSeparator());
		bf.append("}");
		bf.append(System.lineSeparator());
		bf.append("}");
		bf.append(System.lineSeparator());
		return bf.toString();
	}
}
