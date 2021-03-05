package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceJunit5Test {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldBoundaryAmountJunit5() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashBackUnderBoundaryJunit5() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    public void shouldCashBackOverBoundaryJunit5() {
        int amount = 1200;
        int expected = 800;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}
