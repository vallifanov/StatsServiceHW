package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
        //Сумма продаж
    void sumSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.sumSales(sales);
        assertEquals(expected, actual);
    }

    @Test
        //Средняя сумма продаж в месяц
    void averageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;
        long actual = service.averageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
        //Номер месяца, в котором был максимум продаж
    void maxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;
        long actual = service.maxSales(sales);
        assertEquals(expected, actual);
    }

    @Test
        //Номер месяца, в котором был минимум продаж
    void minSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;
        long actual = service.minSales(sales);
        assertEquals(expected, actual);
    }

    @Test
        //Номер месяца, в котором был минимум продаж
    void lowerAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.lowerAverageSales(sales);
        assertEquals(expected, actual);
    }

    @Test
        //Номер месяца, в котором был максимум продаж
    void higherAverageSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;
        long actual = service.higherAverageSales(sales);
        assertEquals(expected, actual);
    }
}