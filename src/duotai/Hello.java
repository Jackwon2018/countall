package duotai;

/**
 * @author Jackwon
 * @date 2019/9/13-11:33
 */
class A {
    static {
        System.out.print("A");
    }
    {
        System.out.print("x");
    }
    public A() {
        System.out.print("a");
    }
    void say() {
        System.out.print("1");
    }
}
class B extends A {
    static {
        System.out.print("B");
    }
    {
        System.out.print("y");
    }
    public B() {
        System.out.print("b");
    }
    void say() {
        System.out.print("2");
    }
}
public class Hello {
    public static void main(String[] args) {
        A ab = new B();
        //ab.say();
        ab = new B();
        System.out.println("t");
        A b = new B();
        //ab.say();

    }
}
