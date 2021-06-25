public class LongestString {

    public static void main(String[] args) {

        String[] words = {"abcde", "newsd", "shaleeen", "mahesh", "nitin", "Rajesh", "Rasika", "Shikha", "abcdefghijkl"};

        String longestWord = new String();

        longestWord.length();

        for (String word : words) {

            if (word.length() != 0) {
                if (word.length() > longestWord.length())
                    longestWord = word;
            }

        }
        System.out.println(longestWord);
        int m = 1;

        for (int i = 1; i <= 6; i++) {
            m = m * i;
        }
        System.out.println("factorial" + " " + m);
    }


}
