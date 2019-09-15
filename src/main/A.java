package main;

/**
 * @author Jackwon
 * @date 2019/7/22-11:36
 */
public class A {
   String name;
}
class B extends A{
    public B(){
        name = "son";
    }

}
class test{
    public static void main(String[] args) {
        A b = new B();
        System.out.println(b.name);

    }
}