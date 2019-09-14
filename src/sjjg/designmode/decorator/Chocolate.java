package sjjg.designmode.decorator;

import main.designmode.decorator.Decorator;
import main.designmode.decorator.Drink;

//�����Decorator�� ������ǵ�ζƷ
public class Chocolate extends Decorator {

	public Chocolate(Drink obj) {
		super(obj);
		setDes(" �ɿ��� ");
		setPrice(3.0f); // ��ζƷ �ļ۸�
	}

}
