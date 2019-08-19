package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class four_map {
    /*
    四则运算当中的加号“+”有常见的三种用法：

    1. 对于数值来说，那就是加法。
    2. 对于字符char类型来说，在计算之前，char会被提升成为int，然后再计算。
    char类型字符，和int类型数字，之间的对照关系表：ASCII、Unicode
    3. 对于字符串String（首字母大写，并不是关键字）来说，加号代表字符串连接操作。
    任何数据类型和字符串进行连接的时候，结果都会变成字符串
    */
    //public class Demo05Plus {
        public static void main(String[] args) {



                Map<String, String> m = new HashMap<String, String>();
                m.put("1", "value1");
                m.put("a","valuea");
                m.put("4","value4");
                m.put("c","valuec");
                m.put("b","valueb");
                m.put("2", "value2");
                m.put("3", "value3");
            System.out.println(m.keySet());
            System.out.println(m.entrySet());

            System.out.println();
            System.out.println(m.values());
                //第一种：普遍使用，二次取值
                System.out.println("第一种通过Map.keySet遍历key和value：");
                for (String key : m.keySet()) {
                    System.out.println("key= " + key + ",value= " + m.get(key));
                }

                //第二种
                System.out.println("第二种通过Map.entrySet使用iterator遍历key和value：");
                Iterator<Map.Entry<String, String>> it = m.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry<String, String> entry = it.next();
                    System.out.println("key= " + entry.getKey() + ",value= " + entry.getValue());
                }
                //第三种：推荐，尤其是容量大时
                System.out.println("第三种通过Map.entrySet遍历key和value");
                for (Map.Entry<String, String> entry : m.entrySet()) {
                    System.out.println("key= " + entry.getKey() + ",value= " + entry.getValue());
                }

                //第四种
                System.out.println("第四种通过Map.values()遍历所有的value，但不能遍历key");
                for (String key : m.values()) {
                    System.out.println("value=" + key);
                }
            }
        }

//            Set entries = map.entrySet( );
//            if(entries != null) {
//            Iterator iterator = entries.iterator( );
//            while(iterator.hasNext( )) {
//            Map.Entry entry =iterator.next( );
//            Object key = entry.getKey( );
//            Object value = entry.getValue();
//
//public static void main(String[] args) {
//        Map<String, String> map = new HashMap<String, String>();
//        map.put("01", "qwe");
//        map.put("02", "asd");
//        map.put("03", "zxc");
//        // 通过entrySet()方法将map集合中的映射关系取出（这个关系就是Map.Entry类型）
//        Set<Map.Entry<String, String>> entrySet = map.entrySet();
//        // 将关系集合entryset进行迭代，存放到迭代器中
//        Iterator<Map.Entry<String, String>> it2 = entrySet.iterator();
//        while (it2.hasNext()) {
//        // 获取Map.Entry关系对象me
//        Map.Entry<String, String> me = it2.next();
//        // 通过关系对像获取key
//        String key2 = me.getKey();
//        // 通过关系对像获取value
//        String value2 = me.getValue();
//        System.out.println("key:" + key2 + "-->value:" + value2);
//        }
//        }