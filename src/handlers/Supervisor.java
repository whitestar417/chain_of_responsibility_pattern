package handlers;

import processes.Request;

public class Supervisor implements IVacationApprover
{
    //handles vacation requests up to 2 weeks if enough vacation balance
    private IVacationApprover approver;


    @Override
    public void setNextApprover(IVacationApprover approver)
    {
        this.approver = approver;
    }

    @Override
    public void approveVacation(Request request)
    {
        if (request.getDaysOff() < 14 &&
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
