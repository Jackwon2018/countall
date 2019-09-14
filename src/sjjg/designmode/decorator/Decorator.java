package sjjg.designmode.decorator;

import main.designmode.decorator.Drink;

public class Decorator extends main.designmode.decorator.Drink {
	private main.designmode.decorator.Drink obj;
	
	public Decorator(Drink obj) { //���
		// TODO Auto-generated constructor stub
		this.obj = obj;
	}
	
	@Override
	public float cost() {
		// TODO Auto-generated method stub
		// getPrice �Լ��۸�
		return super.getPrice() + obj.cost();
	}
	
	@Override
	public String getDes() {
		// TODO Auto-generated method stub
		// obj.getDes() �����װ���ߵ���Ϣ
		return des + " " + getPrice() + " && " + obj.getDes();
	}
	
	

}
