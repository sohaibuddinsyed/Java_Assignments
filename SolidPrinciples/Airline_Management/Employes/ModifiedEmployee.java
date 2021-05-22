package SolidPrinciples.Airline_Management.Employes;

public class ModifiedEmployee extends Employee{
    private String gender;

    void setGender(String gender){
        this.gender=gender;
    }
    String getGender(){
        return this.gender;
    }
}
