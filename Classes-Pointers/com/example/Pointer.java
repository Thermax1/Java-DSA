package com.example;

import java.util.HashMap;

public class Pointer {

    public static void main(String[] args) {
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        map1.put("value",11);
        map2 = map1;

        map1.put("value",22);

        //both are 22 now because the pointer is the adrress where the hashmap is, so both maps point to the same address
        System.out.println(map1);
        System.out.println(map2);;
    }
}
