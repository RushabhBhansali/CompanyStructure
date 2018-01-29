

public abstract class BusinessEmployee extends Employee{
    private double bonusBudget;
    public static double businessBaseSalary = 50000;

    public BusinessEmployee(String name){
        super(name, BusinessEmployee.businessBaseSalary);
    }

    public double getBonusBudget(){
        return bonusBudget;
    }

    public void setBonusBudget(double bonusBudget) {
        this.bonusBudget = bonusBudget;
    }

    public String employeeStatus(){
        return super.toString() + " with a budget of "+ Double.toString(bonusBudget);
    }

    //public abstract Employee getManager();

}
