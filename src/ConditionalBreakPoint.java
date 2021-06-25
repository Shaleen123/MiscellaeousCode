import java.util.ArrayList;
import java.util.List;

public class ConditionalBreakPoint {

    public static void main(String[] args) {

        List<String> al = new ArrayList<String>();

        al.add("shaleen");
        al.add("mahesh");
        al.add("rahul");
        al.add("nitin");
        al.add("vidyasagar");

        if ("abc".equals(null)) {
            System.out.print("hoyo");
        } else {
            System.out.println("yoyoyoyo");
        }

        for (String names : al)
            System.out.println(names);

    }
}
