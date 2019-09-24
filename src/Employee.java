
import java.time.LocalDate;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dimas A
 */
public class Employee {
    private final String name;
    private double salary; 
    private final LocalDate hireDay; 
    
    public Employee(String n, double s, int year, int month, int day)     
            { 
                name = n;
                salary = s; 
                hireDay = LocalDate.of(year, month, day);      
            }
    public String getName() 
    {
        return name;
    } 
         
    public double getSalary()
    {
        return salary;
    }
         
    public LocalDate getHireDay() 
    {
        return hireDay; 
    }
    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100; 
        salary += raise; 
    }
    
    public boolean equals(Employee other)   
    {      
        return name.equals(other.name);   
    } 
    public static void main(String[] args) 
        { 
          // fill the staff array with three Employee objects 
          Employee[] staff = new Employee[3];         
          
            staff[0] = new Employee("Carl Cracker", 75000, 1987, 12, 15);         
            staff[1] = new Employee("Harry Hacker", 50000, 1989, 10, 1);         
            staff[2] = new Employee("Tony Tester", 40000, 1990, 3, 15); 

            // raise everyone's salary by 5% 20        
            for (Employee e : staff)  e.raiseSalary(5);
            
            
            // print out information about all Employee objects 24        
            for (Employee e : staff) 
                System.out.println("name=" + e.getName() + ",salary=" + e.getSalary() + ",hireDay="  + e.getHireDay()); 
            
            if (staff[0].equals(staff[2])){
                System.out.println("sama");
            }else{
                System.out.println("tidak");
            }
        } 
}
