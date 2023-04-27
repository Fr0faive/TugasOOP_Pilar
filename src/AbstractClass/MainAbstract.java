package AbstractClass;

public class MainAbstract {
    public static void main(String[] args) {
        Employee manager = new Manager("Faikar", "Jl. Cikondang", "085155", 500000);
        System.out.println("Manager: " + manager.getName());
        System.out.println("Salary: Rp" + manager.calculateSalary());
    }
}
