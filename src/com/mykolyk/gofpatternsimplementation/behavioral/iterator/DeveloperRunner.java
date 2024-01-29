package com.mykolyk.gofpatternsimplementation.behavioral.iterator;

public class DeveloperRunner {
    public static void main(String[] args) {
        String name = "Myroslav Mykolyk";
        String[] skills = {"Java", "Spring", "MySql", "AWS"};

        JavaDeveloper javaDeveloper = new JavaDeveloper(name, skills);
        Iterator iterator = javaDeveloper.getIterator();
        System.out.println("Developer name: " + javaDeveloper.getName());
        System.out.println("Developer skills:");
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + "; ");
        }
    }
}
