package SolidPrinciples.School_Management;

import SolidPrinciples.School_Management.Staff.Faculty;
import SolidPrinciples.School_Management.Staff.ShowEmployeeDetails;
import SolidPrinciples.School_Management.Students.DayScholarStudent;

/*
package School_Management

package Staff -
    abstract class Employee
    abstract TeachingStaff, NonTeachingStaff extends Employee
    class Faculty extends TeachingStaff
    class Attender extends NonTeachingStaff
    class ShowEmployeeDetails
    class AddFacultyDetails, AddAttenderDetails

package Student -
   abstract class Student
   interface StudentDuties, Hosteler Duties
   class HostelStudent, DayScholarStudent extends Student implement StudentDuties, Hosteler Duties

*/

public class SchoolMain {
   public static void main(String [] args){
       Faculty faculty= new Faculty();
       ShowEmployeeDetails.showEmployeeDetails(faculty);

       DayScholarStudent dayScholarStudent = new DayScholarStudent();
       dayScholarStudent.totalFee();
   }
}

