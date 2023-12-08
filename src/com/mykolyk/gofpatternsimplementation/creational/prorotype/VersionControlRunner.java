package com.mykolyk.gofpatternsimplementation.creational.prorotype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project project = new Project(1, "Java Project", "JavaCode");
        System.out.println(project);

        ProjectFactory projectFactory = new ProjectFactory(project);
        Project projectClone = projectFactory.cloneProject();
        System.out.println(projectClone);
    }
}
