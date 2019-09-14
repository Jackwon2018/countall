package sjjg.designmode.memento.theory;

import main.designmode.memento.theory.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	
	//��List �����л��кܶ�ı���¼����
	private List<main.designmode.memento.theory.Memento> mementoList = new ArrayList<main.designmode.memento.theory.Memento>();
	
	public void add(main.designmode.memento.theory.Memento memento) {
		mementoList.add(memento);
	}
	
	//��ȡ����index��Originator �� ����¼����(������״̬)
	public Memento get(int index) {
		return mementoList.get(index);
	}
}
