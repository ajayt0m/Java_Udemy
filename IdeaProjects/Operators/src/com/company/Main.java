package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result - 1; // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; // 2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3; // the remainder of ( 4 % 3 ) = 1
        System.out.println("4 % 3 = " + result);

        // result = result + 1;
        result++; // 1 + 1 =2
        System.out.println("1 + 1 = " + result);

        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        // result = result + 2;
        result += 2; // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        // result = result * 10
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        // result = result / 3
        result /= 3; // 30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        // result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if(isAlien == false)
        {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100)
        {
            System.out.println("You got the high score");
        }

        int secondTopScore = 60;
        if ((topScore > secondTopScore) && (topScore < 100))
        {
            System.out.println("Greater than second top score and less than 100");
        }

        if ((topScore > 90) || (secondTopScore <= 90))
        {
            System.out.println("Either or both of the conditions are true");
        }

        int newValue = 50;
        if (newValue == 50)
        {
            System.out.println("This is true");
        }

        boolean isCar = false;
        if(isCar == false)
        {
            System.out.println("This is correct");
        }

        if(!isCar) // !isCar is treated as 'is isCar false' and isCar as 'is isCar true'
        {
            System.out.println("This is also correct");
        }

        if(isCar)
        {
            System.out.println("This is correct");
        }

        isCar = true;
        int wasCar = isCar ? 1 : 2; /* isCar is checked and if its true,
        value 1 is assigned to wasCar. If its false, then value 2 is assigned to wasCar */
        System.out.println(wasCar);

        double myDouble = 20.00d ;
        double mySecondDouble = 80.00d;
        double addandmultiply = (myDouble + mySecondDouble) * 100.00d;
        System.out.println("add and multiply = " + addandmultiply);
        double remainder = addandmultiply % 40.00d;
        System.out.println("The remainder = " + remainder);
        boolean myBoolean = (remainder == 0) ? true : false;
        System.out.println("myBoolean = " + myBoolean );
        if (myBoolean != true)
        {
            System.out.println("Got some remainder");
        }




    }
}
