import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class StatisticsSTest {
    @Test
    public void shouldSum() {
        StatisticsS service = new StatisticsS();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.sum(sales);
        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldFindMaxMonth() {
        StatisticsS service = new StatisticsS();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.maxSalesMonth(sales);
        long expected = 7;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldFindMinMonth() {
        StatisticsS service = new StatisticsS();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.minSalesMonth(sales);
        long expected = 8;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldFindbelowAverage() {
        StatisticsS service = new StatisticsS();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.belowAverage(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldFindaboveAverage() {
        StatisticsS service = new StatisticsS();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.aboveAverage(sales);
        long expected = 5;
        assertEquals(expected, actual);
    }
    @Test
    public void shouldFindAverage() {
        StatisticsS service = new StatisticsS();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long actual = service.average(sales);
        long expected = 15;
        assertEquals(expected, actual);
    }
}