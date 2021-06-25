import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class StaticClassTesting {
    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof StaticClassTesting)) return false;
        StaticClassTesting that = (StaticClassTesting) o;
        return empId == that.empId &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, empId);
    }

    int empId;
    static int x;

    void increment() {
        x++;
    }


    public static void main(String[] args) {
        StaticClassTesting staticClassTesting = new StaticClassTesting();
        staticClassTesting.name = "ravi";
        staticClassTesting.empId = 1;

        StaticClassTesting staticClassTesting2 = new StaticClassTesting();
        staticClassTesting2.name = "ram";
        staticClassTesting2.empId = 2;

        StaticClassTesting staticClassTesting3 = new StaticClassTesting();
        staticClassTesting3.name = "ram";
        staticClassTesting3.empId = 2;
        System.out.println(staticClassTesting.equals(staticClassTesting2));//false
        System.out.println(staticClassTesting2.equals(staticClassTesting3));//true

        String a = "ram";
        String b = "ram";
        System.out.println(a.hashCode());
        System.out.println(b.hashCode());
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a.hashCode() == b.hashCode());


        Map<StaticClassTesting, Integer> map = new HashMap();
        map.put(staticClassTesting2, 1);
        System.out.println("Map returning value" + map.get(staticClassTesting3));

        String x = "10";
        String y = "10";
        System.out.println(x == y);
        x = "1000";
        y = "1000";
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(x == y);


    }
}
