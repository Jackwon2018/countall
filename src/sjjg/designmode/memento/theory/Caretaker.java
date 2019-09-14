package sjjg.designmode.memento.theory;

import main.designmode.memento.theory.Memento;

import java.util.ArrayList;
import java.util.List;

public class Caretaker {
	
	//在List 集合中会有很多的备忘录对象
	private List<main.designmode.memento.theory.Memento> mementoList = new ArrayList<main.designmode.memento.theory.Memento>();
	
	public void add(main.designmode.memento.theory.Memento memento) {
		mementoList.add(memento);
	}
	
	//获取到第index个Originator 的 备忘录对象(即保存状态)
	public Memento get(int index) {
		return mementoList.get(index);
	}
}
