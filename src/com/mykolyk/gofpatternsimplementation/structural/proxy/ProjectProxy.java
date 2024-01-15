package com.mykolyk.gofpatternsimplementation.structural.proxy;

public class ProjectProxy implements Project {
    private String url;
    private ProjectImpl project;

    public ProjectProxy(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if(project == null) {
            project = new ProjectImpl(url);
        }
        project.run();
    }
}
