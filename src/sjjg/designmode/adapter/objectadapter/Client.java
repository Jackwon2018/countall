package sjjg.designmode.adapter.objectadapter;

import main.designmode.adapter.objectadapter.Phone;
import main.designmode.adapter.objectadapter.Voltage220V;
import main.designmode.adapter.objectadapter.VoltageAdapter;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" === 对象适配器模式 ====");
		main.designmode.adapter.objectadapter.Phone phone = new Phone();
		phone.charging(new VoltageAdapter(new Voltage220V()));
	}

}
