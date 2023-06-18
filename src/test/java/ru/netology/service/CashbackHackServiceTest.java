package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void shouldNotTellHowMuchToBuy() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        Assert.assertEquals(cashbackHackService.remain(amount), 0);
    }

    @Test
    public void mustTellHowMuchToBuy() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 888;

        Assert.assertEquals(cashbackHackService.remain(amount), 112);
    }
}