package com.company;
import java.util.Scanner;
import java.util.Random;

public class Questions
{
    static String q = "Q";
    static String a = "";
    static int num = 0;
    static int mx = 5;
    static Random ran = new Random();

    static void mathQ(int Q)
    {
        System.out.println("Math Question");

        switch (Q) {
            case 0:
                q = "8 x 8 + 12";
                a = "76";
                break;
            case 1:
                q = "4 x 8";
                a = "32";
                break;

            case 2:
                q = "2500 - 1163";
                a = "1337";
                break;

            case 3:
                q = "641 + 1380";
                a = "2021";
                break;

            case 4:
                q = "650 / 13";
                a = "50";
                break;
            default:
                System.out.println("default " + Q);
                break;
        }
        System.out.println(q);
    }

    static void amazon(int Q)
    {
        System.out.println("Amazon Question");
        switch (Q) {
            case 1:
                q = "How many Leadership principles are there?";
                a = "14";
                break;

            case 2:
                q = "What are amazon Desks made out of?";
                a = "door";
                break;

            case 3:
                q = "What was amazon's first device?";
                a = "fire phone";
                break;

            case 4:
                q = "What does AWS stand for?";
                a = "amazon web services";
                break;
        }
        System.out.println(q);

    }

    static void general(int Q)
    {
        System.out.println("General Question");
        switch(Q) {
            case 1:
                q = "Which insect has the most legs";
                a = "millipede";
                break;

            case 2:
                q = "How many sports were added to the 2021 Olympics?";
                a = "5";
                break;

            case 3:
                q = "What is the tallest building in seattle?";
                a = "columbia center";
                break;
        }
        System.out.println(q);
    }
    static void Select()
    {
        int op = ran.nextInt(3)+1;
        int[] sel = {0,0,0,0,0};
        switch(op) {
            case 1:
                sel[num] = 1;
                mathQ(ran.nextInt(4));
                break;
            case 2:
                sel[num] = 2;
                amazon(ran.nextInt(3)+1);
                break;
            case 3:
                sel[num] = 3;
                general(ran.nextInt(2)+1);
                break;
        }
        num+=1;
    }

}

