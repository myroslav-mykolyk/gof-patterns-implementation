package com.mykolyk.gofpatternsimplementation.creational.builder;

public class WebsiteBuilderRunner {
    public static void main(String[] args) {
        Director director = new Director();
        director.setBuilder(new VisitCardWebsiteBuilder());
        Website website = director.buildWebsite();
        System.out.println(website);
        director.setBuilder(new EnterpriseWebsiteBuilder());
        website = director.buildWebsite();
        System.out.println(website);
    }
}
