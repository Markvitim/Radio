package ru.netology.domain;


public class Radio {
    private int curStation;
    private int curVolume;
    private int numStation = 10;
    private int stationMin;
    private int volumeMax = 100;
    private int volumeMin;

    public Radio() {
    }

    public Radio(int curStation, int curVolume, int numStation, int stationMin, int volumeMax, int volumeMin) {
        this.curStation = curStation;
        this.curVolume = curVolume;
        this.numStation = numStation;
        this.stationMin = stationMin;
        this.volumeMax = volumeMax;
        this.volumeMin = volumeMin;
    }

    public Radio(int curStation, int numStation) {
        this.curStation = curStation;
        this.numStation = numStation;
    }

    public Radio(int curVolume) {
        this.curVolume = curVolume;
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

    public int getNumStation() {
        return numStation;
    }

    public void setNumStation(int numStation) {
        this.numStation = numStation;
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
        if (curStation > numStation - 1) {
            curStation = stationMin;
        }
        if (curStation < stationMin) {
            curStation = numStation - 1;
        }
        return curStation;
    }

    public int setNextStation() {
        curStation++;
        if (curStation > numStation - 1) {
            curStation = stationMin;
        }
        return curStation;
    }

    public int setPrevStation() {
        curStation--;
        if (curStation < stationMin) {
            curStation = numStation - 1;
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




