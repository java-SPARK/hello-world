package diedaiqi;

public class ConcreteIterator implements Iterator {
	private MyList list=null;
	private int index;
	public ConcreteIterator(MyList list) {
		this.list=list;
	}
	@Override
	public boolean hasNext() {
		// TODO �Զ����ɵķ������
		if(index>=list.getSize())
			return false;
			else return true;
	}

	@Override
	public Object next() {
		// TODO �Զ����ɵķ������
		Object obj=list.get(index);
		index++;
		return obj;
	}

}
