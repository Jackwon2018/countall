package sjjg.atguigu.factory.factorymethod.pizzastore.order;

import sjjg.atguigu.factory.factorymethod.pizzastore.pizza.BJCheesePizza;
import sjjg.atguigu.factory.factorymethod.pizzastore.pizza.BJPepperPizza;
import sjjg.atguigu.factory.factorymethod.pizzastore.pizza.LDCheesePizza;
import sjjg.atguigu.factory.factorymethod.pizzastore.pizza.LDPepperPizza;
import sjjg.atguigu.factory.factorymethod.pizzastore.pizza.Pizza;


public class LDOrderPizza extends OrderPizza {

	
	@Override
	Pizza createPizza(String orderType) {
	
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new LDCheesePizza();
		} else if (orderType.equals("pepper")) {
			pizza = new LDPepperPizza();
		}
		// TODO Auto-generated method stub
		return pizza;
	}

}
