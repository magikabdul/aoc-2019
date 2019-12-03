package pl.cholewa.adventofcode.day01;

import org.junit.Assert;
import org.junit.Test;

public class FuelCalculatorTestSuite {

    @Test
    public void testOne() {
        //Given
        FuelCalculator fuelCalculator = new FuelCalculator();

        //When
        Assert.assertEquals(1, fuelCalculator.calculateFuel(10), 0);
        Assert.assertEquals(2, fuelCalculator.calculateFuel(12), 0);
        Assert.assertEquals(2, fuelCalculator.calculateFuel(14), 0);
        Assert.assertEquals(654, fuelCalculator.calculateFuel(1969), 0);
        Assert.assertEquals(33583, fuelCalculator.calculateFuel(100756), 0);
    }
}
