package sjjg.designmode.decorator;

import main.designmode.decorator.Decorator;
import main.designmode.decorator.Drink;

public class Milk extends Decorator {

	public Milk(Drink obj) {
		super(obj);
		// TODO Auto-generated constructor stub
		setDes(" ţ�� ");
		setPrice(2.0f); 
	}

}
