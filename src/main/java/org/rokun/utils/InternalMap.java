package org.rokun.utils;

import java.util.Map;
import java.util.HashMap;
import org.rokuno.exceptions.KeyNotFoundException;
import org.rokuno.exceptions.NullKeyOrValueException;

public class InternalMap<Key, Value> {
    
    private final Map<Key, Value> map;

    public InternalMap() {
        this.map = new HashMap<>();
    }
    
    public void put(Key key, Value value) {
        if (key == null || value == null) {
            throw new NullKeyOrValueException("Key or Value connot be null");
        }
        map.put(key, value);
    }
    
    public Value get(Key key) {
        if (!map.containsKey(key)) {
            throw new KeyNotFoundException("Key not found! " + key);
        }
        return map.get(key);
    }
    
    public void remove(Key key) {
        if (!map.containsKey(key)) {
            throw new KeyNotFoundException("Key not found! " + key);
        }
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
