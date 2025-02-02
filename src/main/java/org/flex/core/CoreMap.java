package org.flex.core;

import org.flex.utils.InternalMap;

public class CoreMap<Key, Value> {
    private final InternalMap<Key, Value> db;

    public CoreMap() {
        this.db = new InternalMap<>();
    }
    
    public CoreMap(Key key, Value value) {
        this.db = new InternalMap<>();
        db.put(key, value);
    }
    
    public void set(Key key, Value value) {
        db.put(key, value);
    }
    
    public Value get(Key key) {
        return db.get(key);
    }
    
    public void delete(Key key) {
        db.remove(key);
    }
    
    public boolean existsKey(Key key) {
        return db.containsKey(key);
    }
    
    public boolean existsValue(Value value) {
        return db.containsValue(value);
    }
    
    public void drop() {
        db.clear();
    }
    
    public void update(Key key, Value value) {
        db.replace(key, value);
    }
}
