package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.junit.Test
    public void shouldBoundaryAmount() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCashBackUnderBoundary() {
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void shouldCashBackOverBoundary() {
        int actual = service.remain(1200);
        int expected = 800;

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldBoundaryAmountJunit5() {
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldCashBackUnderBoundaryJunit5() {
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    public void shouldCashBackOverBoundaryJunit5() {
        int amount = 1200;
        int expected = 800;
        int actual = service.remain(amount);
        assertEquals(expected, actual);
    }
}
