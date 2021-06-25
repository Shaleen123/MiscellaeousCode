import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Miscellaneous {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Shaleen", 34, 17);
        Employee emp2 = new Employee("Rajesh", 33, 16);
        Employee emp3 = new Employee("Chinky", 26, 4);
        Employee emp4 = new Employee("Aniket", 27, 5);
        Employee emp5 = new Employee("Baba", 30, 5);
        Map<Employee, String> hmEmployee = new HashMap();

   /*     List<Employee> empList = new ArrayList();
        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);


       // Collections.sort(empList);

        for (Employee emp : empList) {
            System.out.println(emp.getName());

        }
*/
        hmEmployee.put(emp1, "Shaleen");
        hmEmployee.put(emp2, "Rajesh");
        hmEmployee.put(emp3, "Chinky");
        hmEmployee.put(emp4, "Aniket");
        hmEmployee.put(emp5, "Baba");

        Set<Employee> set = hmEmployee.keySet();
        Iterator itr = set.iterator();
        List<Employee> empList2 = new ArrayList<>();

        while (itr.hasNext()) {
            empList2.add((Employee) itr.next());
        }
        Collections.sort(empList2, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Employee emp : empList2) {
            System.out.println(emp.getName());

        }

        Map map = new HashMap();
        String a ="shaleen";



        //  Map treeMap = new TreeMap(hmEmployee);

        // System.out.println(treeMap);

    }
}
