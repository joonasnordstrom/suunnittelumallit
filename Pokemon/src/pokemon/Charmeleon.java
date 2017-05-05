package pokemon;

/**
 *
 * @author Joonas
 */
public class Charmeleon implements Pokemon {
    
    private Pokemon pokemon;
    
    @Override
    public void Strike(Context context){
        context.setState(this);
        System.out.println("Tulipalloperkele!");
        
    }
    
    @Override
    public Pokemon LevelUp(Context context){
        pokemon = new Charizard();
        context.setState(pokemon);
        System.out.println("OMG! My pokemon is growing stronger! It looks like: "+pokemon);
        return pokemon;
    }
    
    @Override
    public Pokemon LevelDown(Context context){
        pokemon = new Charmander();
        context.setState(pokemon);
        System.out.println("OMG! My pokemon is weakening! It looks like it's back to: "+pokemon);
        return pokemon;
        
    }
  
    public String toString(){
        return "Charmeleon";
    }

}
