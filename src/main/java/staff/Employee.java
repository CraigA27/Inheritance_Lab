package staff;

public class Employee {

    private String name;
    private int nINumber;
    private int salary;

    public Employee(String name, int nINumber, int salary) {
        this.name = name;
        this.nINumber = nINumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }

    public int getNINumber() {
        return nINumber;
    }

    public void setNINumber(int nINumber) {
        this.nINumber = nINumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void raiseSalary(double amount){
        if(amount >= 0) {
            salary += amount;
        }
    }

    public double payBonus(){
        return this.salary * 0.01;
    }
}
