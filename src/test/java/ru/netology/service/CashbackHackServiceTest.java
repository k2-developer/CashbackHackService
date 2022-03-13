package ru.netology.service;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CashbackHackServiceTest {
    private final CashbackHackService cashHackService = new CashbackHackService();

    @Test
    public void shouldShowRemainder() {
        int actual = cashHackService.remain(850);
        int expected = 150;

        assertEquals(actual,expected);
    }

    // FIXME: shouldCheckIfZeroRemain - must fail
    @Test
    public void shouldCheckIfZeroRemain(){
        int actual = cashHackService.remain(1000);
        int expected = 0;

        assertEquals(actual,expected);
    }
}