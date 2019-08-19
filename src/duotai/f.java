package duotai;

//import jdk.internal.dynalink.beans.StaticClass;

/**
 * @author Jackwon
 * @date 2019/7/15-1:49
 */
public class f {

    int s =100;
    static {
       int b=100;
    }

    public f(int s) {
        this.s = s;
    }

    static int b = 1111;
   public static void method(){
       System.out.println("f");
    }
}
