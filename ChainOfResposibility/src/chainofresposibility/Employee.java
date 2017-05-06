package chainofresposibility;

public class Employee {
    private double salary;

    public Employee(double salary) {
        this.salary = salary;
    }
    
    public void askForRaise(Handler handler, double amount) {
        handler.handleRaiseRequest(this, amount);
    }
    
    public void setSalary(double salary) {
        this.salary = salary;
    }
    
    public double getSalary() {
        return salary;
    }
}
