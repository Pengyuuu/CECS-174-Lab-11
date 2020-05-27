import java.util.Scanner;

public class BrakeCheck {
    public static void main(String[] args) {

        // declare constants
        final double GRAVITY = 32.174;
        final double NEW_TIRES = 0.8;
        final double OLD_TIRES = 0.5;

        // get next input
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter initial speed in miles per hour: ");

        // get their input as a double and assign it to velocity
        double velocity = scan.nextDouble();

        // convert it to feet per seconds
        double v = (velocity * 5280) / 3600;

        // calculate distance with v, gravity, and new tires
        double distance = (v * v) / (2 * NEW_TIRES * GRAVITY);

        System.out.printf("At %1.0f miles per hour, with new tires, the car will stop in %.2f feet \n", velocity, distance);

        // calculate distance with v, gravity, and old tires
        distance = (v * v) / (2 * OLD_TIRES * GRAVITY);

        System.out.printf("With poor tires, the car will stop in %.2f feet", distance);

        scan.close();


    }
}
