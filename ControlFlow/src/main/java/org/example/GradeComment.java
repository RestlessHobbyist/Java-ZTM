package org.example;

import java.util.Scanner;

public class GradeComment {
    public static void main(String[] args) {
        Scanner userGrade = new Scanner(System.in);
        System.out.print("What grade did you get?: ");
        char grade = userGrade.nextLine().toUpperCase().toCharArray()[0];
        System.out.println("You got a(n) " + grade);

        switch(grade) {
            case 'A':
                System.out.println("Congrats, take a bow!");
                break;
            case 'B':
                System.out.println("Nice job, above the curve, still room for improvement...like this code");
                break;
            case 'C':
                System.out.println("Average, meets the expectations, on par, mediocre, not good but not bad.");
                break;
            case 'D':
                System.out.println("Oh, you should really try harder, this isn't quite the level of effort expected of you, but we recognize you tried.");
                break;
            case 'F':
                System.out.println("Low/no effort, best try something else, this isn't for you");
                break;
            default:
                System.out.println("lol wut? That's not a grade, try again.");
        }
    }
}
