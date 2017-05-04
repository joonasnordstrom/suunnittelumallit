package decorator1;


public abstract class PizzaDecorator implements Pizza{
    private Pizza pizzaToBeDecorated;
    
    public PizzaDecorator(Pizza p){
        this.pizzaToBeDecorated = p;
    }
    
    public double getPrice(){
        return pizzaToBeDecorated.getPrice();
    }
    
    public String getIncredients(){
        return pizzaToBeDecorated.getIncredients();
    }
    
}
