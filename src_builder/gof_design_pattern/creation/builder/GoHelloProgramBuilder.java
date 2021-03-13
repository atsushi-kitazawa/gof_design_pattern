package gof_design_pattern.creation.builder;

public class GoHelloProgramBuilder implements ProgramBuilder {
	
	public GoHelloProgramBuilder() {
	}
	
	@Override
	public String hello() {
		StringBuffer bf = new StringBuffer();
		bf.append("package main");
		bf.append(System.lineSeparator());
		bf.append("import ( \"fmt\" )");
		bf.append(System.lineSeparator());
		bf.append("func main() {");
		bf.append(System.lineSeparator());
		bf.append("fmt.Println(\"Hello\")");
		bf.append(System.lineSeparator());
		bf.append("}");
		bf.append(System.lineSeparator());
		return bf.toString();
	}
}
