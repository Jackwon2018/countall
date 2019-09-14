package sjjg.designmode.proxy.staticproxy;

import main.designmode.proxy.staticproxy.ITeacherDao;

//�������,��̬����
public class TeacherDaoProxy implements main.designmode.proxy.staticproxy.ITeacherDao {
	
	private main.designmode.proxy.staticproxy.ITeacherDao target; // Ŀ�����ͨ���ӿ����ۺ�
	
	
	//������
	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}



	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("��ʼ����  ���ĳЩ�������������� ");//����
		target.teach();
		System.out.println("�ύ����������");//����
	}

}
