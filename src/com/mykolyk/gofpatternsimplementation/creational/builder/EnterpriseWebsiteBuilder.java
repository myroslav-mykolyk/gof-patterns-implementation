package com.mykolyk.gofpatternsimplementation.creational.builder;

import java.math.BigDecimal;

public class EnterpriseWebsiteBuilder extends  WebsiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise card website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.ALFRESCO);
    }

    @Override
    void buildPrice() {
        website.setPrice(new BigDecimal(10000));
    }
}
