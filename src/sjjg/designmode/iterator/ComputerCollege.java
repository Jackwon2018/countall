package sjjg.designmode.iterator;

import main.designmode.iterator.College;
import main.designmode.iterator.ComputerCollegeIterator;
import main.designmode.iterator.Department;

import java.util.Iterator;

public class ComputerCollege implements College {

	main.designmode.iterator.Department[] departments;
	int numOfDepartment = 0 ;// 保存当前数组的对象个数
	
	
	public ComputerCollege() {
		departments = new main.designmode.iterator.Department[5];
		addDepartment("Java专业", " Java专业 ");
		addDepartment("PHP专业", " PHP专业 ");
		addDepartment("大数据专业", " 大数据专业 ");
		
	}
	
	
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "计算机学院";
	}

	@Override
	public void addDepartment(String name, String desc) {
		// TODO Auto-generated method stub
		main.designmode.iterator.Department department = new Department(name, desc);
		departments[numOfDepartment] = department;
		numOfDepartment += 1;
	}

	@Override
	public Iterator createIterator() {
		// TODO Auto-generated method stub
		return new ComputerCollegeIterator(departments);
	}

}
