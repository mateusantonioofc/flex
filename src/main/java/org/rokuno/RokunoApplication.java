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
        db.put("logs", 10);
        System.out.println(db.getByIndex("usr", 0));
        System.out.println(db.getByIndex("usr", 1));
        db.update("logs", 0, null);
        db.delete("log", 0);

    }
}
