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
    public void shouldSetCurStationMax(){
        Radio radio=new Radio();
        radio.setCurStation(-1);
        int actual =radio.getCurStation();
        Assertions.assertEquals(9, actual);
    }

    @Test
    public void shouldNextStationMax() {
        Radio radio = new Radio();
        radio.setCurStation(-1);
        int expected = 9;
        int actual = radio.setToMaxNumberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldNextStationMin() {
        Radio radio = new Radio();
        radio.setCurStation(10);
        int expected = 1;
        int actual = radio.setToMaxNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPrevStationMin() {
        Radio radio = new Radio();
        radio.setCurStation(10);
        int expected = 0;
        int actual = radio.setToMinNumberStation();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldPrevStationMax() {
        Radio radio = new Radio();
        radio.setCurStation(-1);
        int expected = 8;
        int actual = radio.setToMinNumberStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMax(){
        Radio radio=new Radio();
        radio.setCurVolume(11);
        int expected=10;
        int actual = radio.getCurVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolumeMin(){
        Radio radio=new Radio();
        radio.setCurVolume(-1);
        int expected=0;
        int actual = radio.getCurVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeMax(){
        Radio radio=new Radio();
        radio.setCurVolume(11);
        int expected=10;
        int actual=radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeMin(){
        Radio radio=new Radio();
        radio.setCurVolume(-1);
        int expected=1;
        int actual=radio.increaseVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldReduceVolumeMax(){
        Radio radio=new Radio();
        radio.setCurVolume(11);
        int expected=9;
        int actual=radio.reduceVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldReduceVolumeMin(){
        Radio radio=new Radio();
        radio.setCurVolume(-1);
        int expected=0;
        int actual=radio.reduceVolume();
        Assertions.assertEquals(expected, actual);
    }
}