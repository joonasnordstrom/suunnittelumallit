package chainofresposibility;

public class CEO extends Handler {

    public CEO(Handler successor, double maxPercentage) {
        super(successor, maxPercentage);
    }
    
    @Override
    public void handleRaiseRequest(Employee employee, double amount) {
        employee.setSalary(employee.getSalary() + amount);
        System.out.println("TJ hoitaa");
    }

}
