package homework_11;

public enum DaysOfWeek {

    MONDAY(1),
    TUESDAY(2),
    WEDNESDAY(3),
    THURSDAY(4),
    FRIDAY(5),
    SATURDAY(6),
    SUNDAY(7);

    private final int dayNumber;

    DaysOfWeek(int dayNumber) {
            this.dayNumber = dayNumber;
    }

    public int getDayNumber() {
            return dayNumber;
    }


}
