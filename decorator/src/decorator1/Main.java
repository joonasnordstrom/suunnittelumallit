package decorator1;

/**
 *
 * @author Joonas
 */
public class Main {
    
    public static void main(String [] args){
        Pizza pizza = new Crust();
        
        pizza = new Ham(pizza);
        System.out.println("Pizzan täytteet ja hinta: "+pizza.getIncredients() + " " + pizza.getPrice());
        pizza = new Pineapple(pizza);
        System.out.println("Pizzan täytteet ja hinta: "+pizza.getIncredients() + " " + pizza.getPrice());
        pizza = new Pepperoni(pizza);
        System.out.println("Pizzan täytteet ja hinta: "+pizza.getIncredients() + " " + pizza.getPrice());
        
        //System.out.println("Pizzan hinta: ");
        
        
    }

}
