package gof_design_pattern.behavioral.chain.of.respoinsibility;

public class SubtructHandler implements Handler {

	private static final String OPERATOR = "-";

	private Handler nextHandler;

	public SubtructHandler(Handler handler) {
		this.nextHandler = handler;
	}

	public void process(String calc) {
		if (OPERATOR.equals(calc)) {
			System.out.println("SubtructHandler");
		} else {
			nextHandler.process(calc);
		}
	}
}