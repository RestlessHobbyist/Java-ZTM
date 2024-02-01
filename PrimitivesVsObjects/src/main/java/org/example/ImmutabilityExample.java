package org.example;

public class ImmutabilityExample {
    public static void main(String[] args) {
//        Immutable Primitives - Doesn't mean they can't be assigned new values, their values are passed in, not referenced.
//        ex: a=1, if we set b=a, behind the scenes 'b' gets the value '1' not 'a', ergo when we print 'b' it will be '1'.
//        After setting 'b' equal to the value of 'a', if 'a' is then assigned a new value i.e. '2', 'b' will have nothing to do with that assignment and still has a value of '1'
//        ergo when printed 'b' will still be '1'
        byte ogByte = 8;
        byte imByte = ogByte;
        //'imByte' now has the value of 8 from 'ogByte'

        ogByte = 3;
//        'ogByte' now has a value of 3 so does that mean 'imByte' is also = 3?
        System.out.println("ogByte: " + ogByte);
//        ^This should be 3^
        System.out.println("imByte: " + imByte);
//        ^This should be 8^ the original value of 'ogByte' when it was assigned to 'imByte' ergo making 'imByte' immutable b/c it was given a value to store not a reference

//        Mutable Objects - Can be assigned new values like primitives but their values are passed in by reference
//        ex: a=1, if we set b=a, 'b' now has a reference to whatever value(s) 'a' has, so in future uses 'b' will look to 'a' to know what values it has
        Person ogName = new Person();
        Person refName = ogName;

        ogName.name = "Cappy";
        System.out.println("ogWord: " + ogName.name);
//        ^This should be "Cappy"^
        System.out.println("refWord: " + refName.name);
//        ^This should be "Cappy"^ because it references the value 'ogName' contains
    }
}
