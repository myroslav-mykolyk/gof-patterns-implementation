package com.mykolyk.gofpatternsimplementation.creational.abstractfactory;

import com.mykolyk.gofpatternsimplementation.creational.abstractfactory.banking.BankingTeamFactory;

public class BankSystemProgram {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new BankingTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        developer.writeCode();
        tester.testProject();
        projectManager.manageProject();
    }
}
