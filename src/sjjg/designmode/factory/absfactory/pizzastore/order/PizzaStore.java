package sjjg.designmode.factory.absfactory.pizzastore.order;

import main.designmode.factory.absfactory.pizzastore.order.LDFactory;
import main.designmode.factory.absfactory.pizzastore.order.OrderPizza;

public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//new OrderPizza(new BJFactory());
		new OrderPizza(new LDFactory());
	}

}
