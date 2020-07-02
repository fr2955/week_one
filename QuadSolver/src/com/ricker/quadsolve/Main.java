package com.ricker.quadsolve;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean looper = true;


        String inputOfText;
        Scanner scanyScan = new Scanner(System.in);
        double x1, x2, varA, varB, varC;
        System.out.println("Welcome to the quad solver, enter your input for you quad with the form as Ax^2 + Bx+ C when prompted");

        while (looper) {
            //A
            System.out.print("Enter Input A or x to exit: ");

                inputOfText = scanyScan.next();
                char exitM = inputOfText.charAt(0);

                if (exitM == 'x') {
                    System.out.print("Exiting!");
                    looper = false;
                    System.exit(1);

                } else {
                    varA = Double.parseDouble(inputOfText);


                    //B
                    System.out.print("Enter Input B: ");
                    inputOfText = scanyScan.next();
                    varB = Double.parseDouble(inputOfText);
                    //C
                    System.out.print("Enter Input C: ");
                    inputOfText = scanyScan.next();
                    varC = Double.parseDouble(inputOfText);

                    //Math
                    x1 = (-varB + Math.sqrt(Math.pow(varB, 2) - (4 * varA * varC))) / (2 * varA);
                    x2 = (-varB - Math.sqrt(Math.pow(varB, 2) - (4 * varA * varC))) / (2 * varA);
                    System.out.printf("The solution for the quadratic entered is: X = %3.1f, %3.1f \n", x1, x2);
                }
            }
        }
    }
