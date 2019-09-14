package duotai;

public class duotaidianxing {
    public static void main(String[] args) {
        System.out.println(new B().getValue());//
        A q = new B();

        System.out.println(q.t);
        System.out.println(new B().t);
    }
    static class A {
        protected int value;
        static private  String t = "a";

        public A(int v) {
            setValue(v);
        }

        public void setValue(int value) {
            this.value = value;
        }

        public int getValue() {
            try {
                value++;
                return value;
            } finally {
                this.setValue(value);
                System.out.println(value);
               // return value;
            }
        }
    }

    static class B extends A {

        private String t = "b";
int value;
        public B() {
            super(5);
            setValue(getValue() - 3);
        }

        public void setValue(int value) {
            super.setValue(2 * value);
        }
    }
}

  /*
这道题的知识点：子类中的方法覆盖父类的方法以后，由于向上转型，父类调用方法的时候是调用子类的，
除非用super或者子类中没有该方法才会调用父类相同的同名方法。还有一个点就是在Try catch  finally 体系当中，
在return之前始终会执行finally里面的代码，如果finally里面有return，则数据跟随finally改变。
如果没有return，则原数据不跟随finally里改变的数据改变！

  Java 中构造器、初始化块、静态初始化块的执行顺序
  静态初始化块 > 初始化块 > 构造器
            父类 > 子类
            综合下来顺序就是：
            父类静态初始化块（静态代码块和静态属性按顺序）只加载一次
            子类静态初始化块（静态代码块和静态属性按顺序）只加载一次
            父类初始化块（非静态代码块和非静态属性按顺序）每new一次加载一次
            父类构造器   每new一次加载一次
            子类初始化块（非静态代码块和非静态属性按顺序）每new一次加载一次
            子类构造器   每new一次加载一次
           注意：非静态方法默认的调用对象是this
                this对象在构造器或者说<init>方法中就是正在创建的对象




多态中成员访问特点：
　　A:成员变量
　　　　编译看左边，运行看左边。
　　B:构造方法
　　　　创建子类对象的时候，访问父类的构造方法，对父类的数据进行初始化。
　　C:成员方法
　　　　编译看左边，运行看右边
　　D:静态方法
　　　　编译看左边，运行看左边
　　　　（静态和类相关，算不上重写，所以访问是左边）
由于成员方法存在重写，所以运行看右边 。
*/