package sjjg.atguigu.builder.improve;

public class  Client {
	public static void main(String[] args) {
		
		//����ͨ����
		CommonHouse commonHouse = new CommonHouse();
		//׼���������ӵ�ָ����
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		
		//��ɸǷ��ӣ����ز�Ʒ(��ͨ����)
		houseDirector.constructHouse();
//		System.out.println(house.getBaise());
//		System.out.println(house.getRoofed());
//		System.out.println(house.getWall());


		//System.out.println("�������");
		
		System.out.println("--------------------------");
		//�Ǹ�¥
		HighBuilding highBuilding = new HighBuilding();
		//���ý�����
		houseDirector.setHouseBuilder(highBuilding);
		//��ɸǷ��ӣ����ز�Ʒ(��¥)
		houseDirector.constructHouse();
		
		
		
	}
}
