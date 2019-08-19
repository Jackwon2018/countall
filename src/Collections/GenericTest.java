package Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class GenericTest {
    public static void main(String[] args) {

        GenericClass<String> gc = new GenericClass<>();
        gc.setName("小明");
        String name = gc.getName();
        System.out.println(name);
        GenericClass<Number> gc1 = new GenericClass<>();
        gc1.setName(1);
        Number n = gc1.getName();
        System.out.println(n);
        Map map = new HashMap();
        map.put("1","zhangwuji");
        map.put(2,"zhaomin");
        Set  keySet= map.keySet();
       // Iterable iterator = (Iterable) keySet.iterator();
        Iterator<Integer> it = keySet.iterator();
        while(it.hasNext()) {
            Object key = it.next();
            Object value = map.get(key);
            System.out.println(value);
        }

    }
}