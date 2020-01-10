package AssignmentMainClasses;

import Lesson5.Student;
import java.util.Scanner;

public class StudentInterface {

    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        Scanner s = new Scanner(System.in);

        String name, highsname, highaname;
        int score, highscore, highavg;
//stu1 input

        while (true) {
            System.out.print("Enter name for first student(at least 1 letter): ");
            name = s.nextLine();
            stu1.setName(name);
            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test %d score for %s: ", i, stu1.getName());
                score = s.nextInt();
                stu1.setScore(i, score);
            }
            String errormsg = stu1.validateData();
            if (errormsg == null) {
                break;
            } else {
                System.out.println(errormsg);
                s.nextLine();
            }
        }

        s.nextLine();
        System.out.println("\n----------------------------\n");
        //stu2 input
        System.out.print("Enter name for second student(at least 1 letter): ");
        name = s.nextLine();
        stu2.setName(name);
        while (true) {

            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test %d score for %s: ", i, stu2.getName());
                score = s.nextInt();
                stu2.setScore(i, score);
            }
            String errormsg = stu2.validateData();
            if (errormsg == null) {
                break;
            } else {
                System.out.println(errormsg);
                s.nextLine();
            }
        }
        System.out.println("\n----------------------------\n");

        s.nextLine();

        //stu3 input
        System.out.print("Enter name for third student(at least 1 letter): ");
        name = s.nextLine();
        stu3.setName(name);
        while (true) {

            for (int i = 1; i <= 3; i++) {
                System.out.format("Enter test %d score for %s: ", i, stu3.getName());
                score = s.nextInt();
                stu3.setScore(i, score);
            }
            String errormsg = stu3.validateData();
            if (errormsg == null) {
                break;
            } else {
                System.out.println(errormsg);
                s.nextLine();
            }
        }
        System.out.println("\n----------------------------\n");
        //output
        System.out.println(stu1);
        System.out.println(stu2);
        System.out.println(stu3);

        highsname = stu1.getHighScore() > stu2.getHighScore() ? stu1.getName() : stu2.getName();
        highscore = stu1.getHighScore() > stu2.getHighScore() ? stu1.getHighScore() : stu2.getHighScore();
        highsname = highscore > stu3.getHighScore() ? highsname : stu3.getName();
        highscore = highscore > stu3.getHighScore() ? highscore : stu3.getHighScore();

        highaname = stu1.getAverage() > stu2.getAverage() ? stu1.getName() : stu2.getName();
        highavg = stu1.getAverage() > stu2.getHighScore() ? stu1.getAverage() : stu2.getAverage();
        highaname = highavg > stu3.getAverage() ? highaname : stu3.getName();
        highavg = highavg > stu3.getAverage() ? highavg : stu3.getAverage();

        System.out.format("%s has the highest score of %d, while %s has the highest average of %d.\n", highsname, highscore, highaname, highavg);
    }

}
