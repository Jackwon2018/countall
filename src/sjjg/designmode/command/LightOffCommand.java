package sjjg.designmode.command;

import main.designmode.command.Command;
import main.designmode.command.LightReceiver;

public class LightOffCommand implements Command {

	// �ۺ�LightReceiver

	main.designmode.command.LightReceiver light;

	// ������
	public LightOffCommand(LightReceiver light) {
			super();
			this.light = light;
		}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		// ���ý����ߵķ���
		light.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		// ���ý����ߵķ���
		light.on();
	}
}
