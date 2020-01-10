package Lesson6;

public class Patron {

    private String name;
    private Book b1, b2, b3;

    public Patron(String n) {
        name = n;
        b1 = null;
        b2 = null;
        b3 = null;
    }

    public boolean borrow(Book b) {
        //return true if can borrow, false if not
        if (b1 != null && b2 != null && b3 != null) {
            return false;
        }
        if (hasBook(b)) {
            return false;
        }

        if (b1 == null) {
            b1 = b;
            return true;
        } else if (b2 == null) {
            b2 = b;
            return true;
        } else {
            b3 = b;
            return true;
        }
        
    }

    public boolean returnBook(Book b) {

        if (b == b1) {
            b1 = null;
            return true;
        } else if (b == b2) {
            b2 = null;
            return true;
        } else if (b == b3) {
            b3 = null;
            return true;
        } else {
            return false;
        }
    }

    public boolean hasBook(Book b) {
        if (b == b1 || b == b2 || b == b3) {
            return true;
        } else {
            return false;
        }
    }
    
    public String getName(){
        return name;
    }
}
