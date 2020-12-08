import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;

/**
 * @author Kevin Mak COP2006 Introduction to Programming
 * A class that gets the current calender days, weeks and month.
 * Utilize the use of  Multi-Dimensional arrays.
 */

public class LocalCalendar {

    /**
     * Creates the days, weeks and month of a calendar by using  Multi-Dimensional array.
     */
    public void calendar() {

        int firstDay = 1;
        int[][] myCalendar = new int[6][7];
        Calendar cal = Calendar.getInstance();
        String nameOfTheWeeks = "\n" + "Mon\t" + "Tue\t" + "Wed\t"
                + "Thu\t" + "Fri\t" + "Sat\t" + "Sun\t";
        System.out.println(new SimpleDateFormat("MMMMMMMM").format(cal.getTime()) + nameOfTheWeeks);

        int lengthOfMonth = LocalDate.now().lengthOfMonth();
        int firstDayOfMonthsWeekDay = LocalDate.now().withDayOfMonth(1).getDayOfWeek().getValue();

        month:
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (--firstDayOfMonthsWeekDay > 0) {
                    continue;
                }

                myCalendar[i][j] = firstDay++;
                if (firstDay > lengthOfMonth) {
                    break month;
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print((myCalendar[i][j] == 0 ? " " : myCalendar[i][j]) + "\t");
                if (j == 6) {
                    System.out.println();
                }
            }
        }

    }
}