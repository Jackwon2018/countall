package sjjg.designmode.visitor;

import main.designmode.visitor.Action;
import main.designmode.visitor.Person;

import java.util.LinkedList;
import java.util.List;

//数据结构，管理很多人（Man , Woman）
public class ObjectStructure {

	//维护了一个集合
	private List<main.designmode.visitor.Person> persons = new LinkedList<>();
	
	//增加到list
	public void attach(main.designmode.visitor.Person p) {
		persons.add(p);
	}
	//移除
	public void detach(main.designmode.visitor.Person p) {
		persons.remove(p);
	}
	
	//显示测评情况
	public void display(Action action) {
		for(Person p: persons) {
			p.accept(action);
		}
	}
}
