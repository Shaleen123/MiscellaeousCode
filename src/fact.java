import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class fact {

    int x = 100;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof fact)) return false;
        fact fact = (fact) o;
        return x == fact.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x);
    }

/*  private void foo(int x) {
        x = x;
    }*/

    public static void main(String[] args) {
        fact fact = new fact();
        System.out.println(fact.hashCode());
        List list = new ArrayList();
        Objects.hash(1);
        //856419764
        //  fact.foo(0);
        // System.out.println();

        Map<Integer, Integer> m = new HashMap();
        m.put(1, 1);
        m.put(2, 1);

        System.out.println("before" + m.hashCode());
        m.put(1, 10);
        System.out.println("after" + m.hashCode());

        int c = 15 + (15 >> 1);
        System.out.println("C:" + c);

        int d = 15 * 3 / 2 + 1;
        System.out.println("D:" + d);

        Map<String, String> hashmap = new HashMap();
        hashmap.put("1", "15");
        Set<Map.Entry<String, String>> entry = hashmap.entrySet();

        Iterator itr = entry.iterator();
        while (itr.hasNext()) {
            Map.Entry<String, String> entryMap = (Map.Entry<String, String>) itr.next();
            System.out.println("Key is :" + entryMap.getKey() + " " + " value is :" + entryMap.getValue());
        }


        // m.forEach((integer, integer2) -> System.out.println("Key is:" + " " + integer + "value is :" + " " + integer2));
    }
}




