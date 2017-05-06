package chainofresposibility;


public class Main {

    public static void main(String[] args) {
        Employee employee = new Employee(3000);
        Handler CEO = new CEO(null, 0);
        Handler unitManager = new Manager(CEO, 5);
        Handler immediateManager = new Manager(null, 2);
        
        System.out.println("Pyydä 10 korotusta");
        employee.askForRaise(immediateManager, 10);
        System.out.println("Palkka: " + employee.getSalary());
        System.out.println();
        
        System.out.println("Pyydä 150 korotusta");
        employee.askForRaise(immediateManager, 150);
        System.out.println("Palkka: " + employee.getSalary());
        System.out.println();
        
        immediateManager.setSuccessor(unitManager);
        System.out.println("Pyydä 150 korotusta uudestaan, kun yksikön päällikkö ja TJ lisätty");
        employee.askForRaise(immediateManager, 150);
        System.out.println("Palkka: " + employee.getSalary());
        System.out.println();
        
        
        System.out.println("Pyydä 1000 korotusta");
        employee.askForRaise(immediateManager, 1000);
        System.out.println("Palkka: " + employee.getSalary());
        
        
    }

}
