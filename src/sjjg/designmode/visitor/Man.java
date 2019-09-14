package sjjg.designmode.visitor;

import main.designmode.visitor.Action;
import main.designmode.visitor.Person;

public class Man extends Person {

	@Override
	public void accept(Action action) {
		// TODO Auto-generated method stub
		action.getManResult(this);
	}

}
