package sjjg.designmode.visitor;

import main.designmode.visitor.Action;
import main.designmode.visitor.Person;

import java.util.LinkedList;
import java.util.List;

//���ݽṹ������ܶ��ˣ�Man , Woman��
public class ObjectStructure {

	//ά����һ������
	private List<main.designmode.visitor.Person> persons = new LinkedList<>();
	
	//���ӵ�list
	public void attach(main.designmode.visitor.Person p) {
		persons.add(p);
	}
	//�Ƴ�
	public void detach(main.designmode.visitor.Person p) {
		persons.remove(p);
	}
	
	//��ʾ�������
	public void display(Action action) {
		for(Person p: persons) {
			p.accept(action);
		}
	}
}
