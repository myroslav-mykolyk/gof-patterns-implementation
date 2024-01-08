package com.mykolyk.gofpatternsimplementation.structural.decorator;

public class Task {
    public static void main(String[] args) {
        Developer javaDeveloper = new JavaTeamLead(new SeniorJavaDeveloper(new JavaDeveloper()));
        System.out.println(javaDeveloper.writeCode());
    }
}
