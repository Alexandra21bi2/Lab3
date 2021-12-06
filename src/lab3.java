import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class lab3 {

    public static boolean DataCheck(String s) {
        return s.matches("(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[1-9])/([1-9]\\d\\d\\d)");
    }
    public static void main(String[] args) {
        System.out.println("Введите дату:");
        String date;
        Scanner sc = new Scanner(System.in);
        date = sc.next();
        if (DataCheck(date)) {
            System.out.println("Correct date");
        } else {
            System.out.println("Wrong date");
        }
    }
}


