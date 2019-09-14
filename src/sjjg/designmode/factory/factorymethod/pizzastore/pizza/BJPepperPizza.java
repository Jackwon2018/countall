package sjjg.designmode.factory.factorymethod.pizzastore.pizza;

import main.designmode.factory.factorymethod.pizzastore.pizza.Pizza;

public class BJPepperPizza extends Pizza {
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京的胡椒pizza");
		System.out.println(" 北京的胡椒pizza 准备原材料");
	}
}
