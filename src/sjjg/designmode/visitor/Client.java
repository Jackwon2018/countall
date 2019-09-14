package sjjg.designmode.visitor;

import main.designmode.visitor.Fail;
import main.designmode.visitor.Man;
import main.designmode.visitor.ObjectStructure;
import main.designmode.visitor.Success;
import main.designmode.visitor.Wait;
import main.designmode.visitor.Woman;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����ObjectStructure
		ObjectStructure objectStructure = new ObjectStructure();
		
		objectStructure.attach(new Man());
		objectStructure.attach(new Woman());
		
		
		//�ɹ�
		Success success = new Success();
		objectStructure.display(success);
		
		System.out.println("===============");
		main.designmode.visitor.Fail fail = new Fail();
		objectStructure.display(fail);
		
		System.out.println("=======�����Ǵ����Ĳ���========");
		
		main.designmode.visitor.Wait wait = new Wait();
		objectStructure.display(wait);
	}

}
