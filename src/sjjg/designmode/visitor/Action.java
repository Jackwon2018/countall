package sjjg.designmode.visitor;

import main.designmode.visitor.Man;
import main.designmode.visitor.Woman;

public abstract class Action {
	
	//�õ����� �Ĳ���
	public abstract void getManResult(Man man);
	
	//�õ�Ů�� ����
	public abstract void getWomanResult(Woman woman);
}
