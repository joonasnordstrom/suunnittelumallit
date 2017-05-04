package singleton;

public class AdidasFactory implements IVaateFactory {

    @Override
    public IVaate luoLippis() {
        return new AdidasLippis();
    }

    @Override
    public IVaate luoKengat() {
        return new AdidasKengat();
    }

    @Override
    public IVaate luoFarmarit() {
        return new AdidasFarmarit();
    }

    @Override
    public IVaate luoTPaita() {
        return new AdidasTPaita();
    }
    
}
