package sjjg.designmode.state.money;

import main.designmode.state.money.AbstractState;
import main.designmode.state.money.Context;
import main.designmode.state.money.StateEnum;

//���־���״̬��
class FeedBackState extends AbstractState {

	@Override
	public String getCurrentState() {
		return StateEnum.FEED_BACKED.getValue();
	}
}

class GenerateState extends AbstractState {

	@Override
	public void checkEvent(main.designmode.state.money.Context context) {
		context.setState(new ReviewState());
	}

	@Override
	public void checkFailEvent(main.designmode.state.money.Context context) {
		context.setState(new FeedBackState());
	}

	@Override
	public String getCurrentState() {
		return StateEnum.GENERATE.getValue();
	}
}

class NotPayState extends AbstractState {

	@Override
	public void payOrderEvent(main.designmode.state.money.Context context) {
		context.setState(new PaidState());
	}

	@Override
	public void feedBackEvent(main.designmode.state.money.Context context) {
		context.setState(new FeedBackState());
	}

	@Override
	public String getCurrentState() {
		return StateEnum.NOT_PAY.getValue();
	}
}

class PaidState extends AbstractState {

	@Override
	public void feedBackEvent(main.designmode.state.money.Context context) {
		context.setState(new FeedBackState());
	}

	@Override
	public String getCurrentState() {
		return StateEnum.PAID.getValue();
	}
}

class PublishState extends AbstractState {

	@Override
	public void acceptOrderEvent(main.designmode.state.money.Context context) {
		//�ѵ�ǰ״̬����Ϊ  NotPayState������
		//����Ӧ�ñ���ĸ�״̬��������ͼ������
		context.setState(new NotPayState());
	}

	@Override
	public void notPeopleAcceptEvent(main.designmode.state.money.Context context) {
		context.setState(new FeedBackState());
	}

	@Override
	public String getCurrentState() {
		return StateEnum.PUBLISHED.getValue();
	}
}

class ReviewState extends AbstractState {

	@Override
	public void makePriceEvent(Context context) {
		context.setState(new PublishState());
	}

	@Override
	public String getCurrentState() {
		return StateEnum.REVIEWED.getValue();
	}

}