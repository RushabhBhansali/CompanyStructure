public abstract class Employee{
    private String name;
    private double baseSalary;
    private int employeeId;
    private static int employeeIdcounter = 0;
    private double bonus;

    //Should construct a new employee object and take in two parameters, one for the name of the user and one for their base salary
    public Employee(String name, double baseSalary){
        this.name = name;
        this.baseSalary = baseSalary;
        employeeIdcounter++;
        employeeId = employeeIdcounter;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //Should return the employee's current salary
    public double getBaseSalary(){
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    //	Should return the employee's current name
    public String getName(){
        return name ;
    }

    //Should return the employee's ID.
    // //The ID should be issued on behalf of the employee at the time they are constructed.
    // //The first ever employee should have an ID of "1", the second "2" and so on
    public int getEmployeeId(){
        return employeeId;
    }

    public Employee getManager(){
        System.out.println("no manager is recorded for this particular employee");
        return null;
    };

    public boolean equals(Employee other){
        if (employeeId == other.getEmployeeId()){
            return true;
        }
        return false;
    }

    public String toString(){
        return Integer.toString(employeeId) +" "+ name;
    }

    public abstract String employeeStatus();

}
