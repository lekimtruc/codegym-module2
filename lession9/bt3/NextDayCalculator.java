package lession9.bt3;

public class NextDayCalculator {
    public static int calculateNextDay(int day, int month, int year) {
        int lastDayOfMonth = 0;
        int nextDay;
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                lastDayOfMonth = 31;
                break;

            case 4, 6, 9, 11:
                lastDayOfMonth = 30;
                break;

            case 2:
                if (isLeapYear) {
                    lastDayOfMonth = 29;
                } else {
                    lastDayOfMonth = 28;
                }
                break;

            default:
                System.out.println("Invalid month!");
                break;
        }

        boolean isLastDayOfMonth = (day == lastDayOfMonth);
        if(isLastDayOfMonth){
            return nextDay = 1;
        }else{
            return nextDay = day + 1;
        }
    }
}
