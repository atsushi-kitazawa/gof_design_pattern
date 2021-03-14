package gof_design_pattern.behavioral.command;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TaskCommand implements Command {

	private TaskReceiver rec = new TaskReceiver();

	private List<String> task = new ArrayList<>();
	private List<String> result = new ArrayList<>();

	public TaskCommand() {
		// initialize task list.
		task.add("1 + 1");
		task.add("2 + 2");
		task.add("3 + 3");
		task.add("4 + 4");
		task.add("5 + 5");
	}

	@Override
	public void execute() {
		for (String calc : task) {
			result.add(process(calc));
			rec.receive(result.size());
			sleep();
		}
	}

	public TaskReceiver receiver() {
		return rec;
	}

	private String process(String calc) {
		String[] c = calc.split(" ");
		int left = Integer.parseInt(c[0]);
		String operator = c[1];
		int right = Integer.parseInt(c[2]);

		String result;
		switch (operator) {
		case "+":
			result = Integer.toString(left + right);
			break;
		case "-":
			result = Integer.toString(left - right);
			break;
		default:
			result = "0";
			break;
		}
		return result;
	}

	private void sleep() {
		int time = new Random().nextInt(10);
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
