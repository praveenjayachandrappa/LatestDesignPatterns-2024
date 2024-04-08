package decorator;

public class WithMilk extends CoffeeDecorator{

    private Coffee coffee;

     public WithMilk(Coffee coffee) {
         this.coffee = coffee;
     }

     @Override
     public String getDescription() {
         return coffee.getDescription()+",Milk";
     }

     @Override
     public double cost() {
         return coffee.cost() + 10;
     }
 }
