

/*
You are given the following information, but you may prefer to do some research for yourself.

1 Jan 1900 was a Monday.
Thirty days has September,
April, June and November.
All the rest have thirty-one,
Saving February alone,
Which has twenty-eight, rain or shine.
And on leap years, twenty-nine.
A leap year occurs on any year evenly divisible by 4, but not on a century unless it is divisible by 400.
How many Sundays fell on the first of the month during the twentieth century (1 Jan 1901(tuesday) to 31 Dec 2000)?
Ayın ilk günü pazar olacak. Kaç tane böyle durum vardır?
 */
public class Problem19 {
    public static void main(String[] args) {
        int count = 0;
        for (int y = 1901; y <= 2000; y++)
            for (int m = 1; m <= 12; m++)
                if (displayDayOfWeekUK(1, m, y).equals("Sunday"))
                    count++;
        System.out.println(count);
    }

    public static int getDayOfYear(int day, int month, int year) {
        if (!isValidDate(day, month, year))
            return -1;
        int countDay = 0;
        for (int i = 1; i < month; i++) {
            int m_day = 31;
            switch (i) {
                case 4:
                case 6:
                case 9:
                case 11:
                    m_day = 30;
                    break;
                case 2:
                    m_day = (isLeapYear(year)) ? 29 : 28;
                    break;
            }
            countDay += m_day;
        }
        return countDay + day;
    }

    public static String displayDayOfWeekUK(int day, int month, int year) {
        int countDay = getDayOfWeek(day, month, year);
        switch (countDay) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                System.out.println("Incorrect entry");
        }
        return "";
    }

    public static int getDayOfWeek(int day, int month, int year) {
        if (!isValidDate(day, month, year) || year < 1900)
            return -1;
        int countDay = 0;
        for (int i = 1901; i < year - 1; i++) {
            for (int j = 1; j <= 12; j++) {
                int m_day = 31;
                switch (j) {
                    case 4:
                    case 6:
                    case 9:
                    case 11:
                        m_day = 30;
                        break;
                    case 2:
                        m_day = (isLeapYear(year)) ? 29 : 28;
                        break;
                }
                countDay += m_day;
            }
        }
        countDay += getDayOfYear(day, month, year);
        return countDay % 7 + 1;
    }

    public static boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

    public static boolean isValidDate(int day, int month, int year) {
        if (day < 1 || day > 31 || month < 1 || month > 12)
            return false;
        int m_day = 31;
        switch (month) {
            case 4:
            case 6:
            case 9:
            case 11:
                m_day = 30;
                break;
            case 2:
                m_day = (isLeapYear(year)) ? 29 : 28;
                break;
        }
        return day <= m_day;
    }
}