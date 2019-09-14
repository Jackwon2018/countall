package sjjg.designmode.mediator.smarthouse;

import main.designmode.mediator.smarthouse.Alarm;
import main.designmode.mediator.smarthouse.CoffeeMachine;
import main.designmode.mediator.smarthouse.Colleague;
import main.designmode.mediator.smarthouse.Curtains;
import main.designmode.mediator.smarthouse.Mediator;
import main.designmode.mediator.smarthouse.TV;

import java.util.HashMap;

//������н�����
public class ConcreteMediator extends Mediator {
	//���ϣ��������е�ͬ�¶���
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

	//�����н��ߵĺ��ķ���
	//1. ���ݵõ���Ϣ����ɶ�Ӧ����
	//2. �н��������������Э�����������ͬ�¶����������
	@Override
	public void GetMessage(int stateChange, String colleagueName) {
		// TODO Auto-generated method stub

		//�������ӷ�������Ϣ
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

		} else if (colleagueMap.get(colleagueName) instanceof TV) {//���TV������Ϣ

		} else if (colleagueMap.get(colleagueName) instanceof Curtains) {
			//������Դ�����������Ϣ�����ﴦ��...
		}

	}

	@Override
	public void SendMessage() {
		// TODO Auto-generated method stub

	}

}
