package com.mykolyk.gofpatternsimplementation.creational.abstractfactory.website;

import com.mykolyk.gofpatternsimplementation.creational.abstractfactory.Developer;
import com.mykolyk.gofpatternsimplementation.creational.abstractfactory.ProjectManager;
import com.mykolyk.gofpatternsimplementation.creational.abstractfactory.ProjectTeamFactory;
import com.mykolyk.gofpatternsimplementation.creational.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new WebsiteTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsiteProjectManager();
    }
}
