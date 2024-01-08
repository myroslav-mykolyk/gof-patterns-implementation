package com.mykolyk.gofpatternsimplementation.structural.decorator;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport() {
        return "\nJava team lead sends week report!";
    }

    @Override
    public String writeCode() {
        return super.writeCode()+sendWeekReport();
    }
}
