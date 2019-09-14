package sjjg.designmode.iterator;

import main.designmode.iterator.College;
import main.designmode.iterator.Department;
import main.designmode.iterator.InfoColleageIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InfoCollege implements College {

	List<main.designmode.iterator.Department> departmentList;
	
	
	public InfoCollege() {
		departmentList = new ArrayList<main.designmode.iterator.Department>();
		addDepartment("��Ϣ��ȫרҵ", " ��Ϣ��ȫרҵ ");
		addDepartment("���簲ȫרҵ", " ���簲ȫרҵ ");
		addDepartment("��������ȫרҵ", " ��������ȫרҵ ");
	}
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "��Ϣ����ѧԺ";
	}

	@Override
	public void addDepartment(String name, String desc) {
		// TODO Auto-generated method stub
		main.designmode.iterator.Department department = new Department(name, desc);
		departmentList.add(department);
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new InfoColleageIterator(departmentList);
	}

}
