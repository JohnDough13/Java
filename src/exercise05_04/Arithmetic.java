package exercise05_04;

import java.util.*;

public class Arithmetic {
    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//        int intValue = keyboard.nextInt();
//
//        keyboard.close();
//

        int number1 = 7;
        int number2 = 13;

        int result = number1 + number2;
        System.out.println(result);
        result = number1 - number2;
        System.out.println(result);
        result = number1 * number2;
        System.out.println(result);
        result = number1 / number2;
        System.out.println(result);
        result = number1 % number2;
        System.out.println(result);

        System.out.println(--number1);
        System.out.println(number1--);
        System.out.println(++number1);
        System.out.println(number1++);

        char myChar = 'd';
        ++myChar;
        System.out.println(myChar);

        int numberOne = 2147483645;
        int numberTwo = 2147483642;
        long castingResult;
        castingResult = number1 * numberTwo;

        System.out.println(castingResult);


    }
}
