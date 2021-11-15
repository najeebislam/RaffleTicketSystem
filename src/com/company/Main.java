package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    private static String[][] RaffleInfo = new String[10][2];
    public static void main(String[] args) {

        try {
            BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));
            System.out.println("Would you like to check or buy a raffle ticket?");
            String answer = bufferedReader.readLine();
            if (answer.contains("check")) {
               buyTicket();
            }else if (answer.contains("buy")) {

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void buyTicket(String buyTicket1) {
        try {

            BufferedReader bufferedReader = new BufferedReader((new InputStreamReader(System.in)));
            Random random = new Random();
            System.out.println("What is your name?");
            String name = bufferedReader.readLine();
            RaffleInfo[1][1] = name;
            System.out.println("Here is your raffle number!");
            int raffleNumber = random.nextInt(10) + 1;
            System.out.println(raffleNumber);
            Integer.toString(raffleNumber);
            RaffleInfo[1][2] = raffleNumber;
        } catch (Exception e) {
            e.printStackTrace();
        }






    }

}
