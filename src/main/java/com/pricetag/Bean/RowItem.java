package com.pricetag.Bean;

import org.springframework.stereotype.Component;

@Component
public class RowItem {
    private String name1;
    private String price1;
    private String name2;
    private String price2;
    private String name3;
    private String price3;

    @Override
    public String toString() {
        return "RowItem{" +
                "name1='" + name1 + '\'' +
                ", price1='" + price1 + '\'' +
                ", name2='" + name2 + '\'' +
                ", price2='" + price2 + '\'' +
                ", name3='" + name3 + '\'' +
                ", price3='" + price3 + '\'' +
                '}';
    }

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }

    public String getPrice1() {
        return price1;
    }

    public void setPrice1(String price1) {
        this.price1 = price1;
    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getPrice2() {
        return price2;
    }

    public void setPrice2(String price2) {
        this.price2 = price2;
    }

    public String getName3() {
        return name3;
    }

    public void setName3(String name3) {
        this.name3 = name3;
    }

    public String getPrice3() {
        return price3;
    }

    public void setPrice3(String price3) {
        this.price3 = price3;
    }
}
