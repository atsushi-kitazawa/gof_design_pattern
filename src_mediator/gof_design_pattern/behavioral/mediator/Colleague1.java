package gof_design_pattern.behavioral.mediator;

public class Colleague1 implements Colleague {
	
	Mediator mediator;
	
	public Colleague1(Mediator m) {
		this.mediator = m;
	}
	
	public void process() {
		System.out.println("colleague1 process.");
		mediator.mediate(this);
	}
	
	public void action() {
		System.out.println("colleague1 action.");
	}
}
