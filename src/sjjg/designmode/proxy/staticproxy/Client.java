package sjjg.designmode.proxy.staticproxy;

import main.designmode.proxy.staticproxy.TeacherDao;
import main.designmode.proxy.staticproxy.TeacherDaoProxy;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����Ŀ�����(���������)
		TeacherDao teacherDao = new TeacherDao();
		
		//�����������, ͬʱ����������󴫵ݸ��������
		TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(teacherDao);
		
		//ͨ��������󣬵��õ����������ķ���
		//����ִ�е��Ǵ������ķ��������������ȥ����Ŀ�����ķ��� 
		teacherDaoProxy.teach();
	}

}
