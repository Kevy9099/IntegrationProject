import java.time.LocalDate;
//Kevin Mak COP2006 Introduction to Programming
// Two-Dimensional Calendar of November.
//This can be consider a Multi-Dimensional Array too.

public class LocalCalendar {

    /**
     * This method calender holds an multi-dimensional array for current date.
     * will be called by main.
     */
    public void calendar() {

        int firstday = 1;
        int[][] mycalendar = new int[6][7];
        System.out.println("November");
        String nameOfTheWeeks = "\n" + "Mon\t" + "Tue\t" + "Wed\t"
                + "Thu\t" + "Fri\t" + "Sat\t" + "Sun\t";
        System.out.println(nameOfTheWeeks);

        int lengthOfMonth = LocalDate.now().lengthOfMonth();
        int firstDayOfMonthsWeekDay = LocalDate.now().withDayOfMonth(1).getDayOfWeek().getValue();

        //labeled break statement to terminate the outer for loop when we reach the end of the month
        month:
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (--firstDayOfMonthsWeekDay > 0) {
                    // first day of month's weekday to start counting from Tuesday for example
                    continue;
                }

                mycalendar[i][j] = firstday++;
                if (firstday > lengthOfMonth) {
                    break month;                   // the execution will continue after the outer loop
                }
            }
        }

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print((mycalendar[i][j] == 0 ? " " : mycalendar[i][j]) + "\t");
                // replace 0's in the array with spaces
                if (j == 6) {
                    System.out.println();
                }
            }
        }


    }
}