import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class HashMapTesting {
    public static void main(String[] args) {
        Employee emp1 = new Employee("Shaleen", 34, 17);
        Employee emp2 = new Employee("Rajesh", 33, 16);
        Employee emp3 = new Employee("Chinky", 26, 4);
        Employee emp4 = new Employee("Aniket", 27, 5);
        Employee emp5 = new Employee("Baba", 30, 5);

        Map<Employee, String> hmEmployee = new HashMap();

        hmEmployee.put(emp1, "Shaleen");
        hmEmployee.put(emp2, "iTI");
        hmEmployee.put(emp3, "Chinky");
        hmEmployee.put(emp4, "Aniket");
        hmEmployee.put(emp5, "Baba");

        List<Employee> employees = new ArrayList();
        Set<Employee> employeeSet = hmEmployee.keySet();
        Iterator it = employeeSet.iterator();
        while (it.hasNext()) {
            employees.add((Employee) it.next());
        }

        Collections.sort(employees, Comparator.comparing(Employee::getName));
        employees.forEach(o -> System.out.println(o.getName()));

        Map<Integer, String> hmm = new HashMap();
        hmm.put(1, "");
        hmm.put(7, "");
        hmm.put(4, "");
        hmm.put(2, "");
        TreeMap tm = new TreeMap(hmm);
        System.out.println(tm);

        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(123, "2");
        hashMap.put(6, "3");
        hashMap.put(3, "4");
        hashMap.put(5, "5");
        hashMap.put(9, "6");
        hashMap.put(21, "6");
        hashMap.put(1, "6");

        TreeMap treeMap = new TreeMap(hashMap);
        System.out.println("treeMap is :" + treeMap);

        Hashtable hashtable = new Hashtable();

        Map<Integer, String> sortedByPrice = hashMap.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getKey)).collect(Collectors.toMap(x -> x.getKey(),
                y -> y.getValue(), (s, s2) -> s, LinkedHashMap::new));

        sortedByPrice.forEach((o, o2) -> System.out.println("Key:" + o + "value:" + o2));

        List<Integer> numbers = new ArrayList();
        numbers.add(1000);
        numbers.add(1009);
        numbers.add(1900);
        numbers.add(9000);
        numbers.add(10009);

        Integer result = numbers.stream().min(Comparator.naturalOrder()).get();


        System.out.println("Max or min number is :" + result);

        List<Integer> oddNumbers = numbers.stream().filter(i -> (i % 2) != 0).collect(Collectors.toList());
        System.out.println("oddNumbers are :" + oddNumbers);

        TreeSet<Employee> treeSet = new TreeSet<>(new Employee());
        treeSet.add(emp1);
        treeSet.add(emp2);
        treeSet.add(emp3);
        treeSet.add(emp4);
        treeSet.add(emp5);
        treeSet.stream().forEach(i -> System.out.println(i.getName()
        ));

    }
}
