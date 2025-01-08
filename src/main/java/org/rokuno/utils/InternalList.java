package org.rokuno.utils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import org.rokuno.exceptions.DatabaseAlreadyExistException;
import org.rokuno.exceptions.DatabaseNotFoundException;
import org.rokuno.exceptions.NullValueException;

public class InternalList<Database, Value> {
    
    private final Map<Database, List<Object>> dbLists;
    
    public InternalList() {
       this.dbLists = new HashMap<>();
    }
    
    public List getList(Database database) {
        if (!dbLists.containsKey(database)) {
            throw new DatabaseAlreadyExistException("Database already exist!");
        }
        return dbLists.get(database);
    }
    
    public void createList(Database database) { 
        if (dbLists.containsKey(database)) {
            throw new DatabaseAlreadyExistException("Database already exist!");
        }
        dbLists.put(database, new ArrayList<>());
    }
    
    public void deleteList(Database database) {
        if (!dbLists.containsKey(database)) {
            throw new DatabaseNotFoundException("Database not found!");
        }
        dbLists.remove(database);
    } 
    
    public void put(Database database, Value value) {
        if (!dbLists.containsKey(database)) {
            throw new DatabaseNotFoundException("Database not found!");
        }
        if(value == null) {
            throw new NullValueException("Value does not null");
        }
        List<Object> list = getList(database);
        list.add(value);
    }
    
    public void delete(Database database, int index) {
        if (!dbLists.containsKey(database)) {
            throw new DatabaseNotFoundException("Database not found!");
        }
        List<Object> list = getList(database);
        if (index > list.size()) {
            throw new IndexOutOfBoundsException();
        }
        
        list.remove(index);
    }
    
    public Object getFirstElement(Database database) {
        if (!dbLists.containsKey(database)) {
            throw new DatabaseNotFoundException("Database not found!");
        }
        List<Object> list = getList(database);
        return list.getFirst();
    }
    
    public Object getLastElement(Database database) {
        if (!dbLists.containsKey(database)) {
            throw new DatabaseNotFoundException("Database not found!");
        }
        List<Object> list = getList(database);
        return list.getLast();
    }
    
    public void deleteFirstElement(Database database) {
        if (!dbLists.containsKey(database)) {
            throw new DatabaseNotFoundException("Database not found!");
        }
        List<Object> list = getList(database);
        list.removeFirst();
    }
    
    public void deleteLastElement(Database database) {
        if (!dbLists.containsKey(database)) {
            throw new DatabaseNotFoundException("Database not found!");
        }
        List<Object> list = getList(database);
        list.removeLast();
    }
    
    public void addFirstElement(Database database, Value value) {
        if (!dbLists.containsKey(database)) {
            throw new DatabaseNotFoundException("Database not found!");
        }
        if(value == null) {
            throw new NullValueException("Value does not null");
        }
        List<Object> list = getList(database);
        list.addFirst(value);
    }
    
    public void addLastElement(Database database, Value value) {
        if (!dbLists.containsKey(database)) {
            throw new DatabaseNotFoundException("Database not found!");
        }
        if(value == null) {
            throw new NullValueException("Value does not null");
        }
        List<Object> list = getList(database);
        list.addLast(value);
    }
    
    public Object getByIndex(Database database, int index) {
        if (!dbLists.containsKey(database)) {
            throw new DatabaseNotFoundException("Database not found!");
        }
        List<Object> list = getList(database);
        if (index > list.size()) {
            throw new IndexOutOfBoundsException();
        }
        return list.get(index);
    }
    
    public void clear(Database database) {
        if (!dbLists.containsKey(database)) {
            throw new DatabaseNotFoundException("Database not found!");
        }
        List<Object> list = getList(database);
        list.clear();
    }
    
    public int size(Database database) {
        if (!dbLists.containsKey(database)) {
            throw new DatabaseNotFoundException("Database not found!");
        }
        List<Object> list = getList(database);
        return list.size();
    }
    
    public int sizeAll() {
        return dbLists.size();
    }
    
    public boolean contains(Database database, Value value) {
        if (!dbLists.containsKey(database)) {
            throw new DatabaseNotFoundException("Database not found!");
        }
        if(value == null) {
            throw new NullValueException("Value does not null");
        }
        List<Object> list = getList(database);
        return list.contains(value);
    }
    
    public boolean hasValueInDatabase(Value value) {
        if(value == null) {
            throw new NullValueException("Value does not null");
        }
        
        for (List<Object> query : dbLists.values()) {
            if (query.contains(value)) {
                return true;
            }
        }
        return false;
    }
    
    public boolean hasDatabase(Database database) {
        return dbLists.containsKey(database);
    }
    
    public int indexOf(Database database, Value value) {
        if (!dbLists.containsKey(database)) {
            throw new DatabaseNotFoundException("Database not found!");
        }
        if(value == null) {
            throw new NullValueException("Value does not null");
        }
        List<Object> list = getList(database);
        return list.indexOf(value);
    }
    
    public void update(Database database, int index, Value newValue) {
        if (!dbLists.containsKey(database)) {
            throw new DatabaseNotFoundException("Database not found!");
        }
        if(newValue == null) {
            throw new NullValueException("Value does not null");
        }
        List<Object> list = getList(database);
        if (index > list.size()) {
            throw new IndexOutOfBoundsException();
        }
        list.set(index, newValue);
    }

    public void deleteAllLists() {
        dbLists.clear();
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.dbLists);
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
        final InternalList<?, ?> other = (InternalList<?, ?>) obj;
        return Objects.equals(this.dbLists, other.dbLists);
    }

    @Override
    public String toString() {
        return "InternalList{" + "dbLists=" + dbLists + '}';
    }
    
}
