package sjjg.designmode.visitor;

import main.designmode.visitor.Action;
import main.designmode.visitor.Man;
import main.designmode.visitor.Woman;

public class Wait extends Action {

	@Override
	public void getManResult(Man man) {
		// TODO Auto-generated method stub
		System.out.println(" ���˸��������Ǹø��ִ��� ..");
	}

	@Override
	public void getWomanResult(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println(" Ů�˸��������Ǹø��ִ��� ..");
	}

}
