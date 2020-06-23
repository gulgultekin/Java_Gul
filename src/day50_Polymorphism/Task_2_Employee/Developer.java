package day50_Polymorphism.Task_2_Employee;

//5. create a final class named Developer that can inherit Employees, ScrumTeam, and WorkRemotely
//            set a constuctor that can initialize fileds (instance variables)

public final class Developer extends Employee implements ScrumTeam,WorkRemotely{
//  private String employeeName;
//    private long employeeId;
//    private double salary;
//    private long ssn;
//    private String jobTitle;
//    private boolean isFullTime;
//    private boolean hasPTO;
    public Developer(String employeeName,long employeeId,double salary,long ssn,String jobTitle,boolean isFullTime,boolean hasPTO){
        setEmployeeName(employeeName);
        setEmployeeId(employeeId);
        setSalary(salary);
        setSsn(ssn);
        setJobTitle(jobTitle);
        setFullTime(isFullTime);
        setHasPTO(hasPTO);


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
}
