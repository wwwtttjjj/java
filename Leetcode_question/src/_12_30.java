import java.time.LocalDate;

public class _12_30 {
    public static void main(String[] args) {

    }
}
class Solution1230 {
    private String[] week = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

    public String dayOfTheWeek(int day, int month, int year) {
        // API逃课大法
        LocalDate date = LocalDate.of(year, month, day);
        return week[date.getDayOfWeek().getValue() % 7];
    }
}
