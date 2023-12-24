package com.shivaya.designPizza;

import com.shivaya.designPizza.base.BasePizza;
import com.shivaya.designPizza.base.Margherita;
import com.shivaya.designPizza.base.VegDelight;
import com.shivaya.designPizza.decorator.ExtraCheese;
import com.shivaya.designPizza.decorator.Mushroom;

/**
 * Hello world!
 *
 */
public class PizzaApp {
    public static void main( String[] args ) {
        System.out.print("total cost VegDelight is :-> ");
        System.out.println(new Mushroom(new ExtraCheese( new VegDelight())).cost());
        System.out.print("total cost Margherita base is :-> ");
        System.out.println(new Mushroom(new ExtraCheese( new Margherita())).cost());
    }
}
