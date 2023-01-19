package ru.tinkoff.fintech;

import java.util.HashMap;
import java.util.Map;

public class MapHandler {
    public static Map<String, String> handleMap(Map<String, String> map){
        HashMap<String, String> mapRes = new HashMap<>();
        for (Map.Entry<String, String> entry: map.entrySet()){
           if (mapRes.containsKey(entry.getValue()))
               mapRes.replace(entry.getValue(), mapRes.get(entry.getValue()) + "," + entry.getKey());
           else
               mapRes.put(entry.getValue(), entry.getKey());
        }
        return mapRes;
    }
}