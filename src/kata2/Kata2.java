package kata2;

import java.util.*;

public class Kata2 {

    public static void main(String[] args) {

        int[] data = new int[15];
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(15);
        }
        HashMap<Integer, Integer> histogram = new HashMap<>();

        for (int i = 0; i < data.length; i++) {
            if (histogram.containsKey(data[i])) {
                histogram.put(data[i], histogram.get(data[i]) + 1);
            } else {
                histogram.put(data[i], 1);
            }
        }

        histogram.keySet().forEach((key) -> {
            System.out.println(key + "==>" + histogram.get(key));
        });

    }

}
