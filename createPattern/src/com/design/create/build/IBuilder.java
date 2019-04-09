package com.design.create.build;

public interface IBuilder {
    void buildCar();
    void buildEnine(String desc);
    void buildWheel(String desc);
    void buildBody(String desc);
    Car getCar();
}
