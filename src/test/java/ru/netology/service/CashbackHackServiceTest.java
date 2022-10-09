package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldShowNecessarySum() {
        int expected = 200;
        int actual = service.remain(800);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowNullIfAccurateOneThousand() {
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowAllSum() {
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowNecessarySumIfOneRuble() {
        int expected = 999;
        int actual = service.remain(1);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowNecSumIfMoreThanThousand() {
        int expected = 1;
        int actual = service.remain(1999);
        assertEquals(actual, expected);
    }
}