package memento;

import java.util.Random;



public class Pelaaja extends Thread{
    Arvuuttaja arvuuttaja;
    Object olio;
    String nimi;
    
    public Pelaaja(String nimi, Arvuuttaja arvuuttaja){
        this.nimi = nimi;
        this.arvuuttaja = arvuuttaja;
    }
    
    public synchronized boolean arvaa(Arvuuttaja arvuuttaja){
        int arvaus = new Random().nextInt(10);
        if (arvuuttaja.tarkastaArvaus(arvaus, olio)){
            System.out.println(nimi+" arvasi oikein. Oikea vastaus: "+arvaus);
            return true;
        } else {
            System.out.println(nimi+" arvasi: "+arvaus+" väärin!");
            return false;
        }
        
        
    }
    
    @Override
    public void run(){
        boolean osuikoArvaus = false;
        olio = arvuuttaja.liityPeliin();
        int arvaustenMäärä = 0;
        while (!osuikoArvaus){
            arvaustenMäärä++;
            osuikoArvaus = arvaa(arvuuttaja);
            
        }
        System.out.println("Arvausten määrä: "+arvaustenMäärä);
        
        
    }

}
