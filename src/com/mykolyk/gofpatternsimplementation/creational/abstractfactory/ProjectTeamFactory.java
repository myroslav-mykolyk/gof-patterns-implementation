package com.mykolyk.gofpatternsimplementation.creational.abstractfactory;

public interface ProjectTeamFactory {
    Developer getDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();
}
