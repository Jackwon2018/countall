package sjjg.designmode.builder.improve;


import main.designmode.builder.improve.House;

// ����Ľ�����
public abstract class HouseBuilder {

	protected main.designmode.builder.improve.House house = new main.designmode.builder.improve.House();
	
	//�����������д��, ����ķ���
	public abstract void buildBasic();
	public abstract void buildWalls();
	public abstract void roofed();
	
	//���췿�Ӻã� ����Ʒ(����) ����
	public House buildHouse() {
		return house;
	}
	
}
