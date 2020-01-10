
package Lesson6;


public class EmoployTetser {

    
    public static void main(String[] args) {
        Employee e1, e2;
        e1 = new Employee();
        e2 = new Employee();
        
        e1.setName("Joye FUll time");
        System.out.println(e1.setType(1));
        e1.setHours(45);
        e1.setRate(20);
        System.out.println("Joey full time type is "+e1.getType());
        
        e2.setName("joey part tim");
        e2.setType(2);
        e2.setHours(45);
        e2.setRate(20);
        
        System.out.println(e1.getName()+"pay=$"+e1.getPay());
    }
    
}
