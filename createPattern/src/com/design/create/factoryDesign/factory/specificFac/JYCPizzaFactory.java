package com.design.create.factoryDesign.factory.specificFac;

import com.design.create.factoryDesign.factory.SimplePizzaFactory;
import com.design.create.factoryDesign.pizza.Pizza;
import com.design.create.factoryDesign.pizza.impl.specificPizza.JYCCheesPizza;
import com.design.create.factoryDesign.pizza.impl.specificPizza.JYCClamPizza;

public class JYCPizzaFactory extends SimplePizzaFactory {
    //第一种工厂
    @Override
    public Pizza createPizza(String type) {
        System.out.println("这是金元村风味的披萨");
        return super.createPizza(type);
    }

    public Pizza createCheesPizza(){
        return new JYCCheesPizza();
    }

    @Override
    public Pizza createClamPizza() {
        return new JYCClamPizza();
    }
}
