package ru.netology.JavaHW5.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/DataForCalculatingRest")
    public void testRest(int income, int expenses, int threshold) {
        RestService service = new RestService();
        int actual = service.calculate(income, expenses, threshold);
        int expected = 2;


        Assertions.assertEquals(expected, actual);
    }
}

