package ua.hillel.barynova.lessons.lesson6;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan =  new Scanner(System.in);
        System.out.println("Please enter a team name 1");
        String user1 = scan.next();
        System.out.println("Name team1 :" + user1);

        int p1 = 10;
        int p2 = 15;
        int p3 = 17;
        int p4 = 9;
        int p5 = 20;
        System.out.println();
        System.out.println("Team results"+'\n'+p1+'\n'+p2+'\n'+p3+'\n'+p4+'\n'+p5);

        System.out.println();

        Scanner scan2 = new Scanner(System.in);
        System.out.println("Please enter a team name 2");
        String user2 = scan.next();
        System.out.println("Name team2 :" + user2);

        int p6 = 8;
        int p7 = 12;
        int p8 = 29;
        int p9 = 13;
        int p10 = 0;
        System.out.println();
        System.out.println("Team results"+'\n'+p6+'\n'+p7+'\n'+p8+'\n'+p9+'\n'+p10);

        double poi1 = 14.2;
        double poi2 = 12.4;

        System.out.println("Winner team:"+user1+'\n'+"Points scored"+" "+poi1);
        char star ='\u2606';
        System.out.println(star +"CONGRATULATIONS"+star);











    }

}
