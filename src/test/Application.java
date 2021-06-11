package test;

import handlers.Director;
import handlers.Manager;
import handlers.Supervisor;
import processes.Request;
import requestors.Employee;

public class Application
{
    public static void main(String[] args)
    {
        // Create a sender
        Employee employee = new Employee("John", "Smith", 20);

        // These are the handlers
        Supervisor supervisor = new Supervisor();
        Manager manager = new Manager();

        // Set the chain of handlers
        supervisor.setNextApprover(manager);

        // Create request and send to a handler
        Request johnRequest = new Request(15, employee);
        supervisor.approveVacation(johnRequest);


    }
}
