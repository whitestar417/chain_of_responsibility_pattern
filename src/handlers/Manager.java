package handlers;

import processes.Request;

public class Manager implements IVacationApprover
{
    //handles vacation requests from 2 to 4 weeks if enough vacation balance
    private IVacationApprover approver;

    @Override
    public void setNextApprover(IVacationApprover approver)
    {
        this.approver = approver;
    }

    @Override
    public void approveVacation(Request request)
    {
        if (request.getDaysOff() < 28 &&
                request.getEmployee().getVacationBalance() >= request.getDaysOff())
        {
            System.out.println(request.getEmployee().getFirstName() + ", your vacation request has been approved");
        }
        else
        {
            if (approver != null)
            {
                System.out.println(request.getEmployee().getFirstName() + ", your vacation request has been forwarded");
                approver.approveVacation(request);
            }
        }
    }
}
