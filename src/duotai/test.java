package duotai;

/**
 * @author Jackwon
 * @date 2019/8/17-17:24
 */
public class test {
    public static void main(String[] args) {
        Person p = new Person("zhang", 23);
        Person p1 = null;
        try {
            p1 = (Person) p.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println(p);
        System.out.println(p1);
    }
}
