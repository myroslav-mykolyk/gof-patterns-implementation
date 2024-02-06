package com.mykolyk.gofpatternsimplementation.behavioral.memento;

public class SaveProjectRunner {
    public static void main(String[] args) throws InterruptedException {
        Project project = new Project();
        Repository repository = new Repository();

        System.out.println("Created new project:");
        project.setVersionAndDate("Version 1.0");
        System.out.println("Saved new project:");
        repository.setSave(project.save());
        System.out.println(project);

        Thread.sleep(5000);
        System.out.println("Updated project:");
        project.setVersionAndDate("Version 1.1");
        System.out.println("Saved updated project:");
        System.out.println(project);

        Thread.sleep(5000);
        System.out.println("Rolling back project:");
        project.load(repository.getSave());
        System.out.println(project);
    }
}
