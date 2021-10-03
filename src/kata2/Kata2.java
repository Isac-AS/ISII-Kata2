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

        for (int key : data) {
            histogram.put(key, histogram.containsKey(key) ? histogram.get(key) + 1 : 1);
        }
        
        histogram.keySet().forEach((key) -> {
            System.out.println(key + "==>" + histogram.get(key));
        });

    }

}
