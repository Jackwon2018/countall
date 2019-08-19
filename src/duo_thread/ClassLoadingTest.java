package duo_thread;

/**
 * @author Jackwon
 * @date 2019/6/4-11:59
 */
public class ClassLoadingTest {
    public static void main(String[] args) {
        A b = new B();
       // b.method();
        B c =(B)b;
        c.aa();
        System.out.println(b.m);


    }
}

class A {
  public static void  method(){
      System.out.println("A.method");
  };
//  private void aa(){
//      System.out.println("nihao");
//  };
    static {

        m = 300;
    }

    static int m = 100;
}
class B extends A{
    static int m = 200;
    public void aa(){
        System.out.println("bbbbb");
    };
    public static void method(){
        System.out.println("B.method");
    };
}