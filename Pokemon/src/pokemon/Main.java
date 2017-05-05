package pokemon;

/**
 *
 * @author Joonas
 */
public class Main {
    
    public static void main(String [] args){
        Context context = new Context();
        Pokemon pokemon = new Charmander();
        System.out.println("I choose you:  \n"+ pokemon + " \nStrike: ");
        pokemon.Strike(context);
        pokemon = pokemon.LevelUp(context);
        System.out.println("I choose you:  \n"+ pokemon + " \nStrike: ");
        pokemon.Strike(context);
        pokemon = pokemon.LevelUp(context);
        System.out.println("I choose you:  \n"+ pokemon + " \nStrike: ");
        pokemon.Strike(context);
        System.out.println("It reflected!");
        pokemon = pokemon.LevelDown(context);
        System.out.println("It reflected!");
        pokemon = pokemon.LevelDown(context);
        
        
        
        
        
    }

}
