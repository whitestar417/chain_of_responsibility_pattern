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
        Employee employee = new Employee("John", "Smith", 20);

        // These are the handlers
        Supervisor supervisor = new Supervisor();
        Manager manager = new Manager();


        // set the chain of handlers
        supervisor.setNextApprover(manager);
        Request request = new Request(15, employee);
        supervisor.approveVacation(request);


    }
}
