package pl.cholewa.adventofcode.day01;

import org.springframework.stereotype.Component;

@Component
public class FuelCalculator {

    private int fuel;

    public FuelCalculator() {
        this.fuel = 0;
    }

    public static double calculateFuel(double mass) {
        return (Math.floor(mass / 3) - 2);
    }
}
