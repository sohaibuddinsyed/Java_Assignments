package SolidPrinciples.School_Management.Staff;

public class Attender extends NonTeachingStaff{
    public Attender(){
        AddAttenderDetails.addAttender(this);
    }
}
