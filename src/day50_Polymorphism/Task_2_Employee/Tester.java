package day50_Polymorphism.Task_2_Employee;

/*
4. create a final class named Tester that can inherit Employees, ScrumTeam, and WorkRemotely
            actions: findingBug(), creatingTicket()
 */
public final class Tester extends Employee implements ScrumTeam,WorkRemotely {


    public void findingBug() {
        System.out.println(" finding Bug");
    }

    public void creatingTicket() {
        System.out.println(" creating Ticket");
    }

    @Override
    public void work() {

    }

    @Override
    public void meeting() {

    }

    @Override
    public void dailyStandUp() {

    }

    @Override
    public void workFromHome() {

    }

    public Tester(String employeeName, long employeeId, double salary, long ssn, String jobTitle, boolean isFullTime,
                  boolean hasPTO) {
        setEmployeeName(employeeName);
        setEmployeeId(employeeId);
        setSalary(salary);
        setSsn(ssn);
        setJobTitle(jobTitle);
        setFullTime(isFullTime);
        setHasPTO(hasPTO);

    }
}
