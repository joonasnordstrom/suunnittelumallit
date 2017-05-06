package chainofresposibility;

public class Manager extends Handler {

    public Manager(Handler successor, double maxPercentage) {
        super(successor, maxPercentage);
    }
}
