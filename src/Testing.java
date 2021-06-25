import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.HashMap;

public class Testing {
    Miscellaneous misc;

    Testing() {
        misc = new Miscellaneous();
        System.out.println(misc.hashCode());
        misc = new Miscellaneous();
        System.out.println(misc.hashCode());
    }

    public static void main(String[] args) {

        System.out.println(EventState.IN_PROGRESS);
        System.out.println(EventState.IN_PROGRESS.getValue());
        HashMap<String, String> hm = new HashMap();
        hm.put("NAME", "SHALEEN");
        hm.put("test", null);
        hm.put("LASTNAME", null);
        hm.put("SAL", null);
        hm.put("OCCUPATION", "IT");
        // System.out.println(new JSONObject(hm));

        String json = null;
        try {
            json = new ObjectMapper().writeValueAsString(hm);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(json);

        Integer[] number = new Integer[10];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        number[3] = 4;
        number[4] = 5;
        number[5] = 6;
        number[6] = 7;
        number[7] = 8;
        number[8] = 9;
        number[9] = 0;

        System.out.println(number);

        Integer[] reverseNumber = new Integer[10];
        int count = 0;
        for (int i = number.length; i > 0; i--) {

            reverseNumber[i - 1] = number[count];
            count++;
        }
        System.out.println(reverseNumber);
        for (int j = 0; j < reverseNumber.length; j++) {
            System.out.println(reverseNumber[j]);
        }
    }


}