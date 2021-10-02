package com.company.chapter5hashtables;

import java.util.HashMap;
import java.util.Map;

public class PriceOfGroceries {
    public static void main(String[] args) {
        Map<String, Double> book = new HashMap<>();

        book.put("apple", 1.56);
        book.put("milk", 5.56);
        System.out.println(book);// {apple=1.56, milk=5.56}
    }
}
