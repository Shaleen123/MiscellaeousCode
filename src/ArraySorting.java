import java.util.Arrays;

public class ArraySorting {

    public static void main(String[] args) {
        Integer numbers[] = {1, 2, 9, 8, 5, 6, 3, 4, 7};
        int temp;

        for (int i = 0; i < numbers.length - 1; i++) {

            if (numbers[i] > numbers[i + 1]) {
                temp = numbers[i];
                numbers[i] = numbers[i + 1];
                numbers[i + 1] = temp;
                i = -1;
            }

        }
        Arrays.stream(numbers).forEach(integer -> System.out.println(integer));
    }

}