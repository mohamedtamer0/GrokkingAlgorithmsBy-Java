package com.company.chapter5hashtables;

import java.util.HashMap;
import java.util.Map;

public class CheckVoter {
    private static Map<String, Boolean> voted = new HashMap<>();

    private static void checkVoter(String name) {
        if (voted.containsKey(name))
            System.out.println("Kick them out!");
        else
            voted.put(name, true);
        System.out.println("let them voted!");
    }

    public static void main(String[] args) {
        checkVoter("tom");
        checkVoter("mike");
        checkVoter("mike");
    }

}
