package com.mykolyk.gofpatternsimplementation.creational.builder;

import java.math.BigDecimal;

public class VisitCardWebsiteBuilder extends WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Visit card website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(new BigDecimal(500));
    }
}
