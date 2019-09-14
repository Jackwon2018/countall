package sjjg.designmode.strategy.improve;

import main.designmode.strategy.improve.NoFlyBehavior;
import main.designmode.strategy.improve.PekingDuck;
import main.designmode.strategy.improve.ToyDuck;
import main.designmode.strategy.improve.WildDuck;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WildDuck wildDuck = new WildDuck();
		wildDuck.fly();//
		
		ToyDuck toyDuck = new ToyDuck();
		toyDuck.fly();
		
		PekingDuck pekingDuck = new PekingDuck();
		pekingDuck.fly();
		
		//��̬�ı�ĳ���������Ϊ, ����Ѽ ���ܷ�
		pekingDuck.setFlyBehavior(new NoFlyBehavior());
		System.out.println("����Ѽ��ʵ�ʷ�������");
		pekingDuck.fly();
	}

}
