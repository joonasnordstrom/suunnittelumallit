package pokemon;


public class Charmander implements Pokemon {
    
    private Pokemon pokemon;
    
    @Override
    public void Strike(Context context){
        context.setState(this);
        System.out.println("Tulipallohitto!");
        
    }
    
    @Override
    public Pokemon LevelUp(Context context){
        pokemon = new Charmeleon();
        context.setState(pokemon);
        System.out.println("OMG! My pokemon is growing stronger! It looks like: "+pokemon);
        return pokemon;
    }
    
    @Override
    public Pokemon LevelDown(Context context){
        return this;
    }
    
    public String toString(){
        return "Charmander";
    }
  
    

}
