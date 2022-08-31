package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnMissingAmountForMaxBonus() {
        CashbackHackService service = new CashbackHackService();

        int sum = 1800;

        int expected = 200;
        int actual = service.remain(sum);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMissingAmountForMaxBonusIfSumLess1000() {
        CashbackHackService service = new CashbackHackService();

        int sum = 800;

        int expected = 200;
        int actual = service.remain(sum);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReturnMissingAmountForMaxBonus() {
        CashbackHackService service = new CashbackHackService();

        int sum = 1000;

        int expected = 0;
        int actual = service.remain(sum);

        assertEquals(expected, actual);
    }
}