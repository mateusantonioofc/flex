package org.rokun.utils.impl;

public interface KeyValue<Key, Value> {

    void clear();

    boolean containsKey(Key key);

    boolean containsValue(Value value);

    @Override
    boolean equals(Object obj);

    Value get(Key key);

    @Override
    int hashCode();

    void put(Key key, Value value);

    void remove(Key key);

    int size();

    @Override
    String toString();
    
}
