package ru.netology.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldInitFields() {
        Radio radio = new Radio();
        Assertions.assertEquals(0, radio.getCurStation());
        Assertions.assertEquals(0, radio.getCurVolume());
        Assertions.assertEquals(10, radio.getAmountStation());
        Assertions.assertEquals(0, radio.getStationMin());
        Assertions.assertEquals(100, radio.getVolumeMax());
        Assertions.assertEquals(0, radio.getVolumeMin());
    }

    @Test
    public void shouldCoverAllBranches() {
        Radio radio = new Radio();

        radio.setAmountStation(20);
        radio.setVolumeMin(2);
        radio.setVolumeMax(50);
        radio.setStationMin(2);
        Assertions.assertEquals(20, radio.getAmountStation());
        Assertions.assertEquals(2, radio.getVolumeMin());
        Assertions.assertEquals(50, radio.getVolumeMax());
        Assertions.assertEquals(2, radio.getStationMin());

    }


    @Test
    public void shouldSetCurStationTop() {
        Radio radio = new Radio();
        radio.setCurStation(-1);
        radio.toSetCurStation();
        Assertions.assertEquals(9, radio.getCurStation());
    }

    @Test
    public void shouldSetCurStationBottom() {
        Radio radio = new Radio();
        radio.setCurStation(10);
        radio.toSetCurStation();
        Assertions.assertEquals(0, radio.getCurStation());
    }

    @Test
    public void shouldSetNextStationTop() {
        Radio radio = new Radio();
        radio.setCurStation(9);
        radio.setNextStation();
        Assertions.assertEquals(0, radio.getCurStation());
    }

    @Test
    public void shouldSetNextStationMiddle() {
        Radio radio = new Radio();
        radio.setCurStation(5);
        radio.setNextStation();
        Assertions.assertEquals(6, radio.getCurStation());
    }

    @Test
    public void shouldSetNextCurStationBottom() {
        Radio radio = new Radio();
        radio.setCurStation(-1);
        radio.toSetCurStation();
        radio.setNextStation();
        Assertions.assertEquals(0, radio.getCurStation());
    }

    @Test
    public void shouldSetPrevStationMiddle() {
        Radio radio = new Radio();
        radio.setCurStation(5);
        radio.setPrevStation();
        Assertions.assertEquals(4, radio.getCurStation());
    }

    @Test
    public void shouldSetPrevStationTop() {
        Radio radio = new Radio();
        radio.setCurStation(-1);
        radio.toSetCurStation();
        radio.setPrevStation();
        Assertions.assertEquals(8, radio.getCurStation());
    }

    @Test
    public void shouldCheckAmountStation() {
        Radio radio = new Radio(15);
        Assertions.assertEquals(15, radio.getAmountStation());
    }

    @Test
    public void shouldCheckAmountStationMin() {
        Radio radio = new Radio(8);
        radio.setCurStation(7);
        radio.setNextStation();
        Assertions.assertEquals(0, radio.getCurStation());
    }

    @Test
    public void shouldSetVolumeMin() {
        Radio radio = new Radio();
        radio.setCurVolume(-100);
        radio.setVolume();
        Assertions.assertEquals(0, radio.getCurVolume());
    }

    @Test
    public void shouldSetVolumeMax() {
        Radio radio = new Radio();
        radio.setCurVolume(200);
        radio.setVolume();
        Assertions.assertEquals(100, radio.getCurVolume());
    }


    @Test
    public void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurVolume(99);
        radio.increaseVolume();
        radio.increaseVolume();
        Assertions.assertEquals(100, radio.getCurVolume());
    }

    @Test
    public void shouldLowVolume() {
        Radio radio = new Radio();
        radio.setCurVolume(1);
        radio.lowVolume();
        radio.lowVolume();
        Assertions.assertEquals(0, radio.getCurVolume());
    }

}