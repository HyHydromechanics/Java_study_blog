public class work1 {
    public static void main(String[] args) {
        int dayleft = 59;
        int weekNumber = dayleft/7;
        int restDay = dayleft%7;
        System.out.print("weeksleft" + weekNumber);
        System.out.print("daysleft" + restDay);
    }
}