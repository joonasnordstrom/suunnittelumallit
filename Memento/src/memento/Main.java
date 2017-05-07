package memento;

/**
 *
 * @author Joonas
 */
public class Main {
    
     public static void main(String[] args){
         Arvuuttaja arvuuttaja = new Arvuuttaja();
         Pelaaja pasi = new Pelaaja("Pasi", arvuuttaja);
         Pelaaja timo = new Pelaaja("Timo", arvuuttaja);
         
         pasi.start();
         timo.start();
     }

}
