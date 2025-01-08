package org.rokuno.core;

import java.util.List;
import org.rokuno.utils.InternalList;

public class Database<DBName, Value> {
    
    private final InternalList<DBName, Value> database;

    public Database() {
        this.database = new InternalList<>();
    }
    
    public Database(DBName databaseName) {
        this.database = new InternalList<>();
        this.database.createList(databaseName);
    }
    
    public List selectAll(DBName database) {
        return this.database.getList(database);
    }
        
    public void createDatabase(DBName databaseName) {
        this.database.createList(databaseName);
    }
    
    public void deleteDatabase(DBName database) {
        this.database.deleteList(database);
    }
    
    public void insert(DBName database, Value value) {
        this.database.put(database, value);
    }
    
    public void delete(DBName database, int index) {
        this.database.delete(database, index);
    }
    
    public Object get(DBName database, int index) {
        return this.database.getByIndex(database, index);
    }
    
    public Object getFirstElement(DBName database) {
        return this.database.getFirstElement(database);
    }
    
    public Object getLastElement(DBName database) {
        return this.database.getLastElement(database);
    }
    
    public void deleteFirstElement(DBName database) {
        this.database.deleteFirstElement(database);
    }
    
    public void deleteLastElement(DBName database) {
        this.database.deleteLastElement(database);
    }
    
    public void insertInFirstPosition(DBName database, Value value) {
        this.database.addFirstElement(database, value);
    }
    
    public void insertInLastPosition(DBName database, Value value) {
        this.database.addLastElement(database, value);
    }
    
    public void clear(DBName database) {
        this.database.clear(database);
    }
    
    public void deleteAllDatabases(DBName database) {
        this.database.deleteAllLists();
    }
    
    public int size(DBName database) {
        return this.database.size(database);
    }
    
    public int countDatabases() {
        return database.sizeAll();
    }
    
    public boolean containsElement(DBName database, Value value) {
        return this.database.contains(database, value);
    }
    
    public boolean hasElementosInDatabase(Value value) {
        return this.database.hasValueInDatabase(value);
    }
    
    public boolean hasDatabase(DBName database) {
        return this.database.hasDatabase(database);
    }
    
    public int indexOf(DBName database, Value value) {
        return this.database.indexOf(database, value);
    }
    
    public void update(DBName database, int index, Value newValue) {
        this.database.update(database, index, newValue);
    }  
}
