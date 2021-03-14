package gof_design_pattern.behavioral.chain.of.respoinsibility;

public class Chain {
	
	public static Handler getHandlerChain() {
		return new AddHandler(new SubtructHandler(new LastHandler()));
	}
}
