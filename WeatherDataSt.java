package guanchazhemoshi;

import java.util.ArrayList;

public class WeatherDataSt implements Subject{
	private float mTemperatrue;
	private float mPressure;
	private float mHumidity;
	private ArrayList<Observer> mObsevers;
	public WeatherDataSt() {
		mObsevers=new ArrayList<Observer>();
	}
	public float getTemperatrue() {
		return mTemperatrue;
	}
	public float getPressure() {
		return mPressure;
	}
	public float getHumidity() {
		return mHumidity;
	}
	public void dataChange() {
		notifyObservers();
	}
	public void setData(float mTemperatrue,float mHumidity,float mPressure) {
		this.mHumidity=mHumidity;
		this.mPressure=mPressure;
		this.mTemperatrue=mTemperatrue;
		dataChange();
	}
	@Override
	public void registerObserve(Observer o) {
		// TODO 自动生成的方法存根
		mObsevers.add(o);
	}
	@Override
	public void removeObserver(Observer o) {
		// TODO 自动生成的方法存根
		if(mObsevers.contains(o)) {
			mObsevers.remove(0);
		}
	}
	@Override
	public void notifyObservers() {
		// TODO 自动生成的方法存根
		for(int i=0,len=mObsevers.size();i<len;i++) {
			mObsevers.get(i).update(getTemperatrue(), getPressure(), getHumidity());
		}
	}
}
