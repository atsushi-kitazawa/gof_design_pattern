package gof_design_pattern.behavioral.mediator;

public class ConcreteMediator implements Mediator {

	private Colleague1 c1;
	private Colleague2 c2;

	@Override
	public void mediate(Colleague c) {
		if (c instanceof Colleague1) {
			c2.action();
		} else if (c instanceof Colleague2) {
			c1.action();
		} else {
			System.err.println("no support collegue.");
		}
	}

	public void setC1(Colleague1 c) {
		this.c1 = c;
	}

	public void setC2(Colleague2 c) {
		this.c2 = c;
	}
}
