package com.simplefanc.design.structural.composite;

public class Course extends CatalogComponent {

    /**
     * name
     */
    private String name;

    /**
     * price
     */
    private Double price;

    public Course(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public Double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("课程名称：" + name + "   价格：" + price);
    }
}
