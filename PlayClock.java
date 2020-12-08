/**
 * @author Kevin Mak COP2006 Introduction to Programming
 * Shows the current time in three different format.
 */

public class PlayClock {
    private int hour;
    private int minute;
    private int second;

    public PlayClock() {
        this(0, 0, 0);
    }

    /**
     * this method will check for the first parameter hour.
     *
     * @param h for Hour.
     */
    public PlayClock(int h) {
        this(h, 0, 0);
    }

    public PlayClock(int h, int m) {
        this(h, m, 0);
    }

    public PlayClock(int h, int m, int s) {
        setTime(h, m, s);
    }

    /**
     * This method checks for 3 parameters.
     *
     * @param h for hours.
     * @param m for minutes.
     * @param s for seconds.
     */
    public void setTime(int h, int m, int s) {
        setHour(h);
        setMinute(m);
        setSecond(s);
    }
    /**
     * This method will check for condition to hour.
     *
     * @param h for hour.
     */
    public void setHour(int h) {
        hour = ((h >= 0 && h < 24) ? h : 0);
    }

    public void setMinute(int m) {
        minute = ((m >= 0 && m < 60) ? m : 0);
    }

    public void setSecond(int s) {
        second = ((s >= 0 && s < 60) ? s : 0);
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public String toMilitary() {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());

    }

}