package com.example.configurationproperties.order;

public class Item {
    private String name;
    private Float price;
    private Integer qnt;

    public Item (String name, Float price, Integer qnt) {
        this.name = name;
        this.price = price;
        this.qnt = qnt;
    }

    @Override
    public String toString ( ) {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", qnt=" + qnt +
                '}';
    }

    public String getName ( ) {
        return name;
    }

    public void setName (String name) {
        this.name = name;
    }

    public Float getPrice ( ) {
        return price;
    }

    public void setPrice (Float price) {
        this.price = price;
    }

    public Integer getQnt ( ) {
        return qnt;
    }

    public void setQnt (Integer qnt) {
        this.qnt = qnt;
    }
}
