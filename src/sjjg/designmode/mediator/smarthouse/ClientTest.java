package sjjg.designmode.mediator.smarthouse;

import main.designmode.mediator.smarthouse.Alarm;
import main.designmode.mediator.smarthouse.CoffeeMachine;
import main.designmode.mediator.smarthouse.ConcreteMediator;
import main.designmode.mediator.smarthouse.Curtains;
import main.designmode.mediator.smarthouse.Mediator;
import main.designmode.mediator.smarthouse.TV;

public class ClientTest {

	public static void main(String[] args) {
		//创建一个中介者对象
		Mediator mediator = new ConcreteMediator();
		
		//创建Alarm 并且加入到  ConcreteMediator 对象的HashMap
		main.designmode.mediator.smarthouse.Alarm alarm = new Alarm(mediator, "alarm");
		
		//创建了CoffeeMachine 对象，并  且加入到  ConcreteMediator 对象的HashMap
		CoffeeMachine coffeeMachine = new CoffeeMachine(mediator,
				"coffeeMachine");
		
		//创建 Curtains , 并  且加入到  ConcreteMediator 对象的HashMap
		main.designmode.mediator.smarthouse.Curtains curtains = new Curtains(mediator, "curtains");
		main.designmode.mediator.smarthouse.TV tV = new TV(mediator, "TV");
		
		//让闹钟发出消息
		alarm.SendAlarm(0);
		coffeeMachine.FinishCoffee();
		alarm.SendAlarm(1);
	}

}
