package ru.netology.stats;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test

    public void minMonthTest() {

        StatsService service = new StatsService();

        int[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMonth = 9;
        int actualMonth = service.minSales(month);

        Assertions.assertEquals(expectedMonth, actualMonth);
    }

    @Test

    public void SumTest() {

        StatsService service = new StatsService();

        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180;
        long actual = service.sum(month);

        Assertions.assertEquals(expected, actual);

    }

    @Test

    public void averageTest() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 180 / 12;
        long actual = service.average(month);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void MaxSalesTest() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 8;
        long actual = service.maxSales(month);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testBellowAverage() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.monthsBellowAverage(month);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testBellowAverage2() {
        StatsService service = new StatsService();
        long[] month = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expected = 5;
        long actual = service.monthsBellowAverage2(month);

        Assertions.assertEquals(expected, actual);


    }
}
