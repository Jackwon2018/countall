package sjjg.designmode.prototype.improve;


import main.designmode.prototype.improve.Sheep;

public class Client {

	public static void main(String[] args) {
		System.out.println("原型模式完成对象的创建");
		// TODO Auto-generated method stub
		main.designmode.prototype.improve.Sheep sheep = new main.designmode.prototype.improve.Sheep("tom", 1, "白色");
		
		sheep.friend = new main.designmode.prototype.improve.Sheep("jack", 2, "黑色");
		
		main.designmode.prototype.improve.Sheep sheep2 = (main.designmode.prototype.improve.Sheep)sheep.clone(); //克隆
		main.designmode.prototype.improve.Sheep sheep3 = (main.designmode.prototype.improve.Sheep)sheep.clone(); //克隆
		main.designmode.prototype.improve.Sheep sheep4 = (main.designmode.prototype.improve.Sheep)sheep.clone(); //克隆
		main.designmode.prototype.improve.Sheep sheep5 = (Sheep)sheep.clone(); //克隆
		
		System.out.println("sheep2 =" + sheep2 + "sheep2.friend=" + sheep2.friend.hashCode());
		System.out.println("sheep3 =" + sheep3 + "sheep3.friend=" + sheep3.friend.hashCode());
		System.out.println("sheep4 =" + sheep4 + "sheep4.friend=" + sheep4.friend.hashCode());
		System.out.println("sheep5 =" + sheep5 + "sheep5.friend=" + sheep5.friend.hashCode());
	}

}
