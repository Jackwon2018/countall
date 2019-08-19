package interviwe;

/**
 * @author Jackwon
 * @date 2019/8/14-23:34
 */
/**
 * 字母表中共有26个字符，在移位前先将移动的位数（key）和26取模。Java将字符加上个正整数即代表在字母表中右移多少位。
 * 如果移动的位数是负值，则代表在字母表中左移多少位。
 * 尽管在移动之前已经将移动的位数和26取了模，但通过这种方式实现右移或左移仍可能发生超界。
 * 如字母x右移4位应该是字母b，但将字母x增加4后超出26个字母的范围。
 * 因此移位后使用两个if语句判断一下，如果向左超界（c＜’a’）则增加26；如果向右超界（c＞’z’）则减去26。
 * 此外，由于大写字母和小写字母判断是否超界的依据不同，程序中将字符分为大写和小写分别处理。
 */

import java.util.Scanner;

public class encyption {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("[A 加密][J 解密],请选择一个");
        Scanner c = new Scanner(System.in);//	创建Scanner对象
        String s1 = c.nextLine();//获取本行的字符串
        if (s1.equalsIgnoreCase("A")) {//判断变量s1与A是否相等，忽略大小
            System.out.println("请输入明文：");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();

            System.out.println("请输入密钥:");
            Scanner sc1 = new Scanner(System.in);
            int key = sc1.nextInt();//将下一输入项转换成int类型
            for (int i = 0; i <s.length() ; i++) {
            char d = s.charAt(i);
                System.out.println((byte)(d+key));
            }

            Encryption(s, key);//调用Encryption方法

        } else if (s1.equalsIgnoreCase("J")) {
            System.out.println("请输入密文:");
            Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            System.out.println("请输入密钥：");
            Scanner sc1 = new Scanner(System.in);
            int key = sc1.nextInt();
            Decrypt(s, key);//调用Encryption方法

        }
    }

    public static void Decrypt(String str, int n) {
        // TODO Auto-generated method stub
        //解密
        int k = Integer.parseInt("-" + n);
        String string = "";
        string = method(str, k, string);
        System.out.println(str + "解密后为：" + string);
    }

    public static void Encryption(String str, int k) {
        // TODO Auto-generated method stub
        //加密
        String string = "";
        string = method(str, k, string);
        System.out.println(str + "加密后为：" + string);
    }

    private static String method(String str, int k, String string) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z')//如果字符串中的某个字符是小写字母
            {
                c += k % 26;//移动key%26位
                if (c < 'a')
                    c += 26;//向左超界
                if (c > 'z')
                    c -= 26;//向右超界
            } else if (c >= 'A' && c <= 'Z')//如果字符串中的某个字符是大写字母
            {
                c += k % 26;//移动key%26位
                if (c < 'A')
                    c += 26;//向左超界
                if (c > 'Z')
                    c -= 26;//向右超界
            }
            string += c;//将解密后的字符连成字符串
        }
        return string;
    }

}
