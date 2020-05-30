package com.linzhenhong.desgin.principle.openclose;

public class DiscountCourse extends JavaCourse {
    public DiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    @Override
    public Integer getId() {
        return super.getId();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    public Double getoldPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice()*0.8;
    }
}
