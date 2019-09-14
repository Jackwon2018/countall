package sjjg.designmode.uml.aggregation;

import main.designmode.uml.aggregation.Moniter;
import main.designmode.uml.aggregation.Mouse;

public class Computer {
	private main.designmode.uml.aggregation.Mouse mouse; //鼠标可以和computer分离
	private main.designmode.uml.aggregation.Moniter moniter;//显示器可以和Computer分离
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMoniter(Moniter moniter) {
		this.moniter = moniter;
	}
	
}
