package com.mykolyk.gofpatternsimplementation.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator {
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview() {
        return "\nSenior Java developer makes code review!";
    }

    @Override
    public String writeCode() {
        return super.writeCode() + makeCodeReview();
    }
}
