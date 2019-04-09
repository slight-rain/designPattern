package com.design.create.build;

import com.design.create.build.part.Body;
import com.design.create.build.part.Engine;
import com.design.create.build.part.Wheel;

public class Car {
    private Body body;
    private Engine engine;
    private Wheel wheel;

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }
}
