package decorator1;


public class Pepperoni extends PizzaDecorator{
    
    public Pepperoni(Pizza p){
        super(p);
    }
    
    @Override
    public double getPrice(){
        return super.getPrice() + 2;
    }
    
    @Override
    public String getIncredients(){
        return "pepperoni";
    }

}
