package com.mykolyk.gofpatternsimplementation.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProjectProxy("https://github.com/myroslav-mykolyk/gof-patterns-implementation");
        project.run();
    }
}
