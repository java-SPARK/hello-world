package zhuangtaimoshi;

public class OnReadyState implements State {
	private CandyMachine mCandyMachine;
	public OnReadyState(CandyMachine mCandyMachine) {
		this.mCandyMachine=mCandyMachine;
	}
	@Override
	public void insertCoin() {
		// TODO 自动生成的方法存根
		System.out.println("you have inserted a coin,next,please turn crank!");
		mCandyMachine.setState(mCandyMachine.mHasCoin);
	}

	@Override
	public void returnCoin() {
		// TODO 自动生成的方法存根
		System.out.println("you haven't inserted a coid yet!");
	}

	@Override
	public void turnCrank() {
		// TODO 自动生成的方法存根
		System.out.println("you turned,but you haven't inserted a coin!");
	}

	@Override
	public void dispense() {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void prinstate() {
		// TODO 自动生成的方法存根
		System.out.println("***OnReadyState***");
	}

}
