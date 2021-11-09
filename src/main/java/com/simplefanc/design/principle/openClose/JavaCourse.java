package com.simplefanc.design.principle.openClose;

import lombok.Data;

@Data
public class JavaCourse implements ICourse {

    /**
     * id
     */
    private Integer id;

    /**
     * name
     */
    private String name;

    /**
     * price
     */
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public JavaCourse() {
    }

    @Override
    public String toString() {
        return "JavaCourse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
