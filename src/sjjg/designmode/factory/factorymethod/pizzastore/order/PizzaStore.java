package sjjg.designmode.factory.factorymethod.pizzastore.order;

import main.designmode.factory.factorymethod.pizzastore.order.BJOrderPizza;
import main.designmode.factory.factorymethod.pizzastore.order.LDOrderPizza;

public class PizzaStore {

	public static void main(String[] args) {
		String loc = "bj";
		if (loc.equals("bj")) {
			//����������ζ�ĸ���Pizza
			new BJOrderPizza();
		} else {
			//�����׶ؿ�ζ�ĸ���Pizza
			new LDOrderPizza();
		}
		// TODO Auto-generated method stub
	}

}
