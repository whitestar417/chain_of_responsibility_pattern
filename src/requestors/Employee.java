package requestors;

public class Employee
{
    String firstName;
    String lastName;
    int vacationBalance;

    public Employee(String firstName, String lastName, int vacationBalance)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.vacationBalance = vacationBalance;
    }

    public int getVacationBalance()
    {
        return vacationBalance;
    }

    public void setVacationBalance(int vacationBalance)
    {
        this.vacationBalance = vacationBalance;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }
}
