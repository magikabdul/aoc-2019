package pl.cholewa.adventofcode.day01;

import org.springframework.stereotype.Component;

@Component
public class FuelCalculator {

    public static double calculateFuel(double mass) {
        double fuel = (Math.floor(mass / 3) - 2);

        if (fuel > 2) {
            calculateFuel(fuel);
            return fuel;
        } else {
            return fuel;
        }
    }
}
