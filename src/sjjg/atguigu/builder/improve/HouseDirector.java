package sjjg.atguigu.builder.improve;

//指挥者，这里去指定制作流程，返回产品
public class HouseDirector {
	
	HouseBuilder houseBuilder = null;

	//构造器传入 houseBuilder
	public HouseDirector(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}

	//通过setter 传入 houseBuilder
	public void setHouseBuilder(HouseBuilder houseBuilder) {
		this.houseBuilder = houseBuilder;
	}
	
	//如何处理建造房子的流程，交给指挥者
	public void constructHouse() {
		houseBuilder.buildBasic();
		houseBuilder.buildWalls();
		houseBuilder.roofed();
		//return houseBuilder.buildHouse();

	}

//	//盖普通房子
//	CommonHouse commonHouse = new CommonHouse();
//	//准备创建房子的指挥者
//	HouseDirector houseDirector = new HouseDirector(commonHouse);
//
//	//完成盖房子，返回产品(普通房子)
//	House house = houseDirector.constructHouse();
	
}
