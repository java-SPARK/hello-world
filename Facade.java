package waiguanmoshi;

public class Facade {
	private Light lights[]=new Light[4];
	private Airconditioner ac;
	private TeleVision tv;
	public Facade() {
		lights[0]=new Light("客厅");
		lights[1]=new Light("卫生 间");
		lights[2]=new Light("厨房");
		lights[3 ]=new Light("卧室");
		ac=new Airconditioner();
		tv=new TeleVision();
	}
	public void on() {
		lights[0].on();
		lights[1].on();
		lights[2].on();
		lights[3].on();
		ac.on();
		tv.on();
	}
	public void off() {
		lights[0].off();
		lights[1].off();
		lights[2].off();
		lights[3].off();
		ac.off();
		tv.off();
	}
}
