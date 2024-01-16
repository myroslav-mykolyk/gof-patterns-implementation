package com.mykolyk.gofpatternsimplementation.behavioral.command;

public class Database {
    public void insert() {
        System.out.println("Record inserted!");
    }

    public void update() {
        System.out.println("Record updated!");
    }

    public void select() {
        System.out.println("Record selected!");
    }

    public void delete() {
        System.out.println("Record deleted!");
    }
}
