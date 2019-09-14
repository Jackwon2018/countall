package singleton1.test;

import singleton1.single.Singleton2;

public class TestSingleton1 {

	public static void main(String[] args) {
//		Singleton1 s = Singleton1.INSTANCE;
//		System.out.println(s);
//	}
//
//}
		Thread2[] ThreadArr = new Thread2[10];
		for (int i = 0; i < ThreadArr.length; i++) {
			ThreadArr[i] = new Thread2();
			ThreadArr[i].start();
		}
		//System.out.println(Singleton1.INSTANCE.name);
	}

}

// ²âÊÔÏß³Ì
class Thread2 extends Thread {
	@Override
	public void run() {
		System.out.println(Singleton2.INSTANCE.hashCode());
	}
}