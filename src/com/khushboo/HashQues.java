package com.khushboo;

import java.util.HashMap;
import java.util.Map;

public class HashQues {

    public static void main(String[] args) throws Exception {
        try {

            HashMap<String, String> mymap = new HashMap<>();

            mymap.put("Khushboo", "true");
            mymap.put("Anika", "false");

            for (Map.Entry entry : mymap.entrySet()) {
                System.out.println(entry.getKey() + "," + entry.getValue());
            }

            int a = 1/0;
        }catch(Exception e){
            throw new Exception("Mera Ex");
        }
    }
}
