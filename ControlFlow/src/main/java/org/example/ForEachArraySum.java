package org.example;

public class ForEachArraySum {
    public static void main(String[] args) {
        int[] arrayNums = {1,2,3,4,5};
        int sum = 0;

        for(int num: arrayNums){
            sum += num;
        }
        System.out.println("Total: " + sum);
    }
}
