package by.rdcentre.javatr.lesson5;

import java.util.GregorianCalendar;

/**
 * Created by Denis on 03.03.2017.
 */
public class Calendar {
    public static void main(String[] args) {

        GregorianCalendar d = new GregorianCalendar();
        int currentYear = d.get(java.util.Calendar.YEAR);

        int today = d.get(java.util.Calendar.DAY_OF_MONTH);
        int month = d.get(java.util.Calendar.MONTH);
        d.set(java.util.Calendar.DAY_OF_MONTH, 1);
        int weekday = d.get(java.util.Calendar.DAY_OF_WEEK);


        for (int i = 0; i < 3; i++) {
            GregorianCalendar d1 = new GregorianCalendar(currentYear, i*4 + 0, 1);
            GregorianCalendar d2 = new GregorianCalendar(currentYear, i*4 + 1, 1);
            GregorianCalendar d3 = new GregorianCalendar(currentYear, i*4 + 2, 1);
            GregorianCalendar d4 = new GregorianCalendar(currentYear, i*4 + 3, 1);

            printMonthDayTitles(i);
            do {
                if (d1.get(java.util.Calendar.MONTH) == (i*4 + 0)) {
                    d1 = printWeek(d1, today, month);
                } else {
                    System.out.print("                    ");
                }
                System.out.print("     ");
                if (d2.get(java.util.Calendar.MONTH) == (i*4 + 1)) {
                    d2 = printWeek(d2, today, month);
                } else {
                    System.out.print("                    ");
                }
                System.out.print("     ");
                if (d3.get(java.util.Calendar.MONTH) == (i*4 + 2)) {
                    d3 = printWeek(d3, today, month);
                } else {
                    System.out.print("                    ");
                }
                System.out.print("     ");
                if (d4.get(java.util.Calendar.MONTH) == (i*4 + 3)) {
                    d4 = printWeek(d4, today, month);
                } else {
                    System.out.print("                    ");
                }
                System.out.println();

            } while (d1.get(java.util.Calendar.MONTH) == (i*4 + 0) ||
                    d2.get(java.util.Calendar.MONTH) == (i*4 + 1) ||
                    d3.get(java.util.Calendar.MONTH) == (i*4 + 2) ||
                    d4.get(java.util.Calendar.MONTH) == (i*4 + 3));
        }
    }


    public static GregorianCalendar printWeek(GregorianCalendar d, int today, int todayMonth){
        int day = d.get(java.util.Calendar.DAY_OF_MONTH);
        int weekday = d.get(java.util.Calendar.DAY_OF_WEEK);
        int month = d.get(java.util.Calendar.MONTH);

        int j = 1;

        if (day == 1) {
            for(int i = java.util.Calendar.SUNDAY; i<weekday; i++) {
                System.out.print("   ");
                j = j + 1;
            }
        }

        for(int i = j; i < 8; i++ ) {
            //do{

            day = d.get(java.util.Calendar.DAY_OF_MONTH);

            if (day < 10) System.out.print(" ");

            if (weekday == java.util.Calendar.SATURDAY || weekday == java.util.Calendar.SUNDAY) {
                if (day == today && month == todayMonth) System.out.print(colorText(Integer.toString(day), "MAGENTA"));
                else
                    System.out.print(colorText(Integer.toString(day), "RED"));
            } else {
                if (day == today && month == todayMonth) System.out.print(colorText(Integer.toString(day), "BLUE"));
                else System.out.print(day);
            }
            if (weekday != java.util.Calendar.SATURDAY && day != d.getActualMaximum(d.DAY_OF_MONTH)) {
                System.out.print(" ");
            }

            d.add(java.util.Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(java.util.Calendar.DAY_OF_WEEK);
            if (d.get(java.util.Calendar.MONTH) != month) break;
        }
         if (d.get(java.util.Calendar.MONTH) != month && weekday != java.util.Calendar.SUNDAY) {
            for(int i = weekday; i<java.util.Calendar.SATURDAY+1; i++) {
                System.out.print("   ");

            }
        }
        return d;

    }
    private static String colorText(String text, String color) {
        int x = color.equals("RED") ? 31 :
                color.equals("GREEN") ? 32 :
                        color.equals("YELLOW") ? 33 :
                                color.equals("BLUE") ? 34 :
                                        color.equals("MAGENTA") ? 35 :
                                                color.equals("CYAN") ? 36 :
                                                        color.equals("WHITE") ? 37 :
                                                                color.equals("BLACK") ? 30 :
                                                                        color.equals("BRIGHT") ? 1 : 0;
        return (char) 27 + "[" + x + "m" + text + (char) 27 + "[0m";
    }
    public static void printMonthDayTitles(int tri){
        if (tri == 0) {
            System.out.print("ßÍÂÀÐÜ                   " );
            System.out.print("ÔÅÂÐÀËÜ                  " );
            System.out.print("ÌÀÐÒ                     " );
            System.out.println("ÀÏÐÅËÜ                   " );
        }
        else if (tri == 1) {
            System.out.print("ÌÀÉ                      " );
            System.out.print("ÈÞÍÜ                     " );
            System.out.print("ÈÞËÜ                     " );
            System.out.println("ÀÂÃÓÑÒ                   " );
        }
        else if (tri == 2) {
            System.out.print("ÑÅÍÒßÁÐÜ                 " );
            System.out.print("ÎÊÒßÁÐÜ                  " );
            System.out.print("ÍÎßÁÐÜ                   " );
            System.out.println("ÄÅÊÀÁÐÜ                  " );
        }
        for (int i=0; i<4; i++) {
            System.out.print(colorText("Âñ", "RED"));
            System.out.print(" Ïí Âò Ñð ×ò Ïò ");
            if (i==3)
                System.out.println(colorText("Ñá", "RED"));
            else
                System.out.print(colorText("Ñá     ", "RED"));
        }
    }


}
