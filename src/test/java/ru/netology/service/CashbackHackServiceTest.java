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
}