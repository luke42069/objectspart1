package AssignmentMainClasses;

import Lesson5.Dice1;

public class Lucky7 {

    public static void main(String[] args) {
        Dice1 d1 = new Dice1();
        Dice1 d2 = new Dice1();
        int tries = 0,money=100,besttry=1,bestmoney=0;

        
        
        
        while (true) {
            d1.roll();
            d2.roll();
            tries++;
            int total = d1.getValue() + d2.getValue();
            if(total==7)money+=4;
            else money-=1;
            if(money>bestmoney){
                bestmoney=money;
                besttry=tries;
            }
            System.out.print("Try " + tries + ":  \t");
            System.out.format("You rolled a %d and a %d for a total of %d. You now have $%d.\n", d1.getValue(), d2.getValue(), total,money);
            
            if (money <= 0) {
                break;
            }
        }
        System.out.println("=========================================================================");
        System.out.format("You went broke after %d rolls. You should have quit after %d rolls when you had $%d.\n\n\n",tries,besttry,bestmoney);
        
    }

}
