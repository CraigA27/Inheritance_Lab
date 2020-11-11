package management;

public class Director extends Manager {

    private double budget;

    public Director(String name, int nINumber, int salary, String deptName, double budget) {
        super(name, nINumber, salary, deptName);
        this.budget = budget;
    }

    public double getBudget() {
        return budget;
    }

    public double payBonus(){
         double salary = getSalary();
        return salary * 0.02;
    }
}
