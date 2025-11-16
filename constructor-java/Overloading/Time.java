import java.util.Scanner;

public class Time {
    private int hours;
    private int minutes;
    private int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
        normalizeTime();
    }

    public void setTimeFromString(String time) {
        String[] timeParts = time.split(":");
        this.hours = Integer.parseInt(timeParts[0].trim());
        this.minutes = Integer.parseInt(timeParts[1].trim());
        this.seconds = Integer.parseInt(timeParts[2].trim());
        normalizeTime();
    }

    public void setTimeFromSeconds(long totalSeconds) {
        this.hours = (int)(totalSeconds / 3600);
        this.minutes = (int)((totalSeconds % 3600) / 60);
        this.seconds = (int)(totalSeconds % 60);
        normalizeTime();
    }

    private void normalizeTime() {
        if (seconds >= 60) {
            minutes += seconds / 60;
            seconds = seconds % 60;
        }
        if (minutes >= 60) {
            hours += minutes / 60;
            minutes = minutes % 60;
        }
        if (hours >= 24) {
            hours = hours % 24;
        }
    }

    void displayTime() {
        System.out.println( hours + ":" + minutes + ":" + seconds);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter time in hours, minutes, and seconds (e.g., 10 30 45):");
        int hours = scan.nextInt();
        int minutes = scan.nextInt();
        int seconds = scan.nextInt();
        scan.nextLine(); // Consume leftover newline

        Time T1 = new Time(hours, minutes, seconds);
        T1.displayTime();

        System.out.println("Enter the time in string format (e.g., 10:30:45):");
        String time = scan.nextLine();
        T1.setTimeFromString(time);
        T1.displayTime();

        System.out.println("Enter total seconds:");
        long totalSeconds = scan.nextLong();
        T1.setTimeFromSeconds(totalSeconds);
        T1.displayTime();
    }
}