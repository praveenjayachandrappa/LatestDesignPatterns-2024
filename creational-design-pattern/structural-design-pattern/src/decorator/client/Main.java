package decorator.client;

import decorator.Coffee;
import decorator.Espresso;
import decorator.WithMilk;
import decorator.WithSugar;

public class Main {

    public static void main(String[] args) {

        Coffee coffee=new Espresso();
        printCoffee(coffee);

        coffee = new WithSugar(coffee);

        printCoffee(coffee);

        coffee=new WithMilk(coffee);

        printCoffee(coffee);
    }

    private static void printCoffee(Coffee c) {
        System.out.println("Cost: " + c.cost() + ", Description: " + c.getDescription());
    }
}
