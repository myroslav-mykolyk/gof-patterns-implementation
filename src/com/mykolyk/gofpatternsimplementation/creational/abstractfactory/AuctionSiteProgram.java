package com.mykolyk.gofpatternsimplementation.creational.abstractfactory;

import com.mykolyk.gofpatternsimplementation.creational.abstractfactory.website.WebsiteTeamFactory;

public class AuctionSiteProgram {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        developer.writeCode();
        tester.testProject();
        projectManager.manageProject();
    }
}
