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
		// TODO 自动生成的方法存根
		elements[index++]=e;
		size++;
	}

	@Override
	public Object get(int index) {
		// TODO 自动生成的方法存根
		return elements[index];
	}

	@Override
	public Iterator iterator() {
		// TODO 自动生成的方法存根
		return new ConcreteIterator(this);
	}

	@Override
	public int getSize() {
		// TODO 自动生成的方法存根
		return size;
	}

}
