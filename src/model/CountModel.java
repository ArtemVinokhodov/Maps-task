package model;

import entity.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class CountModel {
    public void getId() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input id: ");
        int inputId = Integer.parseInt(scanner.nextLine().trim());
        Map<Integer, Product> allData = getData();
        for (Map.Entry<Integer, Product> entry : allData.entrySet()) {
            if (inputId == entry.getKey()) {
                System.out.println(entry.getValue());
            }
        }
    }

    public  Map<Integer, Product> getData() {
        Map<Integer, Product> map = new HashMap<>();
        map.put(101, new Product("Banana", "5", "10"));
        map.put(102, new Product("Tomato", "14", "20"));
        map.put(103, new Product("Jem", "71", "30"));
        return map;
    }

    public void getOutput(Map<Integer, Product> map) {
        AtomicInteger count = new AtomicInteger(0);
        map.forEach(
                (key, value) ->
                        System.out.println(count.incrementAndGet() +
                                ") id " + key + ", " + value)
        );
    }
}
