package diedaiqi;

public class ConcreteAggregate implements MyList {
	private Object[] elements;
	private int size;
	private int index;
	public void ConcreteAggrrgate() {
		elements=new Object[100];
	}
	@Override
	public void add(Object  e) {
		// TODO �Զ����ɵķ������
		elements[index++]=e;
		size++;
	}

	@Override
	public Object get(int index) {
		// TODO �Զ����ɵķ������
		return elements[index];
	}

	@Override
	public Iterator iterator() {
		// TODO �Զ����ɵķ������
		return new ConcreteIterator(this);
	}

	@Override
	public int getSize() {
		// TODO �Զ����ɵķ������
		return size;
	}

}
