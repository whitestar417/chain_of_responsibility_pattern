package handlers;

import processes.Request;

public interface IVacationApprover
{
    void setNextApprover(IVacationApprover approver);

    void approveVacation(Request request);
}
