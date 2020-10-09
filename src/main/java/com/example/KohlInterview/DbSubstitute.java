package com.example.KohlInterview;

import java.util.HashMap;
import java.util.Map;

public class DbSubstitute {
    private Map<Integer, Item> map;

    public DbSubstitute(){
        map = new HashMap<>();
        Item item1 = new Item(1, "Portfolio 1","Long","AEO","10001",
                203121,0,203121,0,13.835);
        Item item2 = new Item(2, "Portfolio 2","Long","QWE","10001",
                303122,0,303122,0,45.835);
        Item item3 = new Item(3, "Portfolio 1","Short","DFG","10002",
                403124,0,403124,0,-44.099);
        Item item4 = new Item(4, "Portfolio 2","Short","HJK","10002",
                503122,0,503122,0,-78.835);
        map.put(1, item1);
        map.put(2, item2);
        map.put(3, item3);
        map.put(4, item4);
    }

    public Map<Integer, Item> getMap(){
        return map;
    }

    public void addItem(Item item) {
        map.put(item.getId(), item);
    }

}
