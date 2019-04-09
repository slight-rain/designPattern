package com.design.create.factoryDesign.pizza.impl;

import com.design.create.factoryDesign.pizza.Pizza;

public class CheesPizza implements Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare CheesPizza");
    }

    @Override
    public void bake() {
        System.out.println("bake CheesPizza");
    }

    @Override
    public void cut() {
        System.out.println("cut CheesPizza");
    }

    @Override
    public void box() {
        System.out.println("box CheesPizza");
    }
}
