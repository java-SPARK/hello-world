package jianzaozhemoshi;

public class SmartBuilder implements Builder {
	private Human human;
	public SmartBuilder() {
		this.human=new Human();
	}

	@Override
	public void buildhead() {
		// TODO �Զ����ɵķ������
		this.human.setHead("����");
	}

	@Override
	public void buildbody() {
		// TODO �Զ����ɵķ������
		this.human.setBody("����");
	}

	@Override
	public void buildhand() {
		// TODO �Զ����ɵķ������
		this.human.setHand("��");
	}

	@Override
	public void buildfoot() {
		// TODO �Զ����ɵķ������
		this.human.setFoot("��");
	}

	@Override
	public Human createman() {
		// TODO �Զ����ɵķ������
		return this.human;
	}

}
