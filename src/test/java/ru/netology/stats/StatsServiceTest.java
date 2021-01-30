package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {

    @Test
    void salesSumTest(){
        StatsService service = new StatsService();

        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.salesSum(monthlySales);

        assertEquals(expected, actual);
    }

    @Test
    void averageTest(){
        StatsService service = new StatsService();

        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.average(monthlySales);

        assertEquals(expected, actual);
    }

    @Test
    void monthOfMaxSalesTest(){
        StatsService service = new StatsService();

        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.monthOfMaxSales(monthlySales);

        assertEquals(expected, actual);
    }

    @Test
    void monthOfMinSalesTest(){
        StatsService service = new StatsService();

        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.monthOfMinSales(monthlySales);

        assertEquals(expected, actual);
    }

    @Test
    void monthsOfSalesUnderAverageTest(){
        StatsService service = new StatsService();

        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.monthsOfSalesUnderAverage(monthlySales);

        assertEquals(expected, actual);
    }

    @Test
    void monthsOfSalesOverAverageTest(){
        StatsService service = new StatsService();

        long[] monthlySales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.monthsOfSalesOverAverage(monthlySales);

        assertEquals(expected, actual);
    }
}