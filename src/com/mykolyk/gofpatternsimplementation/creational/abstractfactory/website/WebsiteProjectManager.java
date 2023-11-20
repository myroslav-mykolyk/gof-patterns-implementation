package com.mykolyk.gofpatternsimplementation.creational.abstractfactory.website;

import com.mykolyk.gofpatternsimplementation.creational.abstractfactory.ProjectManager;

public class WebsiteProjectManager implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website project manager manages project!");
    }
}
