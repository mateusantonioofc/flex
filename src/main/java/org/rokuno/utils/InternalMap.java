package org.rokuno.utils;

import java.util.Map;
import java.util.HashMap;
import java.util.Objects;
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

    @Override
    public String toString() {
        return "InternalMap{" + "map=" + map + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.map);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final InternalMap<?, ?> other = (InternalMap<?, ?>) obj;
        return Objects.equals(this.map, other.map);
    }
    
}
