package sjjg.designmode.builder.improve;

import main.designmode.builder.improve.House;
import main.designmode.builder.improve.HouseBuilder;

//ָ���ߣ�����ȥָ���������̣����ز�Ʒ
public class HouseDirector {
	
	main.designmode.builder.improve.HouseBuilder houseBuilder = null;

	//���������� houseBuilder
	public HouseDirector(main.designmode.builder.improve.HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	//ͨ��setter ���� houseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	//��δ����췿�ӵ����̣�����ָ����
	public House constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		return houseBuilder.buildHouse();
	}
	
	
}
