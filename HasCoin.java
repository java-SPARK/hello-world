package zhuangtaimoshi;

import java.util.Random;

public class HasCoin implements State {
	private CandyMachine mCandyMachine;
	public HasCoin(CandyMachine mCandyMachine) {
		this.mCandyMachine=mCandyMachine;
	}
	@Override
	public void insertCoin() {
		// TODO 自动生成的方法存根
		System.out.println("you can't insert another coin!");
	}

	@Override
	public void returnCoin() {
		// TODO 自动生成的方法存根
		System.out.println("coin return!");
		mCandyMachine.setState(mCandyMachine.mOnReadyState);
	}

	@Override
	public void turnCrank() {
		// TODO 自动生成的方法存根
		System.out.println("crank turn>>");
		Random ranwinner=new Random();
		int winner=ranwinner.nextInt(10);
		if(winner==0) {
			mCandyMachine.setState(mCandyMachine.mWinnerState);;
		}else {
			mCandyMachine.setState(mCandyMachine.mSoldOutState);
		}
	}

	@Override
	public void dispense() {
		// TODO 自动生成的方法存根

	}

	@Override
	public void prinstate() {
		// TODO 自动生成的方法存根

	}

}
