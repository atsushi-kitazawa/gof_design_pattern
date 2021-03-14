package gof_design_pattern.behavioral.command;

public class TaskReceiver {

	private int progress = 0;
	
	public void receive(int progress) {
		this.progress = progress;
	}
	
	public int getProgress() {
		return progress;
	}
}
