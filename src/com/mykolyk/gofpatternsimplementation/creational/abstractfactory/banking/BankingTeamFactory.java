package com.mykolyk.gofpatternsimplementation.creational.abstractfactory.banking;

import com.mykolyk.gofpatternsimplementation.creational.abstractfactory.Developer;
import com.mykolyk.gofpatternsimplementation.creational.abstractfactory.ProjectManager;
import com.mykolyk.gofpatternsimplementation.creational.abstractfactory.ProjectTeamFactory;
import com.mykolyk.gofpatternsimplementation.creational.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new BankingTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingProjectManager();
    }
}
