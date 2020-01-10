
package Lesson6;


public class Book {
    private String auth,title;
    
    public Book(String t, String a){
        title = t;
        auth= a;
    }
    
    public String toString(){
        String x = "\""+title+"\" by ";
        x+=auth;
        return x;
    }
    
    public String getTitle(){
        return title;
    }
    
    
}
