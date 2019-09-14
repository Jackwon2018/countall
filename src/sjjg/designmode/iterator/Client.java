package sjjg.designmode.iterator;

import main.designmode.iterator.College;
import main.designmode.iterator.ComputerCollege;
import main.designmode.iterator.InfoCollege;
import main.designmode.iterator.OutPutImpl;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//创建学院
		List<College> collegeList = new ArrayList<College>();
		
		ComputerCollege computerCollege = new ComputerCollege();
		InfoCollege infoCollege = new InfoCollege();
		
		collegeList.add(computerCollege);
		//collegeList.add(infoCollege);
		
		OutPutImpl outPutImpl = new OutPutImpl(collegeList);
		outPutImpl.printCollege();
	}

}
