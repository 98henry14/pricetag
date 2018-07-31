package com.pricetag.Bean;

import org.springframework.stereotype.Component;

@Component
public class ItemInfo {
    private String item_no;
    private String a;
    private String p;
    private String row;

    @Override
    public String toString() {
        return "ItemInfo{" +
                "item_no='" + item_no + '\'' +
                ", a='" + a + '\'' +
                ", p='" + p + '\'' +
                ", row='" + row + '\'' +
                '}';
    }

    public String getItem_no() {
        return item_no;
    }

    public void setItem_no(String item_no) {
        this.item_no = item_no;
    }

    public String getA() {
        return a;
    }

    public void setA(String a) {
        this.a = a;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }

    public String getRow() {
        return row;
    }

    public void setRow(String row) {
        this.row = row;
    }
}
