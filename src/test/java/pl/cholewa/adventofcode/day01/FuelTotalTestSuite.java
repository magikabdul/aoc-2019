package pl.cholewa.adventofcode.day01;

import org.junit.Assert;
import org.junit.Test;

public class FuelTotalTestSuite {

    @Test
    public void shouldBeNoData() {
        //Given
        FuelTotal total = new FuelTotal();

        //When
        Assert.assertEquals(total.getSize(), 0);
    }

    @Test
    public void testArraysSizeForExampleData() {
        //Given
        FuelTotal total = new FuelTotal();

        //Then
        total.createExampleData();
        Assert.assertEquals(4, total.getSize());
    }

    @Test
    public void testRequiredFuelForExampleData() {
        //Given
        FuelTotal total = new FuelTotal();

        //Then
        total.createExampleData();
        Assert.assertEquals(total.getRequiredFuel(),34241);
    }

    @Test
    public void testArraysSizeForTaskData() {
        //Given
        FuelTotal total = new FuelTotal();

        //Then
        total.createTaskData();
        Assert.assertEquals(100, total.getSize());
    }

    @Test
    public void testRequiredFuelForTaskData() {
        //Given
        FuelTotal total = new FuelTotal();

        //Then
        total.createTaskData();
        Assert.assertEquals(total.getRequiredFuel(),3287899);
    }
}