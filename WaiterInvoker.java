package minglingmoshi;

import java.util.ArrayList;

public class WaiterInvoker {
	private ArrayList<Command> commands;
	public WaiterInvoker() {
		commands=new ArrayList<Command>();	
	}
	public void setcommand(Command cmd) {
		commands.add(cmd);
	}
	public void orderup() {
		System.out.println("ÓÐ¶©µ¥£¡");
		for(Command cmd:commands) {
			if(cmd!=null)
				cmd.execute();
		}
	}
	
}
