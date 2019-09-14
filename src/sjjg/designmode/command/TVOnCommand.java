package sjjg.designmode.command;

import main.designmode.command.Command;
import main.designmode.command.TVReceiver;

public class TVOnCommand implements Command {

	// �ۺ�TVReceiver

	main.designmode.command.TVReceiver tv;

	// ������
	public TVOnCommand(TVReceiver tv) {
		super();
		this.tv = tv;
	}

	@Override
	public void execute() {
		// TODO Auto-generated method stub
		// ���ý����ߵķ���
		tv.on();
	}

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		// ���ý����ߵķ���
		tv.off();
	}
}
