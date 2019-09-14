package sjjg.designmode.adapter.classadapter;

import main.designmode.adapter.classadapter.Phone;
import main.designmode.adapter.classadapter.VoltageAdapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" === ÀàÊÊÅäÆ÷Ä£Ê½ ====");
		main.designmode.adapter.classadapter.Phone phone = new Phone();
		phone.charging(new VoltageAdapter());
	}

}
