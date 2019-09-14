package sjjg.designmode.decorator;

import main.designmode.decorator.Chocolate;
import main.designmode.decorator.DeCaf;
import main.designmode.decorator.Drink;
import main.designmode.decorator.LongBlack;
import main.designmode.decorator.Milk;

public class CoffeeBar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// װ����ģʽ�µĶ�����2���ɿ���+һ��ţ�̵�LongBlack

		// 1. ��һ�� LongBlack
		main.designmode.decorator.Drink order = new LongBlack();
		System.out.println("����1=" + order.cost());
		System.out.println("����=" + order.getDes());

		// 2. order ����һ��ţ��
		order = new main.designmode.decorator.Milk(order);

		System.out.println("order ����һ��ţ�� ���� =" + order.cost());
		System.out.println("order ����һ��ţ�� ���� = " + order.getDes());

		// 3. order ����һ���ɿ���

		order = new main.designmode.decorator.Chocolate(order);

		System.out.println("order ����һ��ţ�� ����һ���ɿ���  ���� =" + order.cost());
		System.out.println("order ����һ��ţ�� ����һ���ɿ��� ���� = " + order.getDes());

		// 3. order ����һ���ɿ���

		order = new Chocolate(order);

		System.out.println("order ����һ��ţ�� ����2���ɿ���   ���� =" + order.cost());
		System.out.println("order ����һ��ţ�� ����2���ɿ��� ���� = " + order.getDes());
	
		System.out.println("===========================");
		
		Drink order2 = new DeCaf();
		
		System.out.println("order2 ���򿧷�  ���� =" + order2.cost());
		System.out.println("order2 ���򿧷� ���� = " + order2.getDes());
		
		order2 = new Milk(order2);
		
		System.out.println("order2 ���򿧷� ����һ��ţ��  ���� =" + order2.cost());
		System.out.println("order2 ���򿧷� ����һ��ţ�� ���� = " + order2.getDes());

	
	}

}
