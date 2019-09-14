package sjjg.designmode.state.money;

import main.designmode.state.money.Context;
import main.designmode.state.money.PublishState;

/**������*/
public class ClientTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����context ����
		main.designmode.state.money.Context context = new Context();
        //����ǰ״̬����Ϊ PublishState
		context.setState(new main.designmode.state.money.PublishState());
        System.out.println(context.getCurrentState());
        
//        //publish --> not pay
        context.acceptOrderEvent(context);
//        //not pay --> paid
        context.payOrderEvent(context);
//        // ʧ��, ���ʧ��ʱ�����׳��쳣
//        try {
//        	context.checkFailEvent(context);
//        	System.out.println("��������..");
//		} catch (Exception e) {
//			// TODO: handle exception
//			System.out.println(e.getMessage());
//		}
        
	}

}
