package org.rokuno;

import org.rokuno.core.CoreMap;
import org.rokuno.utils.InternalList;

public class RokunoApplication {

    public static void main(String[] args) {
        InternalList db = new InternalList();
        db.createList("usr");
        db.createList("logs");
        db.put("usr", "Mateus");
        db.put("usr", "Ana");
        System.out.println(db.searchValueInDatabase("Ana"));
        System.out.println(db.hasValueInDatabase("Joao"));

    }
}
