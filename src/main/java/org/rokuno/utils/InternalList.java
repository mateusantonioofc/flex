package org.rokuno.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InternalList<Database, Value> {
    
    private final Map<Database, List<Object>> dbLists;
    
    public InternalList() {
       this.dbLists = new HashMap<>();
    }
    
    private List getList(Database database) {
        return dbLists.get(database);
    }
    
    public void createList(Database database) { 
        dbLists.put(database, new ArrayList<>());
    }
    
    public void deleteList(Database database) {
        dbLists.remove(database);
    } 
    
    public void put(Database database, Value value) {
        List<Object> list = getList(database);
        list.add(value);
    }
    
    public void delete(Database database, int index) {
        List<Object> list = getList(database);
        list.remove(index);
    }
    
    public Object getFirstElement(Database database) {
        List<Object> list = getList(database);
        return list.getFirst();
    }
    
    public Object getLastElement(Database database) {
        List<Object> list = getList(database);
        return list.getLast();
    }
    
    public void deleteFirstElement(Database database) {
        List<Object> list = getList(database);
        list.removeFirst();
    }
    
    public void deleteLastElement(Database database) {
        List<Object> list = getList(database);
        list.removeLast();
    }
    
    public Object getByIndex(Database database, int index) {
        List<Object> list = getList(database);
        return list.get(index);
    }
    
    public void clear(Database database) {
        List<Object> list = getList(database);
        list.clear();
    }
    
    public int size(Database database) {
        List<Object> list = getList(database);
        return list.size();
    }
    
    public boolean contains(Database database, Value value) {
        List<Object> list = getList(database);
        return list.contains(value);
    }
    
    public int indexOf(Database database, Value value) {
        List<Object> list = getList(database);
        return list.indexOf(value);
    }
    
    public void update(Database database, int index, Value newValue) {
        List<Object> list = getList(database);
        list.set(index, newValue);
    }
    
    public void k(Database database) {
        List<Object> list = getList(database);
        list.
    }
    
}
