package sjjg.designmode.command;

import main.designmode.command.Command;
import main.designmode.command.TVReceiver;

public class TVOnCommand implements Command {

	// 聚合TVReceiver

	main.designmode.command.TVReceiver tv;

	// 构造器
	public TVOnCommand(TVReceiver tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		// 调用接收者的方法
		tv.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		// 调用接收者的方法
		tv.off();
	}
}
