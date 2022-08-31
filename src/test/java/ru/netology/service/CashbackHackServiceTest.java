package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {

    @Test
    public void shouldReturnMissingAmountForMaxBonusJUnit4() {
        CashbackHackService service = new CashbackHackService();

        int sum = 1800;

        int expected = 200;
        int actual = service.remain(sum);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMissingAmountForMaxBonusIfSumLess1000JUnit4() {
        CashbackHackService service = new CashbackHackService();

        int sum = 800;

        int expected = 200;
        int actual = service.remain(sum);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReturnMissingAmountForMaxBonusJUnit4() {
        CashbackHackService service = new CashbackHackService();

        int sum = 1000;

        int expected = 0;
        int actual = service.remain(sum);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMissingAmountForMaxBonusJUnitJupiter() {
        CashbackHackService service = new CashbackHackService();

        int sum = 1800;

        int expected = 200;
        int actual = service.remain(sum);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldReturnMissingAmountForMaxBonusIfSumLess1000JUnitJupiter() {
        CashbackHackService service = new CashbackHackService();

        int sum = 800;

        int expected = 200;
        int actual = service.remain(sum);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotReturnMissingAmountForMaxBonusJUnitJupiter() {
        CashbackHackService service = new CashbackHackService();

        int sum = 1000;

        int expected = 0;
        int actual = service.remain(sum);

        assertEquals(expected, actual);
    }
}