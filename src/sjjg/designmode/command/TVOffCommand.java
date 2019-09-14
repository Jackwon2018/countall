package sjjg.designmode.command;

import main.designmode.command.Command;
import main.designmode.command.TVReceiver;

public class TVOffCommand implements Command {

	// �ۺ�TVReceiver

	main.designmode.command.TVReceiver tv;

	// ������
	public TVOffCommand(TVReceiver tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		// ���ý����ߵķ���
		tv.off();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		// ���ý����ߵķ���
		tv.on();
	}
}
