package org.rokuno;

import org.rokuno.core.CoreMap;

public class RokunoApplication {

    public static void main(String[] args) {
        CoreMap db = new CoreMap();
        db.set("kills", 100);
        System.out.println(db.get("kills"));
        db.update("kills", 200);
        System.out.println(db.get("kills"));
    }
}
