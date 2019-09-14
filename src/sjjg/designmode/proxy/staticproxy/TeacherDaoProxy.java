package sjjg.designmode.proxy.staticproxy;

import main.designmode.proxy.staticproxy.ITeacherDao;

//代理对象,静态代理
public class TeacherDaoProxy implements main.designmode.proxy.staticproxy.ITeacherDao {
	
	private main.designmode.proxy.staticproxy.ITeacherDao target; // 目标对象，通过接口来聚合
	
	
	//构造器
	public TeacherDaoProxy(ITeacherDao target) {
		this.target = target;
	}



	@Override
	public void teach() {
		// TODO Auto-generated method stub
		System.out.println("开始代理  完成某些操作。。。。。 ");//方法
		target.teach();
		System.out.println("提交。。。。。");//方法
	}

}
