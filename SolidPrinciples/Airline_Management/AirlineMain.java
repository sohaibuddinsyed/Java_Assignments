package SolidPrinciples.Airline_Management;

import SolidPrinciples.Airline_Management.Employs.*;
import SolidPrinciples.Airline_Management.Flights.Flight;
import SolidPrinciples.Airline_Management.Tickets.*;

/*
package Employs -
    class Employee
    class Modified employee extends Employee
    class AddEmployee, AddModifiedEmployee, ShowEmployeeDetails

package Tickets -
    abstract class Ticket
    abstract class TicketBookingService
    class TicketBookingForEconomy, TicketBookingForExecutive extends TicketBookingService
    class TicketBookingWithVoucher extends Ticket

package Flights -
    interfaces FlightChecks, UtilityChecks
    class Flight(Employee,Ticket) implements FlightChecks, UtilityChecks
*/

public class AirlineMain {
    public static void main(String args[]) {

        Employee employee = new Employee();
        AddEmployee.addEmployee(employee);

        TicketBookingForEconomy ticket = new TicketBookingForEconomy();
        ticket.book();

        Flight flight = new Flight(employee, ticket);
        PrintTicketDetails.printTicket(ticket);

    }
}
