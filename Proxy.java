package dailimoshi;

public class Proxy implements Rent {
	private Host host;
	public Proxy(Host host) {
		this.host=host;
	}
	@Override
	public void rent() {
		// TODO �Զ����ɵķ������
		seeHouse();
		host.rent();
		agreement();
		fee();
	}
	public void seeHouse() {
		System.out.println("�н����ȥ������");
	}
	public void agreement() {
		System.out.println("ǩ��ͬ��");
	}
	public void fee(){
		System.out.println("������н�");
	}
}
