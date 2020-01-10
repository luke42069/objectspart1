
package Lesson6;

import java.util.Scanner;

public class payrollinterface {

    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Employee emp;
        String name;
        int type;
        double rate;
        int hours;
        
        while(true){
            emp = new Employee();
            //ask for name
            System.out.println("Enter data for new employee\n=====================\n");
            System.out.println("  >> Name or <enter> to quit: ");
            name = scan.nextLine();
            //try to set name, if fail exit program
            if(emp.setName(name)==false)break;
            //if no break fill in rest of data for employee
            while(true){
                System.out.println(" >> Type: ("+emp.getTypeRules()+"): ");
                type = scan.nextInt();
                if(emp.setType(type))break;
            }
            while(true){
                System.out.println(" >> Rate: ("+emp.getRateRules()+"): ");
                rate = scan.nextDouble();
                if(emp.setRate(rate))break;
            }
            while(true){
                System.out.println(" >> Hours: ("+emp.getHourRules()+"): ");
                hours = scan.nextInt();
                if(emp.setHours(hours))break;
            }
            
            //when I get to here the employee has all vALID data set to its properties
            //print the pay
            System.out.println("");
            System.out.format("Weekly pay for %s is $%.2f\n",emp.getName(),emp.getPay());
            System.out.println("");
            scan.nextLine();//clear the scanner at bottom of loop
            
        }
        System.out.println("Program ended");
    }
    
}
