package payrollsystem;

public abstract class Employee {
    private int empI;
    private String name;
    private Vehicle vehicle;

    public int getEmpI() {
        return empI;
    }

    public void setEmpI(int empI) {
        this.empI = empI;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
