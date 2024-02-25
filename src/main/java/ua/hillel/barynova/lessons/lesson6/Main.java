package ua.hillel.barynova.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a team name 1");
        String user1 = scan.next();
        System.out.println("Name team1 :" + user1);

        System.out.println("Points team 1 :");

        int u1 = 10;
        int u2 = 5;
        int u3 = 12;
        int u4 = 24;
        int u5 = 81;

        if (scan.hasNextInt()) {
            u1 = scan.nextInt();
            System.out.println("Player1:" + " " + u1);

            u2 = scan.nextInt();
            System.out.println("Player2:" + " " + u2);

            u3 = scan.nextInt();
            System.out.println("Player3:" + " " + u3);

            u4 = scan.nextInt();
            System.out.println("Player4:" + " " + u4);

            u5 = scan.nextInt();
            System.out.println("Player5:" + " " + u5);
        } else {
            System.out.println("Wrong data. Restart app");
            System.exit(0);





            }


//        int u2 = scan.nextInt();
//        System.out.println("User2:"+" "+p2);
//        int u3 = scan.nextInt();
//        System.out.println("User3:"+" "+p3);
//        int u4 = scan.nextInt();
//        System.out.println("User4:"+" "+p4);
//        int u5 = scan.nextInt();
//        System.out.println("User5:"+" "+p5);
//        String clean = scan.nextLine();
//        System.out.println("Total points:");
//        int total1 = scan.nextInt();
//        System.out.println("POINTS:"+total1);


//
//            if (scan.hasNext())
//                u1 = scan.nextInt();
//            else
//                System.out.println("Wrong data. Restart app");
//        System.exit(0);

//        System.out.println();
//
//        Scanner scan2 = new Scanner(System.in);
//        System.out.println("Please enter a team name 2");
//        String user2 = scan.next();
//        System.out.println("Name team2 :" + user2);
//
//        int p6 = 8;
//        int p7 = 12;
//        int p8 = 29;
//        int p9 = 13;
//        int p10 = 0;


        }


    }