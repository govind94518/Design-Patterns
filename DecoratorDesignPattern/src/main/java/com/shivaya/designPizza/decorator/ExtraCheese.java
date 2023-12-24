package com.shivaya.designPizza.decorator;

import com.shivaya.designPizza.base.BasePizza;

public class ExtraCheese extends ToppingDecorator{
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }
    public int cost() {
        return basePizza.cost()+40;
    }
}
