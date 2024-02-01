package org.example;

public class AvgOddNumsInArray {
    public static void main(String[] args) {
        int[] numbers = {2,3,5,7,8,9};
        int sum = 0;
        int count = 0;

        for(int num : numbers){
            if(num % 2 != 0){
                sum += num;
                count++;
            }
        }
        double avg = (double) sum/count;
        System.out.println("We found "+count+" odd numbers for a total of "+sum+" for an average of "+avg);
    }
}
