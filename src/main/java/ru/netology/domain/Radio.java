package ru.netology.domain;


public class Radio {
    private int curStation;
    private int curVolume;

    public int getCurStation() {
        return curStation;
    }

    public void setCurStation(int curStation) {
        if (curStation > 9) {
            curStation = 0;
        }
        if (curStation < 0) {
            curStation = 9;
        }
        this.curStation = curStation;
    }

    public int setNextStation() {
        if (curStation < 9) {
            curStation = curStation + 1;
        }
        return curStation;
    }


    public int setPrevStation() {
        if (curStation > 0) {
            curStation = curStation - 1;
        }
        return curStation;
    }

    public int getCurVolume() {
        return curVolume;
    }

    public void setCurVolume(int curVolume) {
        if (curVolume > 10) {
            curVolume = 10;
        }
        if (curVolume < 0) {
            curVolume = 0;
        }
        this.curVolume = curVolume;
    }

    public int increaseVolume() {
        if (curVolume < 10) {
            curVolume++;
        }
        return curVolume;
    }

    public int reduceVolume() {
        if (curVolume > 0) {
            curVolume--;
        }
        return curVolume;
    }
}



