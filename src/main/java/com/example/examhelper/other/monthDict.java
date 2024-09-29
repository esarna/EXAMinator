package com.example.examhelper.other;
import java.util.HashMap;
import java.util.Map;


public class monthDict {
    public static void main(String[] args) {
        Map<Integer, Integer> months = new HashMap<>();

        months.put(1,31);
        months.put(3,31);
        months.put(5,31);
        months.put(8,31);
        months.put(10,31);
        months.put(12,31);

        months.put(4,30);
        months.put(6,30);
        months.put(9,30);
        months.put(11,30);
        months.put(2,28);
    }
}
