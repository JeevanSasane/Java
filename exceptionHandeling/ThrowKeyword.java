package exceptionHandeling;

import java.util.Scanner;

public class ThrowKeyword {

    public static void main(String[] args) throws Exception {
        int age=17;
        char ch;


        if(age>18){
            System.out.println("You can Drive");
        }
        else {
            throw new Exception("You can not drive");
        }
    }
}

//Difference between throws and throw

//                throw                                       Throws

// 1: to throw the exception explicitly              1: to declare exception
// 2: throw is used in method                        2: throws is used with method signature
// 3: throw is followed by instance                  3: throws is followed by classes
// 4: you can throw only single exception            4: you can declare multiple exception
