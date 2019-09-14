package sjjg.designmode.prototype;

import main.designmode.prototype.Sheep;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//传统的方法
		main.designmode.prototype.Sheep sheep = new main.designmode.prototype.Sheep("tom", 1, "白色");
		
		main.designmode.prototype.Sheep sheep2 = new main.designmode.prototype.Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
		main.designmode.prototype.Sheep sheep3 = new main.designmode.prototype.Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
		main.designmode.prototype.Sheep sheep4 = new main.designmode.prototype.Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
		main.designmode.prototype.Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
		//....
		
		System.out.println(sheep);
		System.out.println(sheep2);
		System.out.println(sheep3);
		System.out.println(sheep4);
		System.out.println(sheep5);
		//...
	}

}
