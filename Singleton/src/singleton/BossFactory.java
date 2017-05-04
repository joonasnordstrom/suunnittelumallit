package singleton;

public class BossFactory implements IVaateFactory {

    @Override
    public IVaate luoLippis() {
        return new BossLippis();
    }

    @Override
    public IVaate luoKengat() {
        return new BossKengat();
    }

    @Override
    public IVaate luoFarmarit() {
        return new BossFarmarit();
    }

    @Override
    public IVaate luoTPaita() {
        return new BossTPaita();
    }

}
