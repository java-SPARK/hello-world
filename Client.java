package celuemoshi;

public class Client {
	TravelStrategy travelStrategy;
	public void setTravelStategy(TravelStrategy travelStrategy) {
		this.travelStrategy=travelStrategy;
	}
public static void main(String[] args) {
	HighTrainStragy travel=new HighTrainStragy();
	travel.travelAlgoritlm();
}
}
