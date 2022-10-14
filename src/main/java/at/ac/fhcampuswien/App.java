package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber() {
        // input your solution here
            double yourNumber = 0;

            double input;

            int counter = 1;

            Scanner scanner = new Scanner(System.in);

            do {
                System.out.print("Number " + counter + ": ");

                input = scanner.nextDouble();

                if (input > 0) {

                    if (input > yourNumber) yourNumber = input;

                }

                counter++;

            } while (input > 0);

            if (yourNumber == 0) System.out.println("No number entered.");

            else System.out.println("The largest number is " + yourNumber);

    }



    //todo Task 2
    public void stairs(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        int input;

        int counter = 1;

        System.out.print("n: ");

        input = scanner.nextInt();

        if (input <= 0) System.out.println("Invalid number!");
        else {
            for (int i = 1; i <= input; i++) {
                for (int j = 0; j < i; j++) {
                    System.out.print(counter);
                    counter++;
                    System.out.print(" ");
                }
                System.out.println();
            }
        }

    }

    //todo Task 3
    public void printPyramid(){
        // input your solution here
        int l = 6;

        for(int i = 1; i <= 6; i++)
        {
            for(int j = 1; j < l; j++)
            {
                System.out.print(" ");
            }
            l = l-1;
            for(int k = 1; k < i*2; k++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    //todo Task 4
    public void printRhombus(){
        // input your solution here
        Scanner input = new Scanner(System.in);

        System.out.print("h: ");
        int h = input.nextInt();

        System.out.print("c: ");
        char c = input.next().charAt(0);
        int remainder = h % 2;

        if (remainder != 0) {

            if (h >= 0 && h % 2 != 0) {

                int asciiValue = c;
                int middle = h / 2;
                int smallValue = asciiValue - middle;

                for (int i = 0; i < h; i++) {
                    int x = 0;

                    if (i <= middle) {
                        x = middle - i;
                    } else {
                        x = i - middle;
                    }
                    for (int k = 0; k < x; k++) {
                        System.out.print(" ");
                    }

                    int smallValueInLine = 0;

                    if (i <= middle) {
                        smallValueInLine = asciiValue - i;
                    } else {
                        smallValueInLine = smallValue + (i - middle);
                    }
                    for (int k = smallValueInLine; k <= asciiValue; k++) {
                        System.out.print((char) k);
                    }
                    for (int k = asciiValue - 1; k >= smallValueInLine; k--) {
                        System.out.print((char) k);
                    }
                    System.out.print("\n");
                }
            }
        }
        if ((remainder == 0))
        {
            System.out.println("Invalid number!");
        }
    }

    //todo Task 5
    public void marks(){
        // input your solution here
        double grade;

        double sumGrades = 0;

        double average;

        int countMark = 0;

        int countNeg = 0;

        Scanner scanner = new Scanner( System.in );

        System.out.print( "Mark " + ( countMark + 1 )  + ": " );
        grade = scanner.nextDouble();

        while( grade != 0 )
        {
            if( grade < 0 || grade > 5 )
            {
                System.out.println( "Invalid mark!" );
            }
            else
            {
                if( grade == 5 )
                {
                    countNeg++;
                }
                sumGrades += grade;
                countMark++;
            }
            System.out.print( "Mark " + ( countMark + 1 ) + ": " );
            grade = scanner.nextDouble();
        }

        if( sumGrades == 0 )
        {
            System.out.println( "Average: " + String.format( "%.2f", sumGrades ) );
        }
        else
        {
            average = sumGrades / countMark;
            System.out.println( "Average: " + String.format( "%.2f", average ) );
        }
        System.out.println( "Negative marks: " + countNeg );
    }

    //todo Task 6
    public void happyNumbers(){
        // input your solution here
        Scanner scanner = new Scanner(System.in);

        Integer number;

        char[] splitNo;


        System.out.print("n: ");

        number = scanner.nextInt();

        while (number != 1 && number != 4) {
            splitNo = number.toString().toCharArray();

            number = 0;

            for (int i = 0; i < splitNo.length; i++){

                number += Character.getNumericValue(splitNo[i]) * Character.getNumericValue(splitNo[i]);
            }
        }
        if (number == 1) System.out.println("Happy number!");

        if (number == 4) System.out.println("Sad number!");
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}