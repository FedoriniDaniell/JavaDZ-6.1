package ru.netology.stats;

public class StatsService {

    public int minSales(int[] sales) {
        int minMonth = 0; // номер месяца с минимальными продажами среди просмотренных ранее

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }

        return minMonth + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int getMinMonthSale(int[] sales) {
        int minSales = sales[0];
        for (int s : sales) {
            if (s < minSales) {
                minSales = s;
            }
        }
        return minSales;
    }

    public long sum(long[] sales) {
        long sumSale = 0;
        for (long sale : sales) {
            sumSale += sale;
        }
        return sumSale;
    }

    public long average(long[] sales) {
        long totalSale = sum(sales);

        long averageSale = totalSale / 12;
        return averageSale;
    }

    public int maxSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int monthsBellowAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales){
            if (sale < average(sales)){
                counter++;
            }
        }
        return counter;
    }

    public int monthsBellowAverage2(long[] sales) {
        int counter = 0;
        for (long sale : sales){
            if (sale > average(sales)){
                counter++;
            }
        }
        return counter;
    }

}





