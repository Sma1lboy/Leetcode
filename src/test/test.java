package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/17
 */
public class test {

    public static void main(String[] args) {
        //Scanner
        Scanner input = new Scanner(System.in);

        // //Ask for input
        System.out.print("Enter an initial speed: ");
        //double speed = 15.0;
        double speed = input.nextDouble();

        //Print outcome
        //Angle and radians
        double angle = 25.00;
        double cosangle = Math.cos(Math.toRadians(angle));
        double sinangle = Math.sin(Math.toRadians(angle));

        //(Delete then) The sin and cos just for checking
        //System.out.format("sin(angle) = %.2f%n", sinangle);
        //System.out.format("cos(angle) = %.2f%n", cosangle);

        //Calculate distance
        double distance = 0;
        distance = speed * (2 * speed * sinangle) / 9.8 * cosangle;

        //print
        System.out.format("At angle " + angle + " projectile travels %.2f meters %n", distance);

        //loop
        while (angle < 85) {
            angle = angle + 5;

            //angle and radians
            cosangle = Math.cos(Math.toRadians(angle));
            sinangle = Math.sin(Math.toRadians(angle));

            //Calculate distance
            distance = speed * (2 * speed * sinangle) / 9.8 * cosangle;

            //print
            System.out.format("At angle " + angle + " projectile travels %.2f meters %n", distance);
        }

    }
}
