package gof_design_pattern.behavioral.chain.of.respoinsibility;

public class Main {
	public static void main(String[] args) {
		Handler handler = Chain.getHandlerChain();
		handler.process("+");
		handler.process("-");
		handler.process("*");
	}
}
