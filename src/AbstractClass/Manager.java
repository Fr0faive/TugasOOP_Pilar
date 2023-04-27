package AbstractClass;

public class Manager extends Employee {
    private double salary;

    public Manager(String name, String address, String phone, double salary) {
        super(name, address, phone);
        this.salary = salary;
    }

    @Override
    public double calculateSalary() {
        return salary;
    }
}
