package org.flex.core;

import java.util.List;
import org.flex.utils.InternalList;

public class Database<DBName, Value> {
    
    private final InternalList<DBName, Value> database;

    public Database() {
        this.database = new InternalList<>();
    }
    
    /**
     * Init database and create new database
     * @param databaseName
     */
    public Database(DBName databaseName) {
        this.database = new InternalList<>();
        this.database.createList(databaseName);
    }
    
    /**
     * Return all elements
     * @param database
     * @return List
     */
    public List selectAll(DBName database) {
        return this.database.getList(database);
    }
        
    /**
     * Create a new database
     * @param databaseName
     */
    public void createDatabase(DBName databaseName) {
        this.database.createList(databaseName);
    }
    
    /**
     * Delete database
     * @param database
     */
    public void deleteDatabase(DBName database) {
        this.database.deleteList(database);
    }
    
    /**
     * Insert new element in database
     * @param database
     * @param value
     */
    public void insert(DBName database, Value value) {
        this.database.put(database, value);
    }
    
    /**
     * Delete element in database
     * @param database
     * @param index
     */
    public void delete(DBName database, int index) {
        this.database.delete(database, index);
    }
    
    /**
     * Return element by index
     * @param database
     * @param index
     * @return Object
     */
    public Object get(DBName database, int index) {
        return this.database.getByIndex(database, index);
    }
    
    /**
     * Return first element in database
     * @param database
     * @return Object
     */
    public Object getFirstElement(DBName database) {
        return this.database.getFirstElement(database);
    }
    
    /**
     * Return last element in database
     * @param database
     * @return Object
     */
    public Object getLastElement(DBName database) {
        return this.database.getLastElement(database);
    }
    
    /**
     * Delete first element in database
     * @param database
     */
    public void deleteFirstElement(DBName database) {
        this.database.deleteFirstElement(database);
    }
    
    /**
     * Delete last element in database
     * @param database
     */
    public void deleteLastElement(DBName database) {
        this.database.deleteLastElement(database);
    }
    
    /**
     * Insert element in first position on database
     * @param database
     * @param value
     */
    public void insertInFirstPosition(DBName database, Value value) {
        this.database.addFirstElement(database, value);
    }
    
    /**
     * Insert element in last position on database
     * @param database
     * @param value
     */
    public void insertInLastPosition(DBName database, Value value) {
        this.database.addLastElement(database, value);
    }
    
    /**
     * Remove all elements
     * @param database
     */
    public void clear(DBName database) {
        this.database.clear(database);
    }
    
    /**
     * Delete all databases 
     * @param database
     */
    public void deleteAllDatabases(DBName database) {
        this.database.deleteAllLists();
    }
    
    /**
     * Return database size
     * @param database
     * @return
     */
    public int size(DBName database) {
        return this.database.size(database);
    }
    
    /**
     * Return count of databases
     * @return
     */
    public int countDatabases() {
        return database.sizeAll();
    }
    
    /**
     * Verify if element exist in database
     * @param database
     * @param value
     * @return boolean
     */
    public boolean containsElement(DBName database, Value value) {
        return this.database.contains(database, value);
    }
    
    /**
     * Verify if element exist
     * @param value
     * @return boolean
     */
    public boolean hasElementosInDatabase(Value value) {
        return this.database.hasValueInDatabase(value);
    }
    
    /**
     * Verify if database exist
     * @param database
     * @return boolean
     */
    public boolean hasDatabase(DBName database) {
        return this.database.hasDatabase(database);
    }
    
    /**
     * Verify if database empty
     * @return boolean
     */
    public boolean isEmpty() {
        return this.database.isEmpty();
    }
    
    /**
     * Return index of element
     * @param database
     * @param value
     * @return int
     */
    public int indexOf(DBName database, Value value) {
        return this.database.indexOf(database, value);
    }
    
    /**
     * Update value
     * @param database
     * @param index
     * @param newValue
     */
    public void update(DBName database, int index, Value newValue) {
        this.database.update(database, index, newValue);
    }  
}
