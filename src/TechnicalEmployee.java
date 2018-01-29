

public abstract class TechnicalEmployee extends Employee{

    //public abstract int getSuccessfulCheckIns();
    public static double technicalBaseSalary = 75000;
    private int checkIn;

    public TechnicalEmployee(String name){
        super(name, TechnicalEmployee.technicalBaseSalary);
        checkIn = 0;
    }

    public int getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(int checkIn) {
        this.checkIn = checkIn;
    }

    public void checkIn(){
        this.checkIn++;
    }



    public String employeeStatus(){
        return super.toString() +" has "+Integer.toString(checkIn)+" successful checkins";
    }
    //public abstract Employee getManager();

}
