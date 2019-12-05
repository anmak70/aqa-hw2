package ru.netology.hw2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturn100IfAmountIs900() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 900;
        int actual = cashbackHackService.remain(amount);
        int expectid = 100;
        assertEquals(expectid, actual);
    }

    @Test
    void shouldReturn1IfAmountIs999() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 999;
        int actual = cashbackHackService.remain(amount);
        int expectid = 1;
        assertEquals(expectid, actual);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1000;
        int actual = cashbackHackService.remain(amount);
        int expectid = 0;
        assertEquals(expectid, actual);
    }

    @Test
    void shouldReturn999IfAmountIs1001() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 1001;
        int actual = cashbackHackService.remain(amount);
        int expectid = 999;
        assertEquals(expectid, actual);
    }

    @Test
    void shouldReturn0IfAmountIs2000() {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 2000;
        int actual = cashbackHackService.remain(amount);
        int expectid = 0;
        assertEquals(expectid, actual);
    }
}