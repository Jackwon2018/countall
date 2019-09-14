package sjjg.designmode.mediator.smarthouse;

import main.designmode.mediator.smarthouse.Alarm;
import main.designmode.mediator.smarthouse.CoffeeMachine;
import main.designmode.mediator.smarthouse.Colleague;
import main.designmode.mediator.smarthouse.Curtains;
import main.designmode.mediator.smarthouse.Mediator;
import main.designmode.mediator.smarthouse.TV;

import java.util.HashMap;

//具体的中介者类
public class ConcreteMediator extends Mediator {
	//集合，放入所有的同事对象
	private HashMap<String, main.designmode.mediator.smarthouse.Colleague> colleagueMap;
	private HashMap<String, String> interMap;

	public ConcreteMediator() {
		colleagueMap = new HashMap<String, main.designmode.mediator.smarthouse.Colleague>();
		interMap = new HashMap<String, String>();
	}

	@Override
	public void Register(String colleagueName, Colleague colleague) {
		// TODO Auto-generated method stub
		colleagueMap.put(colleagueName, colleague);

		// TODO Auto-generated method stub

		if (colleague instanceof main.designmode.mediator.smarthouse.Alarm) {
			interMap.put("Alarm", colleagueName);
		} else if (colleague instanceof main.designmode.mediator.smarthouse.CoffeeMachine) {
			interMap.put("CoffeeMachine", colleagueName);
		} else if (colleague instanceof main.designmode.mediator.smarthouse.TV) {
			interMap.put("TV", colleagueName);
		} else if (colleague instanceof main.designmode.mediator.smarthouse.Curtains) {
			interMap.put("Curtains", colleagueName);
		}

	}

	//具体中介者的核心方法
	//1. 根据得到消息，完成对应任务
	//2. 中介者在这个方法，协调各个具体的同事对象，完成任务
	@Override
	public void GetMessage(int stateChange, String colleagueName) {
		// TODO Auto-generated method stub

		//处理闹钟发出的消息
		if (colleagueMap.get(colleagueName) instanceof Alarm) {
			if (stateChange == 0) {
				((main.designmode.mediator.smarthouse.CoffeeMachine) (colleagueMap.get(interMap
						.get("CoffeeMachine")))).StartCoffee();
				((main.designmode.mediator.smarthouse.TV) (colleagueMap.get(interMap.get("TV")))).StartTv();
			} else if (stateChange == 1) {
				((main.designmode.mediator.smarthouse.TV) (colleagueMap.get(interMap.get("TV")))).StopTv();
			}

		} else if (colleagueMap.get(colleagueName) instanceof CoffeeMachine) {
			((main.designmode.mediator.smarthouse.Curtains) (colleagueMap.get(interMap.get("Curtains"))))
					.UpCurtains();

		} else if (colleagueMap.get(colleagueName) instanceof TV) {//如果TV发现消息

		} else if (colleagueMap.get(colleagueName) instanceof Curtains) {
			//如果是以窗帘发出的消息，这里处理...
		}

	}

	@Override
	public void SendMessage() {
		// TODO Auto-generated method stub

	}

}
