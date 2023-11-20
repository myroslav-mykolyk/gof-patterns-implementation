package com.mykolyk.gofpatternsimplementation.creational.abstractfactory.banking;

import com.mykolyk.gofpatternsimplementation.creational.abstractfactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java developer writes Java code!");
    }
}
