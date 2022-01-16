package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldInitFields() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getCurStation());
        Assertions.assertEquals(0, radio.getCurVolume());
        Assertions.assertEquals(10, radio.getNumStation());
        Assertions.assertEquals(0, radio.getStationMin());
        Assertions.assertEquals(100, radio.getVolumeMax());
        Assertions.assertEquals(0, radio.getVolumeMin());
    }

    @Test
    public void shouldChangeFields() {
        Radio radio = new Radio(5, 5, 8, 1, 50, 5);
        Assertions.assertEquals(5, radio.getCurStation());
        Assertions.assertEquals(5, radio.getCurVolume());
        Assertions.assertEquals(8, radio.getNumStation());
        Assertions.assertEquals(1, radio.getStationMin());
        Assertions.assertEquals(50, radio.getVolumeMax());
        Assertions.assertEquals(5, radio.getVolumeMin());
    }

    @Test
    public void shouldSetCurStationTop() {
        Radio radio = new Radio();
        radio.setStationMin(2);
        radio.setCurStation(10);
        radio.toSetCurStation();
        Assertions.assertEquals(2, radio.getCurStation());
    }

    @Test
    public void shouldSetCurStationBottom() {
        Radio radio = new Radio();
        radio.setCurStation(-1);
        radio.toSetCurStation();
        Assertions.assertEquals(9, radio.getCurStation());
    }

    @Test
    public void shouldSetNextStationTop() {
        Radio radio = new Radio(9, 10);
        radio.toSetCurStation();
        radio.setNextStation();
        Assertions.assertEquals(0, radio.getCurStation());
    }

    @Test
    public void shouldSetNextStationMiddle() {
        Radio radio = new Radio(5, 10);
        radio.toSetCurStation();
        radio.setNextStation();
        Assertions.assertEquals(6, radio.getCurStation());
    }

    @Test
    public void shouldSetNextCurStationBottom() {
        Radio radio = new Radio(-1, 10);
        radio.toSetCurStation();
        radio.setNextStation();
        Assertions.assertEquals(0, radio.getCurStation());
    }

    @Test
    public void shouldSetPrevStationMiddle() {
        Radio radio = new Radio(5, 10);
        radio.toSetCurStation();
        radio.setPrevStation();
        Assertions.assertEquals(4, radio.getCurStation());
    }

    @Test
    public void shouldSetPrevStationTop() {
        Radio radio = new Radio(10, 10);
        radio.toSetCurStation();
        radio.setPrevStation();
        Assertions.assertEquals(9, radio.getCurStation());
    }

    @Test
    public void shouldCheckNumStation() {
        Radio radio = new Radio(10, 5);
        radio.setNumStation(2);
        radio.toSetCurStation();
        radio.setNextStation();
        Assertions.assertEquals(1, radio.getCurStation());
    }

    @Test
    public void shouldCheckNumStationMin() {
        Radio radio = new Radio(-1, 3);
        radio.toSetCurStation();
        radio.setPrevStation();
        Assertions.assertEquals(1, radio.getCurStation());
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio(-50);
        radio.setCurVolume(-100);
        radio.setVolume();
        Assertions.assertEquals(0, radio.getCurVolume());
    }

    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio(99);
        radio.increaseVolume();
        radio.setVolumeMax(99);
        radio.setVolume();
        Assertions.assertEquals(99, radio.getCurVolume());
    }

    @Test
    public void shouldLowVolume() {
        Radio radio = new Radio(15);
        radio.lowVolume();
        radio.setVolumeMin(15);
        radio.setVolume();
        Assertions.assertEquals(15, radio.getCurVolume());
    }

}