import java.util.*;
public class AngleOfClock {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a hour");
        int h = sc.nextInt();
        System.out.println("enter a minute");
        int m = sc.nextInt();

        double minuteHand = 6*m;
        double hourHand = 30*h + 0.5*m;

        double angle = hourHand -  minuteHand ;
        angle = Math.min(angle,360-angle);
        System.out.println("Angle = "+ angle);
    }
}
