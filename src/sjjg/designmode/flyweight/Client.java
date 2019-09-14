package sjjg.designmode.flyweight;

import main.designmode.flyweight.User;
import main.designmode.flyweight.WebSite;
import main.designmode.flyweight.WebSiteFactory;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// ����һ��������
		WebSiteFactory factory = new WebSiteFactory();

		// �ͻ�Ҫһ����������ʽ��������վ
		WebSite webSite1 = factory.getWebSiteCategory("����");

		
		webSite1.use(new main.designmode.flyweight.User("tom"));

		// �ͻ�Ҫһ���Բ�����ʽ��������վ
		WebSite webSite2 = factory.getWebSiteCategory("����");

		webSite2.use(new main.designmode.flyweight.User("jack"));

		// �ͻ�Ҫһ���Բ�����ʽ��������վ
		WebSite webSite3 = factory.getWebSiteCategory("����");

		webSite3.use(new main.designmode.flyweight.User("smith"));

		// �ͻ�Ҫһ���Բ�����ʽ��������վ
		WebSite webSite4 = factory.getWebSiteCategory("����");

		webSite4.use(new User("king"));
		
		System.out.println("��վ�ķ��๲=" + factory.getWebSiteCount());
	}

}
