package com.design.create.factoryDesign.factory.specificFac;

import com.design.create.factoryDesign.factory.SimplePizzaFactory;
import com.design.create.factoryDesign.pizza.Pizza;
import com.design.create.factoryDesign.pizza.impl.specificPizza.NYCheesPizza;
import com.design.create.factoryDesign.pizza.impl.specificPizza.NYClamPizza;

public class NYPizzaFactory extends SimplePizzaFactory {
    @Override
    public Pizza createPizza(String type) {
        System.out.println("这是纽约风味的披萨");
        return super.createPizza(type);
    }

    @Override
    public Pizza createCheesPizza() {
        return new NYCheesPizza();
    }

    @Override
    public Pizza createClamPizza() {
        return new NYClamPizza();
    }
}
