package chainofresposibility;

public abstract class Handler {
    protected double maxPercentage;
    protected Handler successor;

    public Handler(Handler successor, double maxPercentage) {
        this.successor = successor;
        this.maxPercentage = maxPercentage;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    
    public void handleRaiseRequest(Employee employee, double amount) {
        if (amount / employee.getSalary() * 100 <= maxPercentage) {
            employee.setSalary(employee.getSalary() + amount);
        } else if (successor != null) {
            successor.handleRaiseRequest(employee, amount);
        } else {
            System.out.println("Ei palkankorotusta");
        }
    }
    
}
