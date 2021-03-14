package gof_design_pattern.behavioral.command;

public class Main {
	public static void main(String[] args) {
		Command cmd = new TaskCommand();
		Thread run = new Thread(new Runnable() {
			@Override
			public void run() {
				cmd.execute();
			}
		});
		run.start();

		while (true) {
			TaskReceiver rec = cmd.receiver();
			if (rec.getProgress() == 5) {
				System.out.println("task finished.");
				break;
			} else {
				System.out.println("task processing. finished task count is "
						+ rec.getProgress());
			}
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
