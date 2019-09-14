package sjjg.designmode.state;

import main.designmode.state.RaffleActivity;
import main.designmode.state.State;

/**
 * ��Ʒ�������״̬
 * ˵����������activity �ı�� DispenseOutState�� �齱�����
 * @author Administrator
 *
 */
public class DispenseOutState extends State {

	// ��ʼ��ʱ��������
    main.designmode.state.RaffleActivity activity;

    public DispenseOutState(RaffleActivity activity) {
        this.activity = activity;
    }
    @Override
    public void deductMoney() {
        System.out.println("��Ʒ�������ˣ����´��ٲμ�");
    }

    @Override
    public boolean raffle() {
        System.out.println("��Ʒ�������ˣ����´��ٲμ�");
        return false;
    }

    @Override
    public void dispensePrize() {
        System.out.println("��Ʒ�������ˣ����´��ٲμ�");
    }
}
