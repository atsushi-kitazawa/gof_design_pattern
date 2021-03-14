package gof_design_pattern.behavioral.mediator;

public class Colleague2 implements Colleague {

	Mediator mediator;

	public Colleague2(Mediator m) {
		this.mediator = m;
	}

	public void process() {
		System.out.println("colleague2 process.");
		mediator.mediate(this);
	}

	public void action() {
		System.out.println("colleague2 action.");
	}
}
