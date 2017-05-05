package pokemon;

/**
 *
 * @author Joonas
 */
public class Charizard implements Pokemon {
    
    private Pokemon pokemon;
    
    @Override
    public void Strike(Context context){
        context.setState(this);
        System.out.println("Tulipallohelvetti!");
        
    }
    
    @Override
    public Pokemon LevelUp(Context context){
        return this;
        
    }
    
    @Override
    public Pokemon LevelDown(Context context){
        pokemon = new Charmeleon();
        context.setState(pokemon);
        System.out.println("OMG! My pokemon is weakening! It looks like it's back to: "+pokemon);
        return pokemon;
        
    }
  
    public String toString(){
        return "Charizard";
    }

}
