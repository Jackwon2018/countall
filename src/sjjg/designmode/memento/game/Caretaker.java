package sjjg.designmode.memento.game;

import main.designmode.memento.game.Memento;

import java.util.ArrayList;
import java.util.HashMap;

//�ػ��߶���, ������Ϸ��ɫ��״̬
public class Caretaker {

	//���ֻ����һ��״̬
	private main.designmode.memento.game.Memento memento;
	//��GameRole ������״̬
	//private ArrayList<Memento> mementos;
	//�Զ����Ϸ��ɫ������״̬
	//private HashMap<String, ArrayList<Memento>> rolesMementos;

	public main.designmode.memento.game.Memento getMemento() {
		return memento;
	}

	public void setMemento(Memento memento) {
		this.memento = memento;
	}
	
	
}
