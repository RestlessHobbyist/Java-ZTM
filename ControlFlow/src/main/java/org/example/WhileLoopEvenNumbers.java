package org.example;

public class WhileLoopEvenNumbers {
    public static void main(String[] args) {
        int n = 8;
        int counter = 0;

        while(n > 0){
            counter += 2;
            System.out.println("Even numbers: " + counter);
            n--;
        }
//        OR
        int n2 = 8;
        int counter2 = 0;
        int i=0;
        while(counter2 < n2){
            if(i % 2 == 0){
                System.out.println(i);
                counter2++;
            }
            i++;
        }
    }
}
