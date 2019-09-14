package sjjg.designmode.iterator;

import main.designmode.iterator.College;
import main.designmode.iterator.Department;

import java.util.Iterator;
import java.util.List;

public class OutPutImpl {
	
	//ѧԺ����
	List<main.designmode.iterator.College> collegeList;

	public OutPutImpl(List<main.designmode.iterator.College> collegeList) {
		
		this.collegeList = collegeList;
	}
	//��������ѧԺ,Ȼ�����printDepartment �������ѧԺ��ϵ
	public void printCollege() {
		
		//��collegeList ȡ������ѧԺ, Java �е� List �Ѿ�ʵ��Iterator
		Iterator<main.designmode.iterator.College> iterator = collegeList.iterator();
		
		while(iterator.hasNext()) {
			//ȡ��һ��ѧԺ
			College college = iterator.next();
			System.out.println("=== "+college.getName() +"=====" );
			printDepartment(college.createIterator()); //�õ���Ӧ������
		}
	}
	
	
	//��� ѧԺ��� ϵ
	
	public void printDepartment(Iterator iterator) {
		while(iterator.hasNext()) {
			main.designmode.iterator.Department d = (Department)iterator.next();
			System.out.println(d.getName());
		}
	}
	
}
