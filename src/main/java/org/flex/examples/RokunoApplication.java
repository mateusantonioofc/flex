package org.flex.examples;

import org.flex.core.Database;

public class RokunoApplication {

    public static void main(String[] args) {
        Database db = new Database();
        db.createDatabase("usuarios");
        db.createDatabase("adm");
        
        db.insert("usuarios", "Mateus");
        db.insert("usuarios", "Pedro");
        db.insert("usuarios", "Joao");
        db.insert("usuarios", "Ana");
        
        System.out.println(db.selectAll("usuarios"));
        System.out.println(db.countDatabases());
        System.out.println(db.containsElement("usuarios", "Mateus"));
        System.out.println(db.get("usuarios", 2));
        System.out.println(db.hasDatabase("logs"));
        System.out.println(db.size("usuarios"));
    }
}
