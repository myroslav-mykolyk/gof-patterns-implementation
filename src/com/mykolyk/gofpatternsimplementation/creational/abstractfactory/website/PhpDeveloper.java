package com.mykolyk.gofpatternsimplementation.creational.abstractfactory.website;

import com.mykolyk.gofpatternsimplementation.creational.abstractfactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP developer writes PHP code!");
    }
}
