import java.util.regex.*;
import java.util.Scanner;
public class Main {
    public static void main(String args[]) {
        String pattern1 = "[a-z]+";
        String pattern2 = "[A-Z]+";
        String pattern3 = "[0-9]+";
        String pattern4 = "\\W";

        Scanner in = new Scanner(System.in);
        System.out.println("Введите пароль");
        String pas = in.nextLine();

        Pattern p1 = Pattern.compile(pattern1);
        Pattern p2 = Pattern.compile(pattern2);
        Pattern p3 = Pattern.compile(pattern3);
        Pattern p4 = Pattern.compile(pattern4);

        Matcher A = p1.matcher(pas);
        Matcher a = p2.matcher(pas);
        Matcher n = p3.matcher(pas);
        Matcher l = p4.matcher(pas);
        if (pas.length() > 7) {
            if (l.find()) {
                System.out.print("Некорректные символы в пароле");
            } else {
                if (A.find() && a.find() && n.find()) {
                    System.out.print("Пароль защищен");
                } else {
                    System.out.print("Пароль не защищен");
                }
            }

        } else {
            System.out.print("Пароль не защищен");
        }
        in.close();
    }
}
