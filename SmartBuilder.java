package jianzaozhemoshi;

public class SmartBuilder implements Builder {
	private Human human;
	public SmartBuilder() {
		this.human=new Human();
	}

	@Override
	public void buildhead() {
		// TODO 自动生成的方法存根
		this.human.setHead("大脑");
	}

	@Override
	public void buildbody() {
		// TODO 自动生成的方法存根
		this.human.setBody("身体");
	}

	@Override
	public void buildhand() {
		// TODO 自动生成的方法存根
		this.human.setHand("手");
	}

	@Override
	public void buildfoot() {
		// TODO 自动生成的方法存根
		this.human.setFoot("脚");
	}

	@Override
	public Human createman() {
		// TODO 自动生成的方法存根
		return this.human;
	}

}
