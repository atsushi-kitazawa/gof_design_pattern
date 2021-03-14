package gof_design_pattern.behavioral.mediator;

public class Main {
	public static void main(String[] args) {
		ConcreteMediator m = new ConcreteMediator();
		Colleague1 c1 = new Colleague1(m);
		Colleague2 c2 = new Colleague2(m);
		m.setC1(c1);
		m.setC2(c2);

		c1.process();
		c2.process();
	}
}
