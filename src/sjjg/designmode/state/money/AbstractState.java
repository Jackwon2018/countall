package sjjg.designmode.state.money;

import main.designmode.state.money.Context;
import main.designmode.state.money.State;

public abstract class AbstractState implements State {

	protected static final RuntimeException EXCEPTION = new RuntimeException("�������̲�����");

	//�����࣬Ĭ��ʵ���� State �ӿڵ����з���
	//��������з�����������(�����״̬��)��������ѡ��Ľ�����д
	
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
