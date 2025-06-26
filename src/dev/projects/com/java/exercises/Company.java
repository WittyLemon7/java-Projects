package dev.projects.com.java.exercises;

import java.util.ArrayList;

public class Company {

    ArrayList<Employee> employees = new ArrayList<Employee>();

    //constructor

    public Company(ArrayList<Employee> employees) {
        this.employees = employees;
    }
    //method to add employee
    public void addEmployee(Employee employee){
        employees.add(employee);
    }
    //method to remove employee
    public void removeEmployee(Employee employee){
        employees.remove(employee);
    }
    //method to get employee
    public Employee getEmployee(int index){
        return employees.get(index);
    }
    //method to update salary
    public void updateSalary(Employee employee, double newSalary){
        employee.setSalary(newSalary);
    }
    //method to get all employees
    public ArrayList<Employee> getAllEmployees(){
        return employees;
    }
    //method to get total salary
    public double getTotalSalary(){
        double totalSalary = 0;
        for (Employee employee : employees){
            totalSalary += employee.getSalary();
        }
        return totalSalary;
    }
    //bonus objective
    //method to sort employees by salary in ascending order
    public ArrayList<Employee> sortEmployeesBySalary(){
        ArrayList<Employee> sortedEmployees = new ArrayList<Employee>();
        sortedEmployees.addAll(employees);
        sortedEmployees.sort((e1, e2) -> (int) (e1.getSalary() - e2.getSalary()));
        return sortedEmployees;
    }
    //method to filter employees by salary
    public ArrayList<Employee> filterEmployeesBySalary(double salary){
        ArrayList<Employee> filteredEmployees = new ArrayList<Employee>();
        for (Employee employee : employees){
            if (employee.getSalary() > salary){
                filteredEmployees.add(employee);
            }
        }
        return filteredEmployees;
    }

}
