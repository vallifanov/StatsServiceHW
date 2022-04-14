package ru.netology.stats;

public class StatsService {
    public int sumSales(long[] sales) { //сумма всех продаж
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum;

    }

    public int averageSales(long[] sales) { //Средняя сумма продаж в месяц
        int sum = 0;
        for (long sale : sales) {
            sum += sale;
        }
        return sum / sales.length;
    }


    public int maxSales(long[] sales) { //Номер месяца, в котором был максимум продаж
        int maxMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) { //Номер месяца, в котором был минимум продаж
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lowerAverageSales(long[] sales) { //Кол-во месяцев, в которых продажи были ниже среднего
        int sum = 0;
        int months = 0;
        for (long sale : sales) {
            sum += sale;
        }
        int average = sum / sales.length;
        for (long sale : sales) {
            if (sale < average) {
                months = months + 1;
            }
        }
        return months;
    }

    public int higherAverageSales(long[] sales) { //Кол-во месяцев, в которых продажи были ниже среднего
        int sum = 0;
        int months = 0;
        for (long sale : sales) {
            sum += sale;
        }
        int average = sum / sales.length;
        for (long sale : sales) {
            if (sale > average) {
                months = months + 1;
            }
        }
        return months;
    }
}



