package gof_design_pattern.behavioral.chain.of.respoinsibility;

public class AddHandler implements Handler {

	private static final String OPERATOR = "+";
	
	private Handler nextHandler;
	
	public AddHandler(Handler handler) {
		this.nextHandler = handler;
	}
	public void process(String calc) {
		if(OPERATOR.equals(calc)) {
			System.out.println("AddHandler");
		} else {
			nextHandler.process(calc);
		}
	}
}
