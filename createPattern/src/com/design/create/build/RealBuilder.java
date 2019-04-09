package com.design.create.build;

import com.design.create.build.part.Body;
import com.design.create.build.part.Engine;
import com.design.create.build.part.Wheel;

public class RealBuilder implements IBuilder{
    private Car car;
    @Override
    public void buildCar() {
        car=new Car();
    }

    @Override
    public void buildEnine(String desc) {
        Engine engine=new Engine();
        engine.setDes(desc);
        car.setEngine(engine);
    }

    @Override
    public void buildWheel(String desc) {
        Wheel wheel=new Wheel();
        wheel.setDes(desc);
        car.setWheel(wheel);
    }

    @Override
    public void buildBody(String desc) {
        Body body=new Body();
        body.setDes(desc);
        car.setBody(body);
    }

    @Override
    public Car getCar() {
        return car;
    }


}
