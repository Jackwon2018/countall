package sjjg.designmode.uml.composition;

import main.designmode.uml.composition.Moniter;
import main.designmode.uml.composition.Mouse;

public class Computer {
	private main.designmode.uml.composition.Mouse mouse = new main.designmode.uml.composition.Mouse(); //鼠标可以和computer不能分离
	private main.designmode.uml.composition.Moniter moniter = new main.designmode.uml.composition.Moniter();//显示器可以和Computer不能分离
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	public void setMoniter(Moniter moniter) {
		this.moniter = moniter;
	}
	
}
