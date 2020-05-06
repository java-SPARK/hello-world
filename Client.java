package guanchazhemoshi;

public class Client {
public static void main(String[] args) {
	CurrentConditions mCurrentConditions;
	ForcastConditions mForcastConditions;
	WeatherDataSt mWeatherDataSt;
	mWeatherDataSt=new WeatherDataSt();
	mCurrentConditions=new CurrentConditions();
	mForcastConditions=new ForcastConditions();
	mWeatherDataSt.registerObserve(mForcastConditions);
	mWeatherDataSt.registerObserve(mCurrentConditions);
	mWeatherDataSt.setData(30, 150, 40);
}
}
