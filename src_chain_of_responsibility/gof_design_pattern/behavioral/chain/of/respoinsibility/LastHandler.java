package gof_design_pattern.behavioral.chain.of.respoinsibility;

public class LastHandler implements Handler {

	@Override
	public void process(String calc) {
		System.out.println("LastHander");
	}
}
