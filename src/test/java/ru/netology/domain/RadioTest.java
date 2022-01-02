package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetCurStation() {
        Radio radio = new Radio();
        radio.setCurStation(11);
        int actual = radio.getCurStation();
        Assertions.assertEquals(0, actual);
    }


    @Test
    public void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurStation(9);
        int expected = 9;
        int actual = radio.setToMaxNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurStation(0);
        int expected = 0;
        int actual = radio.setToMinNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume(){
        Radio radio=new Radio();
        radio.setCurVolume(11);
        int expected=10;
        int actual = radio.getCurVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolume(){
        Radio radio=new Radio();
        radio.setCurVolume(10);
        int expected=10;
        int actual=radio.increaseVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldReduceVolume(){
        Radio radio=new Radio();
        radio.setCurVolume(0);
        int expected=0;
        int actual=radio.reduceVolume();
        Assertions.assertEquals(expected, actual);
    }
}