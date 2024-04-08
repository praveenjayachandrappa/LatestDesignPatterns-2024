package decorator;

public class WithSugar extends CoffeeDecorator{

    private Coffee coffee;

    public WithSugar(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public String getDescription() {
        return coffee.getDescription()+",Sugar";
    }

    @Override
    public double cost() {
        return coffee.cost() + 10;
    }
}
