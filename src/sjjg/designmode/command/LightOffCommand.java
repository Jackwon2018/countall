package sjjg.designmode.command;

import main.designmode.command.Command;
import main.designmode.command.LightReceiver;

public class LightOffCommand implements Command {

	// 聚合LightReceiver

	main.designmode.command.LightReceiver light;

	// 构造器
	public LightOffCommand(LightReceiver light) {
			super();
			this.light = light;
		}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		// 调用接收者的方法
		light.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		// 调用接收者的方法
		light.on();
	}
}
