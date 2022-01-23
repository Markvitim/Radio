package ru.netology.domain;


public class Radio {
    private int curStation;
    private int curVolume;
    private int amountStation = 10;
    private int stationMin;
    private int volumeMax = 100;
    private int volumeMin;

    public Radio() {
    }

    public Radio(int amountStation) {
        this.amountStation = amountStation;
    }

    public int getCurStation() {
        return curStation;
    }

    public void setCurStation(int curStation) {
        this.curStation = curStation;
    }

    public int getCurVolume() {
        return curVolume;
    }

    public void setCurVolume(int curVolume) {
        this.curVolume = curVolume;
    }

    public int getAmountStation() {
        return amountStation;
    }

    public void setAmountStation(int amountStation) {
        this.amountStation = amountStation;
    }

    public int getStationMin() {
        return stationMin;
    }

    public void setStationMin(int stationMin) {
        this.stationMin = stationMin;
    }

    public int getVolumeMax() {
        return volumeMax;
    }

    public void setVolumeMax(int volumeMax) {
        this.volumeMax = volumeMax;
    }

    public int getVolumeMin() {
        return volumeMin;
    }

    public void setVolumeMin(int volumeMin) {
        this.volumeMin = volumeMin;
    }

    public int toSetCurStation() {
        if (curStation > amountStation - 1) {
            curStation = stationMin;
        }
        if (curStation < stationMin) {
            curStation = amountStation - 1;
        }
        return curStation;
    }

    public int setNextStation() {
        curStation++;
        if (curStation > amountStation - 1) {
            curStation = stationMin;
        }
        return curStation;
    }

    public int setPrevStation() {
        curStation--;
        if (curStation < stationMin) {
            curStation = amountStation - 1;
        }
        return curStation;
    }

    public int setVolume() {
        if (curVolume > volumeMax) {
            curVolume = volumeMax;
        }
        if (curVolume < volumeMin) {
            curVolume = volumeMin;
        }
        return curVolume;
    }

    public void increaseVolume() {
        curVolume++;
        if (curVolume > volumeMax) {
            curVolume = volumeMax;
        }
    }

    public void lowVolume() {
        curVolume--;
        if (curVolume < volumeMin) {
            curVolume = volumeMin;
        }
    }

}




