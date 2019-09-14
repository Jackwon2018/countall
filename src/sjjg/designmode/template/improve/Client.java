package sjjg.designmode.template.improve;

import main.designmode.template.improve.PeanutSoyaMilk;
import main.designmode.template.improve.PureSoyaMilk;
import main.designmode.template.improve.RedBeanSoyaMilk;
import main.designmode.template.improve.SoyaMilk;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//�����춹����
		
		System.out.println("----�����춹����----");
		SoyaMilk redBeanSoyaMilk = new RedBeanSoyaMilk();
		redBeanSoyaMilk.make();
		
		System.out.println("----������������----");
		SoyaMilk peanutSoyaMilk = new PeanutSoyaMilk();
		peanutSoyaMilk.make();
		
		System.out.println("----����������----");
		SoyaMilk pureSoyaMilk = new PureSoyaMilk();
		pureSoyaMilk.make();
	}

}
