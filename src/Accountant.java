import java.util.ArrayList;
import java.util.List;

public class Accountant extends BusinessEmployee {
    //private double bonusBudget;
    private TechnicalLead supportedTechLead;


    public Accountant(String name){
        super(name);
        setBonusBudget((double)0);
        supportedTechLead = null;
    }

    public TechnicalLead getSupportedTechLead() {
        return supportedTechLead;
    }

    public TechnicalLead getTeamSupported(){
        if(supportedTechLead != null){return supportedTechLead;}
        else{return null;}
    }

    public void SupportTeam(TechnicalLead lead){
        supportedTechLead = lead;
        double bonusBudgetRet = 0;
        for(SoftwareEngineer e: lead.getDirectReportList()){
            bonusBudgetRet += e.getBaseSalary();
        }
        setBonusBudget(bonusBudgetRet);
        //tobe implemented after implementation of technical lead
        //bonusBudget = lead.
    }

    public boolean approveBonus(double bonus){
        if (bonus > getBonusBudget()){return false;}
        else{return true;}
    }

    public String employeeStatus(){
        return super.employeeStatus() + " is supporting "+ supportedTechLead.getName();
    }


}
