package com.design.create.factoryDesign;

import com.design.create.factoryDesign.factory.SimplePizzaFactory;
import com.design.create.factoryDesign.pizza.Pizza;

public class PizzaStore {

//抽象披萨工厂（原先是简单工厂）
    private SimplePizzaFactory simplePizzaFactory;

    public PizzaStore(){}
    public PizzaStore(SimplePizzaFactory simplePizzaFactory){
        this.simplePizzaFactory=simplePizzaFactory;
    }
//原先的工厂模式
    Pizza orderPizza(String type){
        //简单工厂升级为父类（利用简单pizza工厂创建pizza)
        Pizza pizza=simplePizzaFactory.createPizza(type);
        return pizza;
    }

    //抽象工厂模式(做那种风味的披萨由披萨工厂决定
    Pizza orderCheesPizza(){
        return simplePizzaFactory.createCheesPizza();
    }
    Pizza orderClamPizza(){
        return simplePizzaFactory.createClamPizza();
    }
    public SimplePizzaFactory getSimplePizzaFactory() {
        return simplePizzaFactory;
    }

    public void setSimplePizzaFactory(SimplePizzaFactory simplePizzaFactory) {
        this.simplePizzaFactory = simplePizzaFactory;
    }
}
