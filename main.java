
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        int otpst = (int) (Math.random() * 10000);
        System.out.println(otpst);
        Scanner user = new Scanner(System.in);
        System.out.println("enter the otp");
        String userin = user.next();
        int useri = Integer.parseInt(userin);
        if (otpst == useri) {
            System.out.println("verified");
        } else {
            System.out.println("otp incorrect");
        }
    }
}
