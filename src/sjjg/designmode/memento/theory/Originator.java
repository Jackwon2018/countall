package sjjg.designmode.memento.theory;

import main.designmode.memento.theory.Memento;

public class Originator {

	private String state;//״̬��Ϣ

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//��дһ�����������Ա���һ��״̬���� Memento
	//��˱�дһ������������ Memento
	public main.designmode.memento.theory.Memento saveStateMemento() {
		return new main.designmode.memento.theory.Memento(state);
	}
	
	//ͨ������¼���󣬻ָ�״̬
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
}
