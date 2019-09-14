package sjjg.designmode.state;

import main.designmode.state.CanRaffleState;
import main.designmode.state.DispenseOutState;
import main.designmode.state.DispenseState;
import main.designmode.state.NoRaffleState;
import main.designmode.state.State;

/**
 * �齱� //
 * 
 * @author Administrator
 *
 */
public class RaffleActivity {

	// state ��ʾ���ǰ��״̬���Ǳ仯
    main.designmode.state.State state = null;
    // ��Ʒ����
    int count = 0;
    
    // �ĸ����ԣ���ʾ����״̬
    main.designmode.state.State noRafflleState = new NoRaffleState(this);
    main.designmode.state.State canRaffleState = new CanRaffleState(this);
    
    main.designmode.state.State dispenseState =   new DispenseState(this);
    main.designmode.state.State dispensOutState = new DispenseOutState(this);

    //������
    //1. ��ʼ����ǰ��״̬Ϊ noRafflleState�������ܳ齱��״̬��
    //2. ��ʼ����Ʒ������ 
    public RaffleActivity( int count) {
        this.state = getNoRafflleState();
        this.count = count;
    }

    //�۷�, ���õ�ǰ״̬�� deductMoney
    public void debuctMoney(){
        state.deductMoney();
    }

    //�齱 
    public void raffle(){
    	// �����ǰ��״̬�ǳ齱�ɹ�
        if(state.raffle()){
        	//��ȡ��Ʒ
            state.dispensePrize();
        }

    }

    public main.designmode.state.State getState() {
        return state;
    }

    public void setState(main.designmode.state.State state) {
        this.state = state;
    }

    //��������ע�⣬ÿ��ȡһ�ν�Ʒ��count--
    public int getCount() {
    	int curCount = count; 
    	count--;
        return curCount;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public main.designmode.state.State getNoRafflleState() {
        return noRafflleState;
    }

    public void setNoRafflleState(main.designmode.state.State noRafflleState) {
        this.noRafflleState = noRafflleState;
    }

    public main.designmode.state.State getCanRaffleState() {
        return canRaffleState;
    }

    public void setCanRaffleState(main.designmode.state.State canRaffleState) {
        this.canRaffleState = canRaffleState;
    }

    public main.designmode.state.State getDispenseState() {
        return dispenseState;
    }

    public void setDispenseState(main.designmode.state.State dispenseState) {
        this.dispenseState = dispenseState;
    }

    public main.designmode.state.State getDispensOutState() {
        return dispensOutState;
    }

    public void setDispensOutState(State dispensOutState) {
        this.dispensOutState = dispensOutState;
    }
}
