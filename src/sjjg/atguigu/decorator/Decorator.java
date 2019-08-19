package sjjg.atguigu.decorator;

public class Decorator extends Drink {
	private Drink obj;
	
	public Decorator(Drink obj) { //���

		this.obj = obj;
	}
	
	@Override
	public float cost() {

		// getPrice �Լ��۸�
		//System.out.println("aaaaaaaa" + obj.cost());
		return super.getPrice() + obj.cost();
	}
	
	@Override
	public String getDes() {

		// obj.getDes() �����װ���ߵ���Ϣ
		return des + " " + getPrice() + " && " + obj.getDes();
	}
	
	

}
