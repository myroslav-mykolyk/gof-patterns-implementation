package com.mykolyk.gofpatternsimplementation.creational.abstractfactory.banking;

import com.mykolyk.gofpatternsimplementation.creational.abstractfactory.ProjectManager;

public class BankingProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking project manager manages project!");
    }
}
