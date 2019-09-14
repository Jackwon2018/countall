package sjjg.designmode.visitor;

import main.designmode.visitor.Action;
import main.designmode.visitor.Man;
import main.designmode.visitor.Woman;

public class Success extends Action {

	@Override
	public void getManResult(Man man) {
		// TODO Auto-generated method stub
		System.out.println(" 男人给的评价该歌手很成功 !");
	}

	@Override
	public void getWomanResult(Woman woman) {
		// TODO Auto-generated method stub
		System.out.println(" 女人给的评价该歌手很成功 !");
	}

}
