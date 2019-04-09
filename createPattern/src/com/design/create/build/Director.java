package com.design.create.build;

public class Director {
    public Car constructor(IBuilder iBuilder){
        iBuilder.buildCar();
        iBuilder.buildBody("Strong Body");
        iBuilder.buildEnine("engine");
        iBuilder.buildWheel("black wheel");
        return iBuilder.getCar();
    }
}
