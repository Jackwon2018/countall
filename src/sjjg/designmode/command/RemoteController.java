package sjjg.designmode.command;

import main.designmode.command.Command;
import main.designmode.command.NoCommand;

public class RemoteController {

	// �� ��ť����������
	main.designmode.command.Command[] onCommands;
	main.designmode.command.Command[] offCommands;

	// ִ�г���������
	main.designmode.command.Command undoCommand;

	// ����������ɶ԰�ť��ʼ��

	public RemoteController() {

		onCommands = new main.designmode.command.Command[5];
		offCommands = new main.designmode.command.Command[5];

		for (int i = 0; i < 5; i++) {
			onCommands[i] = new main.designmode.command.NoCommand();
			offCommands[i] = new NoCommand();
		}
	}

	// �����ǵİ�ť��������Ҫ������
	public void setCommand(int no, main.designmode.command.Command onCommand, Command offCommand) {
		onCommands[no] = onCommand;
		offCommands[no] = offCommand;
	}

	// ���¿���ť
	public void onButtonWasPushed(int no) { // no 0
		// �ҵ��㰴�µĿ��İ�ť�� �����ö�Ӧ����
		onCommands[no].execute();
		// ��¼��εĲ��������ڳ���
		undoCommand = onCommands[no];

	}

	// ���¿���ť
	public void offButtonWasPushed(int no) { // no 0
		// �ҵ��㰴�µĹصİ�ť�� �����ö�Ӧ����
		offCommands[no].execute();
		// ��¼��εĲ��������ڳ���
		undoCommand = offCommands[no];

	}
	
	// ���³�����ť
	public void undoButtonWasPushed() {
		undoCommand.undo();
	}

}
