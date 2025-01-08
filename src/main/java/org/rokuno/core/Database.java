package org.rokuno.core;

import org.rokuno.utils.InternalList;

public class Database<Database, Value> extends InternalList<Database, Value>{
    
    private final InternalList<Database, Value> database;

    public Database() {
        this.database = new InternalList<>();
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
    
    @Override
    public void delete(Database database, int index) {
        this.database.delete(database, index);
    }
    
    public Object get(Database database, int index) {
        return this.database.getByIndex(database, index);
    }
    
    @Override
    public Object getFirstElement(Database database) {
        return this.database.getFirstElement(database);
    }
    
    @Override
    public Object getLastElement(Database database) {
        return this.database.getLastElement(database);
    }
    
    @Override
    public void deleteFirstElement(Database database) {
        this.database.deleteFirstElement(database);
    }
    
    @Override
    public void deleteLastElement(Database database) {
        this.database.deleteLastElement(database);
    }
    
    public void insertInFirstPosition(Database database, Value value) {
        this.database.addFirstElement(database, value);
    }
    
    public void insertInLastPosition(Database database, Value value) {
        this.database.addLastElement(database, value);
    }
    
    @Override
    public void clear(Database database) {
        this.database.clear(database);
    }
    
    public void clearAllDatabases(Database database) {
        this.database.deleteAllLists();
    }
    
    @Override
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
    
    @Override
    public boolean hasDatabase(Database database) {
        return this.database.hasDatabase(database);
    }
    
    @Override
    public int indexOf(Database database, Value value) {
        return this.database.indexOf(database, value);
    }
    
    public void update(Database database, int index, Value newValue) {
        this.database.update(database, index, newValue);
    }
}
