package guanchazhemoshi;

public class ForcastConditions implements Observer{
	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;
	@Override
	public void update(float mTemperatrue, float mPressure, float mHumidity) {
		// TODO 自动生成的方法存根
		this.mHumidity=mHumidity;
		this.mPressure=mPressure;
		this.mTemperatrue=mTemperatrue;
		display();
	}
	public void display() {
		System.out.println("**明天温度:"+(mTemperatrue+Math.random()));
		System.out.println("**明天气压:"+(mPressure+10*Math.random()));
		System.out.println("**明天湿度:"+(mHumidity+Math.random()));
		}
	
}
