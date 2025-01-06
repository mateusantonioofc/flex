package org.rokun.utils;

import java.util.Map;
import java.util.HashMap;

public class InternalMap<Key, Value> {
    
    private final Map<Key, Value> map;

    public InternalMap() {
        this.map = new HashMap<>();
    }
    
    public void put(Key key, Value value) {
        map.put(key, value);
    }
    
    public Value get(Key key) {
        return map.get(key);
    }
    
    public void remove(Key key) {
        map.remove(key);
    }
    
    public boolean containsKey(Key key) {
        return map.containsKey(key);
    }
    
    public boolean containsValue(Value value) {
        return map.containsValue(value);
    }

    public int size() {
        return map.size();
    }
    
    public void clear() {
        map.clear();
    }
       
}
