package ru.netology.hw2;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = "/AmountData.csv", numLinesToSkip = 1)
    void shouldReturnAmountPriorToPurchaseForCashback(int amount, int expected, String message) {
        CashbackHackService cashbackHackService = new CashbackHackService();
        int actual = cashbackHackService.remain(amount);
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturnExceptionIfAmountIs0() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = 0;
        assertThrows(IllegalArgumentException.class, () -> cashbackHackService.remain(amount));
    }

    @Test
    void shouldReturnExceptionIfAmountIsNegative() {

        CashbackHackService cashbackHackService = new CashbackHackService();
        int amount = -1;
        assertThrows(IllegalArgumentException.class, () -> cashbackHackService.remain(amount));
    }

}