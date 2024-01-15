package com.mykolyk.gofpatternsimplementation.structural.proxy;

public class ProjectImpl implements Project {
    private String url;

    public ProjectImpl(String url) {
        this.url = url;
        load();
    }

    public void load() {
        System.out.println("Project from: " + url + " loaded!");
    }

    @Override
    public void run() {
        System.out.println("Project from: " + url + " runned!");
    }
}
