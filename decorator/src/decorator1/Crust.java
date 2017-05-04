package decorator1;


public class Crust implements Pizza{
    
    @Override
    public String getIncredients(){
        return "pizzapohja";
    }
    
    @Override
    public double getPrice(){
        return 4;
    }
    
    
    
}
