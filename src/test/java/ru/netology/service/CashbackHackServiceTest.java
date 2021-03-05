package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @org.testng.annotations.Test
    public void shouldBoundaryAmount() {
        int actual = service.remain(1000);
        int expected = 0;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCashBackUnderBoundary() {
        int actual = service.remain(900);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void shouldCashBackOverBoundary() {
        int actual = service.remain(1200);
        int expected = 800;

        assertEquals(actual, expected);
    }
}