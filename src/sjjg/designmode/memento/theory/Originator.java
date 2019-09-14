package sjjg.designmode.memento.theory;

import main.designmode.memento.theory.Memento;

public class Originator {

	private String state;//状态信息

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}
	
	//编写一个方法，可以保存一个状态对象 Memento
	//因此编写一个方法，返回 Memento
	public main.designmode.memento.theory.Memento saveStateMemento() {
		return new main.designmode.memento.theory.Memento(state);
	}
	
	//通过备忘录对象，恢复状态
	public void getStateFromMemento(Memento memento) {
		state = memento.getState();
	}
}
