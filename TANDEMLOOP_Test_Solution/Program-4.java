package practic;


import java.util.HashMap;
import java.util.Map;

public class Count_of_Number {
    public static void main(String[] args) {
        int[] input = {1, 2, 8, 9, 12, 46, 76, 82, 15, 20, 30};
        int[] multiples = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Map<Integer, Integer> countMap = new HashMap<>();
        for (int num : multiples) {
            countMap.put(num, 0);
        }

        for (int num : input) {
            for (int multiple : multiples) {
                if (num % multiple == 0) {
                    countMap.put(multiple, countMap.get(multiple) + 1);
                }
            }
        }

        boolean isFirst = true;
        System.out.print("{");
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (isFirst) {
                System.out.print(entry.getKey() + " : " + entry.getValue());
                isFirst = false;
            } else {
                System.out.print(", " + entry.getKey() + " : " + entry.getValue());
            }
        }
        System.out.print("}");


    }
}