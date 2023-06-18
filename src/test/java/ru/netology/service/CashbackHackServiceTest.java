package ru.netology.service;

import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    @Test
    public void shouldNotTellHowMuchToBuy() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;

        Assert.assertEquals(0, cashbackHackService.remain(amount));
    }

    @Test
    public void mustTellHowMuchToBuy() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 888;

        Assert.assertEquals(112, cashbackHackService.remain(amount));
    }

}