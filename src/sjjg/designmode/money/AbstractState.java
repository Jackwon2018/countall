package sjjg.designmode.money;

import main.designmode.money.Context;
import main.designmode.money.State;

public abstract class AbstractState implements State {

	protected static final RuntimeException EXCEPTION = new RuntimeException("操作流程不允许");

    @Override
    public void checkEvent(main.designmode.money.Context context) {
        throw EXCEPTION;
    }

    @Override
    public void checkFailEvent(main.designmode.money.Context context) {
        throw EXCEPTION;
    }

    @Override
    public void makePriceEvent(main.designmode.money.Context context) {
        throw EXCEPTION;
    }

    @Override
    public void acceptOrderEvent(main.designmode.money.Context context) {
        throw EXCEPTION;
    }

    @Override
    public void notPeopleAcceptEvent(main.designmode.money.Context context) {
        throw EXCEPTION;
    }

    @Override
    public void payOrderEvent(main.designmode.money.Context context) {
        throw EXCEPTION;
    }

    @Override
    public void orderFailureEvent(main.designmode.money.Context context) {
        throw EXCEPTION;
    }

    @Override
    public void feedBackEvent(Context context) {
        throw EXCEPTION;
    }
}
