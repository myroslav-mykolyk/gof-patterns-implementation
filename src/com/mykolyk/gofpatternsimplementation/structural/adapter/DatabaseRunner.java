package com.mykolyk.gofpatternsimplementation.structural.adapter;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new JavaApplicationToDatabaseAdapter();
        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
