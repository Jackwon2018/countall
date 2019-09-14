package sjjg.designmode.observer.improve;

import main.designmode.observer.improve.BaiduSite;
import main.designmode.observer.improve.CurrentConditions;
import main.designmode.observer.improve.WeatherData;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����һ��WeatherData
		WeatherData weatherData = new WeatherData();
		
		//�����۲���
		CurrentConditions currentConditions = new CurrentConditions();
		BaiduSite baiduSite = new BaiduSite();
		
		//ע�ᵽweatherData
		weatherData.registerObserver(currentConditions);
		weatherData.registerObserver(baiduSite);
		
		//����
		System.out.println("֪ͨ����ע��Ĺ۲���, ������Ϣ");
		weatherData.setData(10f, 100f, 30.3f);
		
		
		weatherData.removeObserver(currentConditions);
		//����
		System.out.println();
		System.out.println("֪ͨ����ע��Ĺ۲���, ������Ϣ");
		weatherData.setData(10f, 100f, 30.3f);
	}

}
