package processes;

import requestors.Employee;

public class Request
{
    int daysOff;
    Employee employee;

    public Request(int daysOff, Employee employee)
    {
        this.daysOff = daysOff;
        this.employee = employee;
    }

    public int getDaysOff()
    {
        return daysOff;
    }

    public Employee getEmployee()
    {
        return employee;
    }
}
