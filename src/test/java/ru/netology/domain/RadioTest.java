package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCurStation() {
        Radio radio = new Radio();
        radio.setCurStation(1);
        int actual = radio.getCurStation();
        Assertions.assertEquals(1, actual);

    }

    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurStation(9);
        int expected = 0;
        int actual = radio.setToMinNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurStation(0);
        int expected = 9;
        int actual = radio.setToMaxNumberStation();
        Assertions.assertEquals(expected, actual);
    }
}