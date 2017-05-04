package singleton;

public final class Jasper implements IJavaKoodaaja{
    IVaateFactory factory = new AdidasFactory();
    private static Jasper instance = null;
    private Jasper() {}
    
    public static synchronized Jasper getInstance() {
        if (instance == null) instance = new Jasper();
        return instance;
    }

    @Override
    public void pue() {
        IVaate lippis = factory.luoLippis();
        IVaate farmarit = factory.luoFarmarit();
        IVaate kengat = factory.luoKengat();
        IVaate tPaita = factory.luoTPaita();
    
        System.out.println("Päälläni on:");
        lippis.vaate();
        farmarit.vaate();
        kengat.vaate();
        tPaita.vaate();
    }
    
    public void valmistuInsinööriksi() {
        factory = new BossFactory();
        System.out.println("Nyt olen insinööri");
    }
}
