package sjjg.designmode.state;

import main.designmode.state.CanRaffleState;
import main.designmode.state.DispenseOutState;
import main.designmode.state.DispenseState;
import main.designmode.state.NoRaffleState;
import main.designmode.state.State;

/**
 * 抽奖活动 //
 * 
 * @author Administrator
 *
 */
public class RaffleActivity {

	// state 表示活动当前的状态，是变化
    main.designmode.state.State state = null;
    // 奖品数量
    int count = 0;
    
    // 四个属性，表示四种状态
    main.designmode.state.State noRafflleState = new NoRaffleState(this);
    main.designmode.state.State canRaffleState = new CanRaffleState(this);
    
    main.designmode.state.State dispenseState =   new DispenseState(this);
    main.designmode.state.State dispensOutState = new DispenseOutState(this);

    //构造器
    //1. 初始化当前的状态为 noRafflleState（即不能抽奖的状态）
    //2. 初始化奖品的数量 
    public RaffleActivity( int count) {
        this.state = getNoRafflleState();
        this.count = count;
    }

    //扣分, 调用当前状态的 deductMoney
    public void debuctMoney(){
        state.deductMoney();
    }

    //抽奖 
    public void raffle(){
    	// 如果当前的状态是抽奖成功
        if(state.raffle()){
        	//领取奖品
            state.dispensePrize();
        }

    }

    public main.designmode.state.State getState() {
        return state;
    }

    public void setState(main.designmode.state.State state) {
        this.state = state;
    }

    //这里请大家注意，每领取一次奖品，count--
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
