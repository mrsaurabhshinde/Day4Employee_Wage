package com.bl.Employeewage;

public class EmployeeWage
{
    public static void main(String[] args) {
        System.out.println("Welcome to Employee wage program");
        int isPartTime =2;
        int isFullTime = 1;
        int empRatePerHour = 20;
        int empHrs = 0;
        int totalWage = 0;
        double empcheck= Math.floor(Math.random() *10) % 3;
        if (empcheck == isFullTime)
            empHrs = 8;
        else if (empcheck == isPartTime)
            empHrs = 4;
        totalWage = empHrs * empRatePerHour;
        System.out.println("Emp WAge: " + totalWage);
    }
}
