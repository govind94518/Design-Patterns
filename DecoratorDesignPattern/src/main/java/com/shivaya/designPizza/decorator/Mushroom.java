package com.shivaya.designPizza.decorator;

import com.shivaya.designPizza.base.BasePizza;

public class Mushroom extends ToppingDecorator {
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int cost() {
        return basePizza.cost()+50;
    }
}
