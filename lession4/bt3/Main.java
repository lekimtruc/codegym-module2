package lession4.bt3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter to start");
        String enter = sc.nextLine();
        StopWatch stopWatch = new StopWatch();
        long startTime = stopWatch.start();
        System.out.println("Start time: " +startTime);

        System.out.println("Enter to end");
        String enter2 = sc.nextLine();
        long endTime = stopWatch.stop();
        System.out.println("Stop time: " +endTime);
        System.out.println("Elapsed time: " +stopWatch.getElapsedTime(startTime, endTime));

    }
}
