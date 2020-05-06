package dailimoshi;

public class Proxy implements Rent {
	private Host host;
	public Proxy(Host host) {
		this.host=host;
	}
	@Override
	public void rent() {
		// TODO 自动生成的方法存根
		seeHouse();
		host.rent();
		agreement();
		fee();
	}
	public void seeHouse() {
		System.out.println("中介带你去看房！");
	}
	public void agreement() {
		System.out.println("签合同！");
	}
	public void fee(){
		System.out.println("付款给中介");
	}
}
