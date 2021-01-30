package ru.netology.stats;

public class StatsService {

    public long salesSum(long[] monthlySales){
        long sum = 0;
        for(long monthlySale : monthlySales){
            sum += monthlySale;
        }
        return sum;
    }

    public long average(long[] monthlySales){
        long result = salesSum(monthlySales) / monthlySales.length;
        return result;
    }

    public long monthOfMaxSales(long[] monthlySales){
        int index = 0;
        long sales = monthlySales[index];
        int month = 0;
        for (long monthlySale : monthlySales){
            index++;
            if (sales <= monthlySale){
                sales = monthlySale;
                month = index;
            }
        }
        return month;
    }

    public long monthOfMinSales(long[] monthlySales){
        int index = 0;
        long sales = monthlySales[index];
        int month = 0;
        for (long monthlySale : monthlySales){
            index++;
            if (sales >= monthlySale){
                sales = monthlySale;
                month = index;
            }
        }
        return month;
    }

    public long monthsOfSalesUnderAverage(long[] monthlySales){
        int month = 0;
        for (long monthlySale : monthlySales){
            if (monthlySale < average(monthlySales)){
                month++;
            }
        }
        return month;
    }

    public long monthsOfSalesOverAverage(long[] monthlySales){
        int month = 0;
        for (long monthlySale : monthlySales){
            if (monthlySale > average(monthlySales)){
                month++;
            }
        }
        return month;
    }
}
