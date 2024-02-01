package org.example;

public class HiLowGrades {
    public static void main(String[] args) {
        int[] grades = {38, 73, 88, 93, 100};
        int low = grades[0];
        int high = grades[0];

        for(int grade: grades){
            if(grade > high){
                high = grade;
            }
            if(grade < low){
                low = grade;
            }
        }
        System.out.println("The highest grade was: "+high+". The lowest grade was: "+low);
    }
}
