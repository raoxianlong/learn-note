package com.design.principle.openclose;

public class JavaCourse implements ICourse{

    private Integer id;
    private String name;
    private Double price;


    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
