package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {


    @Test
    public void shouldSetCurStationMin() {
        Radio radio = new Radio();
        radio.setCurStation(11);
        int actual = radio.getCurStation();
        Assertions.assertEquals(0, actual);
    }

    @Test
    public void shouldSetCurStationMax() {
        Radio radio = new Radio();
        radio.setCurStation(-1);
        int actual = radio.getCurStation();
        Assertions.assertEquals(9, actual);
    }

    @Test
    public void shouldSetNextStationMax() {
        Radio radio = new Radio();
        radio.setCurStation(-2);
        radio.setNextStation();
        int expected = 0;
        int actual = radio.getCurStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNextStationMin() {
        Radio radio = new Radio();
        radio.setCurStation(10);
        radio.setNextStation();
        int expected = 1;
        int actual = radio.getCurStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationMin() {
        Radio radio = new Radio();
        radio.setCurStation(10);
        radio.setPrevStation();
        int expected = 9;
        int actual = radio.getCurStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetPrevStationMax() {
        Radio radio = new Radio();
        radio.setCurStation(-1);
        radio.setPrevStation();
        int expected = 8;
        int actual = radio.getCurStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurVolumeMax() {
        Radio radio = new Radio();
        radio.setCurVolume(11);
        int expected = 10;
        int actual = radio.getCurVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetCurVolumeMin() {
        Radio radio = new Radio();
        radio.setCurVolume(-1);
        int expected = 0;
        int actual = radio.getCurVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMax() {
        Radio radio = new Radio();
        radio.setCurVolume(11);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeMin() {
        Radio radio = new Radio();
        radio.setCurVolume(-1);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeMax() {
        Radio radio = new Radio();
        radio.setCurVolume(11);
        radio.reduceVolume();
        int expected = 9;
        int actual = radio.getCurVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeMin() {
        Radio radio = new Radio();
        radio.setCurVolume(-1);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurVolume();
        Assertions.assertEquals(expected, actual);
    }
}