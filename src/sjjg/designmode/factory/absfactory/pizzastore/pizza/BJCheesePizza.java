package sjjg.designmode.factory.absfactory.pizzastore.pizza;

import main.designmode.factory.absfactory.pizzastore.pizza.Pizza;

public class BJCheesePizza extends Pizza {

	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("北京的奶酪pizza");
		System.out.println(" 北京的奶酪pizza 准备原材料");
	}

}
