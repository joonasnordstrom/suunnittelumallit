package pokemon;

public class Context {
    private Pokemon pokemon;
    
    public Context(){
        pokemon = null;
    }
    
    public void setState(Pokemon state){
        this.pokemon = state;
    }
    
    public Pokemon getState(){
        return pokemon;
    }

}
