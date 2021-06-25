import java.util.ArrayList;
import java.util.List;

public class PractiveJava8 {
    Miscellaneous misc;

    PractiveJava8() {
    /*    misc = new Miscellaneous();
        System.out.println(misc.hashCode());
        misc = new Miscellaneous();
        System.out.println(misc.hashCode());
*/
        List al = new ArrayList();
        al.add(1);
        List al2 = (List) ((ArrayList) al).clone();
        System.out.println(al);
        System.out.println(al.hashCode());
        System.out.println(al2);
        System.out.println(al2.hashCode());

    }


    public static void main(String[] args) {
        PractiveJava8 practiveJava8 = new PractiveJava8();
    /*    List<Integer> list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        List list2 = new ArrayList();
        list2.add(6);
        list2.add(7);
        list2.add(8);
        list2.add(9);
        list2.add(10);

        List<Integer> list3 = new ArrayList();
        list3.add(5);
        list3.add(4);
        list3.add(3);
        list3.add(2);
        list3.add(1);

        //list2.add(list3);

        List<List<Integer>> numbersList = new ArrayList<>();
        numbersList.add(list);
        numbersList.add(list2);
        System.out.println("Before" + numbersList);


        numbersList.stream().flatMap(integers -> integers.stream()).forEach(System.out::println);
      //  System.out.println("After" + al);
*/
    }
}
