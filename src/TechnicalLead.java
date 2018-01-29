import java.util.ArrayList;
import java.util.List;

public class TechnicalLead extends TechnicalEmployee {
    //public boolean isManager;
    public int headCount;
    private List<SoftwareEngineer> directReportList;
    private BusinessLead businessLeadRef;

    public TechnicalLead(String name){
        super(name);
        setBaseSalary(TechnicalEmployee.technicalBaseSalary * 1.3);
        //isManager = true;
        headCount = 4;
        directReportList = new ArrayList<SoftwareEngineer>();
    }

    public List<SoftwareEngineer> getDirectReportList() {
        return directReportList;
    }

    public boolean hasHeadCount(){
        if (directReportList.size() < headCount){return true;}
        else{return false;}
    }

    public boolean addReport(SoftwareEngineer e){
        if(hasHeadCount()){
            if(directReportList.add(e)){return true;}
        }
        return false;
    }

    public boolean approveCheckIn(SoftwareEngineer e){
        if(directReportList.contains(e) && e.getCodeAccess() == true){
            return true;
        }
        else{
            return false;
        }
    }

    public boolean requestBonus(Employee e, double bonus){
        if(businessLeadRef.requestBonus(e, bonus)){
            e.setBonus(bonus);
            return true;
        }
        else{
            return false;
        }
    }

    public String getTeamStatus(){
        String s1= employeeStatus()+"\n";
        String s2 ="";
        if(directReportList.size()>0){
            for (SoftwareEngineer s : directReportList){
                s2 += s.employeeStatus() + "\n";
            }
        }
        else{
            s2 = "there are no direct reports yet";
        }

        return s1 + s2;

    }






}
