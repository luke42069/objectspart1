
package Lesson6;


public class Employee {
 //step 1: instance variables
    String name;
    private  int type; //1 = Full T, 2 = P Time
    private double rate;
    private int hours;
    
    //step 2: constructor
    public Employee(){
        name="";
        type = 0;
        rate = 0;
        hours = 0;
    }
    
    //step 3: instance methOds
    
    public String getTypeRules(){
        return "1 or 2";
    }
    public String getNameRule(){
        return "non-blank";
    }
    public String getRateRules(){
        return "between 6.75 and 30.50 inclusive";
    }
    public String getHourRules(){
        return "between 1 and 60 inclusive";
    }
    
    //boolean setters
    //if incoming data breaks the rules the property WONT get set, false returned
    //if incoming data is OK, property is set, and true is returned
    //this accomplishes 2 things ->
    //1) protects the property from being set to bad data
    //2) sends a signal back to client class to let it know if property was set or not
    
    public boolean setName(String nm){
        boolean nameblank = nm.equals("");
        if(nameblank)return false;
        else{
            name = nm;
            return true;
        }
    }
    
    public boolean setType(int t){
        boolean typeok = t==1||t==2;
        if(typeok){
            type = t;
            return true;
        }
        else return false;
    }
    
    public boolean setRate(double rt){
        boolean rateOk = rt>=6.75&&rt<= 30.50;
        if(rateOk){
            rate = rt;
            return true;
        }
        else return false;
    }
    
    public boolean setHours(int h){
        boolean hoursOk = h>=1&&h<=60;
        if(hoursOk)
            hours = h;
        return hoursOk;
    }
    
    public String getName(){
        return name;
    }
    public double getPay(){
        boolean overtime = (type==1&&hours>40);
        double pay;
        if(overtime){
            pay=(hours-40)*rate*2+rate*40;
        }
        else pay = hours*rate;
        
        return pay;
    }
    
    public int getType(){
        return type;
    }
}
