package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CashbackHackServiceTest {
    @Test
    public void shouldAmountLessBoundary() {
        CashbackHackService service = new CashbackHackService();
        int boundary = service.remain(900);
        Assert.assertEquals(100,boundary);
    }

    @Test
    public void shouldAmountEqualBoundary() {
        CashbackHackService service = new CashbackHackService();
        int boundary = service.remain(1000);
        Assert.assertEquals(0,boundary);
    }

    @Test
    public void shouldAmountMoreBoundary() {
        CashbackHackService service = new CashbackHackService();
        int boundary = service.remain(1215);
        Assert.assertEquals(785, boundary);
    }
}