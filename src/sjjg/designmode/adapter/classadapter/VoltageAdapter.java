package sjjg.designmode.adapter.classadapter;

import main.designmode.adapter.classadapter.IVoltage5V;
import main.designmode.adapter.classadapter.Voltage220V;

//适配器类
public class VoltageAdapter extends Voltage220V implements IVoltage5V {

	@Override
	public int output5V() {
		// TODO Auto-generated method stub
		//获取到220V电压
		int srcV = output220V();
		int dstV = srcV / 44 ; //转成 5v
		return dstV;
	}

}
