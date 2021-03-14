package gof_design_pattern.behavioral.command;

public interface Command {

	public void execute();

	public TaskReceiver receiver();
}
