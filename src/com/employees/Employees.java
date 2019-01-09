package com.employees;


import java.util.Scanner;  
public class Employees {  
    String name;  
        int bonus;  
        long salary;  
        long totalsalary;  
        void accept()  
        {  
         Scanner s= new Scanner(System.in);  
         System.out.println("Enter Name of Employees\n");  
         name=s.nextLine();  
         System.out.println("Enter the Bonus of Employee\n");  
         bonus=s.nextInt();  
         System.out.println("Enter the Salary\n");  
         salary=s.nextInt();  
        }  
        void calctotal()  
        {  
            totalsalary=salary+bonus;  
        }  
        void print()  
        {  
            System.out.println("Name of Employee\n"+name);  
            System.out.println("Salary of Employee\n"+salary);  
            System.out.println("Bonus of Employee\n"+bonus);  
            System.out.println("Totalsalary of Employee\n"+totalsalary);  
        }  }
           
