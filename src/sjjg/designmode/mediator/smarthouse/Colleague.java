package sjjg.designmode.mediator.smarthouse;

import main.designmode.mediator.smarthouse.Mediator;

//同事抽象类
public abstract class Colleague {
	private main.designmode.mediator.smarthouse.Mediator mediator;
	public String name;

	public Colleague(main.designmode.mediator.smarthouse.Mediator mediator, String name) {

		this.mediator = mediator;
		this.name = name;

	}

	public Mediator GetMediator() {
		return this.mediator;
	}

	public abstract void SendMessage(int stateChange);
}
