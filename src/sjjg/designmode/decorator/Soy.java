package sjjg.designmode.decorator;

import main.designmode.decorator.Decorator;
import main.designmode.decorator.Drink;

public class Soy extends Decorator {

	public Soy(Drink obj) {
		super(obj);
		// TODO Auto-generated constructor stub
		setDes(" ¶¹½¬  ");
		setPrice(1.5f);
	}

}
