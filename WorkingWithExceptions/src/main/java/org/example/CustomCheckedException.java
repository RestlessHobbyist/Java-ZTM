package org.example;

public class CustomCheckedException {
    public static void main(String[] args) {
        try {
            validateAge(-5);
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        System.out.println("Error handled smoothly...nice!");
    }

    public static void validateAge(int age) throws InvalidAgeException{
        if(age < 0 || age > 120){
            throw new InvalidAgeException("Age provided is out of bounds of expected age range 0-120");
        }
    }
}
