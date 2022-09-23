package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File( "output.txt");
        PrintWriter pw = new PrintWriter(file);
        File file1 = new File ("input.txt");

        int number;
        int number2;

        Scanner scanner = new Scanner(file1);
        number = Integer.parseInt(scanner.nextLine());

        double a = number/100000;

        if (a < 1){
            System.out.println("Wrong number");
        }

        int[] numbers = new int [6];
        int b = number;
        for (int i = 0; i < 6; i++) {
            numbers[i] = b % 10;
            b = b / 10;
        }

        number2 = (int) (numbers[0] * Math. pow(8, 0) + (numbers[1] * Math. pow(8, 1)) + (numbers[2] * Math. pow(8, 2)) +(numbers[3] * Math. pow(8, 3)) + (numbers[4] * Math. pow(8, 4)) + (numbers[5] * Math. pow(8, 5)));
        System.out.println(number2);
        String number2s =String.valueOf(number2);
        pw.println(number2s);
        pw.close();
    }
}
