
package AssignmentMainClasses;

import Lesson6.Book;
import Lesson6.Patron;


public class Library {

    
    public static void main(String[] args) {
        Book b1 = new Book("From Russia With Love","Greg Hines");
        Book b2 = new Book("Living Smart","Rita Langill");
        Book b3 = new Book("Singing in the Rain","Harry Conner");
        Book b4 = new Book("Good Housekeeping","Pat Burns");
        Book b5 = new Book("To Be a Model","Lisa Lahey");
        System.out.println("Here are the books available: ");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);//write toString method
        System.out.println(b4);
        System.out.println(b5);
        Patron p = new Patron("Miles Davis");
        System.out.println("----");
        System.out.println("Lending 4 books to "+p.getName()+":");
        if(p.borrow(b1)) System.out.println("\""+b1.getTitle()+"\" successfully borrowed.");
        else System.out.println("\""+b1.getTitle()+"\" could not be borrowed.");
        if(p.borrow(b2)) System.out.println("\""+b2.getTitle()+"\" successfully borrowed.");
        else System.out.println("\""+b2.getTitle()+"\" could not be borrowed.");
        if(p.borrow(b3)) System.out.println("\""+b3.getTitle()+"\" successfully borrowed.");
        else System.out.println("\""+b3.getTitle()+"\" could not be borrowed.");
        if(p.borrow(b4)) System.out.println("\""+b4.getTitle()+"\" successfully borrowed.");
        else System.out.println("\""+b4.getTitle()+"\" could not be borrowed.");
        
        
        System.out.println("-----\nAttempting to return the first book:\n-----");
        if(p.returnBook(b1))System.out.println("\""+b1.getTitle()+"\" successfully returned.");
        else System.out.println(b1.getTitle()+" was not borrowed out.");
        System.out.println("----\nHere is a list of books currently lent to "+p.getName()+"\n----");
        if(p.hasBook(b1))System.out.println(b1);
        if(p.hasBook(b2))System.out.println(b2);
        if(p.hasBook(b3))System.out.println(b3);
        if(p.hasBook(b4))System.out.println(b4);
        if(p.hasBook(b5))System.out.println(b5);
        
    }
    
}
