package exercise05_06;

public class relationalOperators {
    public static void main(String[] args) {


        int number1 = 8;
        int number2 = -6;
        boolean number;

       number = number1 < number2 ?true: false;
        if (number == true) {
            System.out.println("Number 1 is smaller then number 2.");
            if (number == false) {
                System.out.println("Number 2 is smaller then number 1.");
            }
        }
        number = number1 <= number2 ? true : false;
        if (number == true) {
            System.out.println("Number 1 is smaller or equal to number 2.");
            if (number == false) {
                System.out.println("Number 2 is smaller or equal to number 1.");
            }
        }
        number = number1 > number2 ? false : true;
        if (number == true) {
            System.out.println("Number 1 is bigger then number 2.");
            if (number == false) {
                System.out.println("Number 2 is bigger then number 1.");
            }
        }
        number = number1 >= number2 ? false : true;
        if (number == true) {
            System.out.println("Number 1 is bigger or equal to number 2.");
            if (number == false) {
                System.out.println("Number 2 is bigger or equal to number 1.");
            }
        }
        number = number1 == number2 ? true : false;
        if (number == true) {
            System.out.println("Number 1 is equal to number 2.");
            if (number == false) {
                System.out.println("Number 2 isn't equal to number 1.");
            }
        }
        number = number1 != number2 ? false : true;
        if (number == true) {
            System.out.println("Number 1 isn't equal to number 2.");
            if (number == false) {
                System.out.println("Number 2 is equal to number 1.");
            }
        }
    }


}
