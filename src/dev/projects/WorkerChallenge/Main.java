package dev.projects.WorkerChallenge;

public class Main {
    public static void main(String[] args) {

        Employee John  = new Employee("John ","11/11/1985",77001,"01/01/2020");
        System.out.println(John);
        System.out.println("Age = " + John.getAge());
        System.out.println("Pay = " + John.collectPay());

        salariedEmployee Joe  = new salariedEmployee("Joe ","11/11/1990",77002,"03/03/2020",35000);
        System.out.println(Joe);
        System.out.println("Joe's Paycheck = $" + Joe.collectPay());
        Joe.retire();
        System.out.println("Joe's pension = $" + Joe.collectPay());

        hourlyEmployee Jane = new hourlyEmployee("Jane ", "05/05/1995", "03/03/2021", 77003, 15);

        System.out.println(Jane);
        System.out.println("Jane's Paycheck = $" + Jane.collectPay());
        System.out.println("Jane's pension = $" + Jane.getDoublePay());



    }
}
