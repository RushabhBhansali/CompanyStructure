import java.util.ArrayList;
import java.util.List;

public class BusinessLead extends BusinessEmployee {
    private int headCount;
    private List<Accountant> directReportAccountantList;

    public BusinessLead(String name){
        super(name);
        setBaseSalary(BusinessEmployee.businessBaseSalary * 2);
        headCount = 10;
        setBonusBudget((double)0);
        directReportAccountantList = new ArrayList<Accountant>();
    }

    public boolean hasHadCount(){
        if(directReportAccountantList.size() < headCount){
            return true;
        }
        return false;
    }

    public boolean addReport(Accountant e, TechnicalLead SupportTeam){
        if(hasHadCount()){
            directReportAccountantList.add(e);
            setBonusBudget(getBonusBudget() + 1.1*e.getBaseSalary());
            e.SupportTeam(SupportTeam);
            return true;
        }
        return false;
    }

    public boolean requestBonus(Employee e, double bonus){
        if (bonus < getBonusBudget()){
            e.setBonus(bonus);
            setBonusBudget(getBonusBudget()-bonus);
            //Employee should get that bonus -- How ? --Solved
            return true;
        }
        return false;
    }

    public boolean approveBonus(Employee e,double bonus){
        for(Accountant a : directReportAccountantList){
            if(a.getSupportedTechLead().equals(e.getManager())){
                if(a.approveBonus(bonus)){
                    e.setBonus(bonus);
                    return true;
                }
                    return false;
            }
            return false;
        }
        return false;
    }

    public String getTeamStatus(){
        String s1 = employeeStatus() + "\n";
        String s2 = "";
        if(directReportAccountantList.size()>0){
            for(Accountant a: directReportAccountantList){
                s2 += a.employeeStatus()+"\n";
            }
        }
        else{
            s2= "there are no direct reports yet";
        }

        return s1+s2;
    }


}
