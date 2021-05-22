package SolidPrinciples.School_Management;

import SolidPrinciples.School_Management.Staff.Faculty;
import SolidPrinciples.School_Management.Staff.ShowEmployeeDetails;
import SolidPrinciples.School_Management.Students.DayScholarStudent;

/*
package School_Management

package Staff       // S,O,L,D
    abstract class Employee()
    abstract TeachingStaff, NonTeachingStaff
    class Faculty, Attenders
    class ShowEmployeeDetails
    class AddEmployeeDetails

package Student     // I,D
   abstract class Student()
   interface StudentDuties, Hosteler Duties
   class HostelStudent, DayScholarStudent extend Student implement StudentDuties, Hosteler Duties

*/

public class SchoolMain {
   public static void main(String [] args){
       Faculty faculty= new Faculty();
       ShowEmployeeDetails.showEmployeeDetails(faculty);

       DayScholarStudent dayScholarStudent = new DayScholarStudent();
       dayScholarStudent.totalFee();
   }
}

