package handlers;

import processes.Request;

public class Director implements IVacationApprover
{
    //handles vacation requests greater than 4 weeks or if insufficient
    //vacation balance
    private IVacationApprover approver;

    @Override
    public void setNextApprover(IVacationApprover approver)
    {
        this.approver = approver;
    }

    @Override
    public void approveVacation(Request request)
    {
        if (request.getEmployee().getVacationBalance() >= request.getDaysOff())
        {
            System.out.println(request.getEmployee().getFirstName() + ", your vacation request has been approved");
        }
        else
        {
            System.out.println(request.getEmployee().getFirstName() + ", your vacation request has been disapproved");
        }
    }
}
