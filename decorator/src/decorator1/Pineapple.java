package decorator1;


public class Pineapple extends PizzaDecorator{
    
    public Pineapple (Pizza p){
        super(p);
    }
    
    @Override
    public double getPrice(){
        return super.getPrice() + 2;
    }
    
    @Override
    public String getIncredients(){
        return "pineapple";
    }

}
