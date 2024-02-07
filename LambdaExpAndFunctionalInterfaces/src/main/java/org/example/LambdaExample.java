package org.example;

public class LambdaExample {
    public static void main(String[] args) {
        NumericOperator no1 = (x,y) -> x + y;
        int sum = no1.operate(3,5);
        System.out.println("Sum: " + sum);

//        NumericOperator no2 = (x,y) -> {
//            if(x>y){return x;}else{return y;}
//        };
//        or

        NumericOperator no2 = (x,y) -> (x > y) ? x : y;

//        or
//        NumericOperator no2 = (x,y) -> Math.max(x,y);

        int maxNum = no2.operate(3,5);
        System.out.println("Max number is: " + maxNum);

        StringFormatter sf1 = s -> s.toUpperCase();
        String formattedToUpper = sf1.format("this is capitalized");
        System.out.println(formattedToUpper);
    }
}
