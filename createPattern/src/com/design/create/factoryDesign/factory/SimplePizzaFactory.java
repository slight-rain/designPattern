package com.design.create.factoryDesign.factory;

import com.design.create.factoryDesign.pizza.Pizza;
import com.design.create.factoryDesign.pizza.impl.CheesPizza;
import com.design.create.factoryDesign.pizza.impl.ClamPizza;

public abstract class SimplePizzaFactory {
    //最初级的简单工厂模式
    public Pizza createPizza(String type){
        if(type.equals("cheese")){
            return new CheesPizza();
        }else{
            return new ClamPizza();
        }
    }

    public abstract Pizza createCheesPizza();
    public abstract Pizza createClamPizza();
}
