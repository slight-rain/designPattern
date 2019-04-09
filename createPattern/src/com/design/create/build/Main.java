package com.design.create.build;

public class Main {
    public static void main(String[] args) {
        IBuilder builder=new RealBuilder();
        Director director=new Director();
        Car car=director.constructor(builder);
        System.out.println(car.getBody().getDes());
        System.out.println(car.getEngine().getDes());
        System.out.println(car.getWheel().getDes());
    }
}
