package sjjg.designmode.observer.improve;

import main.designmode.observer.improve.Observer;

//�ӿ�, ��WeatherData ��ʵ��
public interface Subject {
	
	public void registerObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}
