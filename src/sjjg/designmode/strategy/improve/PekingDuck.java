package sjjg.designmode.strategy.improve;

import main.designmode.strategy.improve.BadFlyBehavior;
import main.designmode.strategy.improve.Duck;

public class PekingDuck extends Duck {

	
	//���籱��Ѽ���Է��裬���Ƿ��輼��һ��
	public PekingDuck() {
		// TODO Auto-generated constructor stub
		flyBehavior = new BadFlyBehavior();
		
	}
	
	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("~~����Ѽ~~~");
	}
	
	

}
