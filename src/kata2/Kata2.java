package kata2;

import java.util.*;

public class Kata2 {

    public static void main(String[] args) {

        String[] data = {"Rosa", "Pepe", "María", "Pepe", "Pepe", "Rosa"};
        Histogram histogram = new Histogram(data);
        Map<String, Integer> histogr = histogram.getHistogram();
        histogr.keySet().forEach((key) -> {
            System.out.println(key + "==>" + histogr.get(key));
        });
    }
}
