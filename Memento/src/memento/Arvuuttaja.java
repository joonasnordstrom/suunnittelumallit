package memento;

import java.util.Random;




public class Arvuuttaja {
    
    
    public Object liityPeliin(){
        return new Memento(arvoNumero());
    }
    
    public int arvoNumero() {
        return new Random().nextInt(10);
    }
    
    public boolean tarkastaArvaus(int arvaus, Object olio ){
        Memento memento = (Memento) olio;
        return memento.numero == arvaus;
    }
    
    private class Memento {
        int numero;
        
        public Memento(int numero){
            this.numero = numero;
        }
    
}

}
