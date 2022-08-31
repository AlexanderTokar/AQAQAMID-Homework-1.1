package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnMissingAmountForMaxBonus() {
        CashbackHackService service = new CashbackHackService();
        int sum = 1800;

        int expected = 200;
        int actual = service.remain(sum);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldReturnMissingAmountForMaxBonusIfSumLess1000 () {
        CashbackHackService service = new CashbackHackService();

        int sum = 800;

        int expected = 200;
        int actual = service.remain(sum);

        assertEquals(actual, expected);
    }

    @Test
    public void shouldNotReturnMissingAmountForMaxBonus () {
        CashbackHackService service = new CashbackHackService();

        int sum = 1000;

        int expected = 0;
        int actual = service.remain(sum);

        assertEquals(actual, expected);
    }
}