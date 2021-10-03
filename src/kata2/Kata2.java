package kata2;

import java.util.*;

public class Kata2 {

    public static void main(String[] args) {

        Integer[] data = new Integer[15];
        Random rand = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = rand.nextInt(15);
        }
        
        Histogram histogram = new Histogram(data);
        Map<Integer, Integer> histogr = histogram.getHistogram();
        histogr.keySet().forEach((key) -> {
            System.out.println(key + "==>" + histogr.get(key));
        });
    }
}
