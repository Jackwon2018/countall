package sjjg.designmode.uml.aggregation;

import main.designmode.uml.aggregation.Moniter;
import main.designmode.uml.aggregation.Mouse;

public class Computer {
	private main.designmode.uml.aggregation.Mouse mouse; //�����Ժ�computer����
	private main.designmode.uml.aggregation.Moniter moniter;//��ʾ�����Ժ�Computer����
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMoniter(Moniter moniter) {
		this.moniter = moniter;
	}
	
}
