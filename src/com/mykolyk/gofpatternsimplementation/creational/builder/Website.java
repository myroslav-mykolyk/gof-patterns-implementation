package com.mykolyk.gofpatternsimplementation.creational.builder;


import java.math.BigDecimal;

public class Website {
    private String name;
    private Cms cms;
    private BigDecimal price;

    public void setName(String name) {
        this.name = name;
    }

    public void setCms(Cms cms) {
        this.cms = cms;
    }

    @Override
    public String toString() {
        return "Website{" +
                "name='" + name + '\'' +
                ", cms=" + cms +
                ", price=" + price +
                '}';
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}

