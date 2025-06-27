package dev.projects.WorkerChallenge;

public class Worker {

    private String name;
    private String birthDate;
    //protected so that it can be accessed by the subclasses
    protected String endDate;

    public Worker(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public int getAge() {
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return currentYear - birthYear;

    }
    public double collectPay() {
        return 0.0;

    }
    public void terminate(String endDate) {
        this.endDate = endDate;

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name = '" + name + '\'' +
                ", birthDate = '" + birthDate + '\'' +
                ", endDate = '" + endDate + '\'' +
                '}';
    }
}
class Employee extends Worker {
    private long employeeId;
    private String hireDate;
    private  static  int employeeNo = 1;

    public Employee(String name, String birthDate, long employeeId, String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId = " + employeeId +
                ", hireDate = '" + hireDate + '\'' +
                '}' + super.toString();
    }
}
class salariedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    public salariedEmployee(String name, String birthDate, long employeeId, String hireDate, double annualSalary) {
        super(name, birthDate, employeeId, hireDate);
        this.annualSalary = annualSalary;
    }


    @Override
    public double collectPay() {
        double paycheck = annualSalary / 26;
        double adjustedPay = isRetired ? paycheck * 0.9 : paycheck;
        return (int) adjustedPay;

    }

    public void retire() {
        terminate("12/12/2025");
        isRetired = true;
    }
}
class hourlyEmployee extends Employee {
    private double hourlyRate;

    public hourlyEmployee(String name, String birthDate, String hireDate,int employeeid, double hourlyRate) {
        super(name, birthDate,employeeid,hireDate);
        this.hourlyRate = hourlyRate;
    }
    @Override
    public double collectPay() {
        return 40 * hourlyRate;
    }

    public double getDoublePay() {
        return 2 * collectPay();

    }
}
