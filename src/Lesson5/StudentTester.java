
package Lesson5;


public class StudentTester {

    
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Bob Smith");
        System.out.println("this guy named "+s.getName());
        
        //setting tests
        s.setScore(1, 76);
        s.setScore(2,85);
        s.setScore(3,99);
        System.out.println("Here are "+s.getName()+"'s 3 scores");
        for (int i = 0; i <=3; i++) {
            System.out.println(s.getScore(i));
        }
        
        System.out.format("The top score for %s is %d\n",s.getName(),s.getHighScore());
        System.out.format("%s's average is %d\n",s.getName(),s.getAverage());
        
        System.out.println(s);//will run toString automaticALLY
        
        Student s2 = new Student("Mike Hunt",94,97,95);
        System.out.println(s2);
        
        //make student using other constructor
        
        Student s3 = new Student(s);
        
        System.out.println("This is student 3\n"+s3+"\n");
            //4th student???  --> nah just another reference to s, like a nickname
        Student s4=s;
        s4.setName("Jill");
        System.out.println("Original student is "+s.getName());
        
    }
    
}
