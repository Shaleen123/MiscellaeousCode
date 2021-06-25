public class ArrayManipulation {

    public static void main(String[] args) {

        Integer[] randomNumber = {10,70,30,90,20,20,30,40,70,50};

        int count = 0;
        Integer[] duplicateNumbers = new Integer[randomNumber.length];
        for (int i = 0; i < randomNumber.length-1; i++) {

            if (randomNumber[i] == randomNumber[i+1]) {
                duplicateNumbers[count++] = randomNumber[i];

            }
        }

        for (int j = 0; j < duplicateNumbers.length; j++) {
            if (duplicateNumbers[j] != null)
                System.out.println(duplicateNumbers[j]);
        }


    }

}
