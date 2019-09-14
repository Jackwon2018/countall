package sjjg.designmode.state.money;

import main.designmode.state.money.Context;
import main.designmode.state.money.State;

public abstract class AbstractState implements State {

	protected static final RuntimeException EXCEPTION = new RuntimeException("操作流程不允许");

	//抽象类，默认实现了 State 接口的所有方法
	//该类的所有方法，其子类(具体的状态类)，可以有选择的进行重写
	
    @Override
    public void checkEvent(main.designmode.state.money.Context context) {
        throw EXCEPTION;
    }

    @Override
    public void checkFailEvent(main.designmode.state.money.Context context) {
        throw EXCEPTION;
    }

    @Override
    public void makePriceEvent(main.designmode.state.money.Context context) {
        throw EXCEPTION;
    }

    @Override
    public void acceptOrderEvent(main.designmode.state.money.Context context) {
        throw EXCEPTION;
    }

    @Override
    public void notPeopleAcceptEvent(main.designmode.state.money.Context context) {
        throw EXCEPTION;
    }

    @Override
    public void payOrderEvent(main.designmode.state.money.Context context) {
        throw EXCEPTION;
    }

    @Override
    public void orderFailureEvent(main.designmode.state.money.Context context) {
        throw EXCEPTION;
    }

    @Override
    public void feedBackEvent(Context context) {
        throw EXCEPTION;
    }
}
