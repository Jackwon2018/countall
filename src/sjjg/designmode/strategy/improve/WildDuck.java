package sjjg.designmode.strategy.improve;

import main.designmode.strategy.improve.Duck;
import main.designmode.strategy.improve.GoodFlyBehavior;

public class WildDuck extends Duck {

	
	//������������FlyBehavor �Ķ���
	public  WildDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new GoodFlyBehavior();
	}
	
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println(" ����ҰѼ ");
	}

}
