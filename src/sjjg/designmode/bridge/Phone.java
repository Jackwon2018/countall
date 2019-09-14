package sjjg.designmode.bridge;

import main.designmode.bridge.Brand;

public abstract class Phone {
	
	//组合品牌
	private main.designmode.bridge.Brand brand;

	//构造器
	public Phone(Brand brand) {
		super();
		this.brand = brand;
	}
	
	protected void open() {
		this.brand.open();
	}
	protected void close() {
		brand.close();
	}
	protected void call() {
		brand.call();
	}
	
}
