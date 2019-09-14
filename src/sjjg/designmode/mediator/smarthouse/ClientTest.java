package sjjg.designmode.mediator.smarthouse;

import main.designmode.mediator.smarthouse.Alarm;
import main.designmode.mediator.smarthouse.CoffeeMachine;
import main.designmode.mediator.smarthouse.ConcreteMediator;
import main.designmode.mediator.smarthouse.Curtains;
import main.designmode.mediator.smarthouse.Mediator;
import main.designmode.mediator.smarthouse.TV;

public class ClientTest {

	public static void main(String[] args) {
		//����һ���н��߶���
		Mediator mediator = new ConcreteMediator();
		
		//����Alarm ���Ҽ��뵽  ConcreteMediator �����HashMap
		main.designmode.mediator.smarthouse.Alarm alarm = new Alarm(mediator, "alarm");
		
		//������CoffeeMachine ���󣬲�  �Ҽ��뵽  ConcreteMediator �����HashMap
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,
				"coffeeMachine");
		
		//���� Curtains , ��  �Ҽ��뵽  ConcreteMediator �����HashMap
		main.designmode.mediator.smarthouse.Curtains curtains = new Curtains(mediator, "curtains");
		main.designmode.mediator.smarthouse.TV tV = new TV(mediator, "TV");
		
		//�����ӷ�����Ϣ
		alarm.SendAlarm(0);
		coffeeMachine.FinishCoffee();
		alarm.SendAlarm(1);
	}

}
