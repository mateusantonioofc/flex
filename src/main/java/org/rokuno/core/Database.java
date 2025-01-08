package org.rokuno.core;

import java.util.List;
import org.rokuno.utils.InternalList;

public class Database<Database, Value> {
    
    private final InternalList<Database, Value> database;

    public Database() {
        this.database = new InternalList<>();
    }
    
    public Database(Database databaseName) {
        this.database = new InternalList<>();
        this.database.createList(databaseName);
    }
    
    public List selectAll(Database database) {
        return this.database.getList(database);
    }
        
    public void createDatabase(Database databaseName) {
        this.database.createList(databaseName);
    }
    
    public void deleteDatabase(Database database) {
        this.database.deleteList(database);
    }
    
    public void insert(Database database, Value value) {
        this.database.put(database, value);
    }
    
    public void delete(Database database, int index) {
        this.database.delete(database, index);
    }
    
    public Object get(Database database, int index) {
        return this.database.getByIndex(database, index);
    }
    
    public Object getFirstElement(Database database) {
        return this.database.getFirstElement(database);
    }
    
    public Object getLastElement(Database database) {
        return this.database.getLastElement(database);
    }
    
    public void deleteFirstElement(Database database) {
        this.database.deleteFirstElement(database);
    }
    
    public void deleteLastElement(Database database) {
        this.database.deleteLastElement(database);
    }
    
    public void insertInFirstPosition(Database database, Value value) {
        this.database.addFirstElement(database, value);
    }
    
    public void insertInLastPosition(Database database, Value value) {
        this.database.addLastElement(database, value);
    }
    
    public void clear(Database database) {
        this.database.clear(database);
    }
    
    public void deleteAllDatabases(Database database) {
        this.database.deleteAllLists();
    }
    
    public int size(Database database) {
        return this.database.size(database);
    }
    
    public int countDatabases() {
        return database.sizeAll();
    }
    
    public boolean containsElement(Database database, Value value) {
        return this.database.contains(database, value);
    }
    
    public boolean hasElementosInDatabase(Value value) {
        return this.database.hasValueInDatabase(value);
    }
    
    public boolean hasDatabase(Database database) {
        return this.database.hasDatabase(database);
    }
    
    public int indexOf(Database database, Value value) {
        return this.database.indexOf(database, value);
    }
    
    public void update(Database database, int index, Value newValue) {
        this.database.update(database, index, newValue);
    }  
}
