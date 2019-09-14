package sjjg.designmode.factory.absfactory.pizzastore.pizza;

import main.designmode.factory.absfactory.pizzastore.pizza.Pizza;

public class LDPepperPizza extends Pizza {
	@Override
	public void prepare() {
		// TODO Auto-generated method stub
		setName("伦敦的胡椒pizza");
		System.out.println(" 伦敦的胡椒pizza 准备原材料");
	}
}
