import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListElementsCount {

    public static void main(String[] args) {
        List<Integer> amounts = new ArrayList<>();
        Map<Integer, Integer> countMap = new HashMap<>();
        amounts.add(1);
        amounts.add(2);
        amounts.add(2);
        amounts.add(3);
        amounts.add(3);
        amounts.add(3);
        amounts.add(1);
        amounts.add(4);
        Integer count = 0;
        for (int amount : amounts) {
            count = countMap.get(amount);
            if (count == null) {
                countMap.put(amount, 1);
            } else {
                countMap.put(amount, count + 1);
            }
        }
        System.out.println("counts:" + countMap);
    }
}
