package guanchazhemoshi;

public interface Subject {
	public void registerObserve(Observer   o);
	public void removeObserver(Observer o);
	public void notifyObservers(); 
}
