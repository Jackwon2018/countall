package sjjg.designmode.uml.composition;

import main.designmode.uml.composition.Moniter;
import main.designmode.uml.composition.Mouse;

public class Computer {
	private main.designmode.uml.composition.Mouse mouse = new main.designmode.uml.composition.Mouse(); //�����Ժ�computer���ܷ���
	private main.designmode.uml.composition.Moniter moniter = new main.designmode.uml.composition.Moniter();//��ʾ�����Ժ�Computer���ܷ���
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMoniter(Moniter moniter) {
		this.moniter = moniter;
	}
	
}
