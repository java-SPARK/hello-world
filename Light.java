package waiguanmoshi;

public class Light {
	public String position;
	public Light(String position) {
		this.position=position;
	}
	public void on() {
		System.out.println(this.position+"µÆ¿ª");
	}
	public void off(){
		System.out.println(this.position+"µÆÃð");
	}
}
