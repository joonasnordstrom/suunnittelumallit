package decorator1;

/**
 *
 * @author Joonas
 */
public class Ham extends PizzaDecorator{
    
    public Ham (Pizza p){
        super(p);
    }
    
    @Override
    public double getPrice(){
        return super.getPrice() + 2;
    }
    
    @Override
    public String getIncredients(){
        return "kinkku";
    }

}
