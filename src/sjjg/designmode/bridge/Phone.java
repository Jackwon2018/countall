package sjjg.designmode.bridge;

import main.designmode.bridge.Brand;

public abstract class Phone {
	
	//���Ʒ��
	private main.designmode.bridge.Brand brand;

	//������
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
