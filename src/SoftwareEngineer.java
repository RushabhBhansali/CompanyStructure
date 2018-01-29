public class SoftwareEngineer extends TechnicalEmployee {
    //private int checkIn;

    //public boolean isManager;
    private TechnicalLead manager; //reference to employee's manager
    private boolean codeAccess;
    //private double bonus;

    //costructor
    public SoftwareEngineer(String name){
        super(name);
        //isManager = false;
        codeAccess = false;
    }

    public boolean getCodeAccess(){
        return codeAccess;
    }

    public void  setCodeAccess(boolean access){
        codeAccess = access;
    }

    public int getSuccessfulCheckIns(){
        return super.getCheckIn();
    }

    public boolean checkInCode(){
        if(manager.approveCheckIn(this)){super.checkIn(); return true;}
        else {setCodeAccess(false); return false;}

    }

    public Employee getManager() {
        return manager;
    }



    //to set a manager for the employee, ususally technical lead
    public void setManager(TechnicalLead manager) {
        this.manager = manager;
    }
}
