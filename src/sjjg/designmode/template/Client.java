package sjjg.designmode.template;

import main.designmode.template.PeanutSoyaMilk;
import main.designmode.template.RedBeanSoyaMilk;
import main.designmode.template.SoyaMilk;

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
	}

}
