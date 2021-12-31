package ru.netology.domain;


public class Radio {
    private int curStation;

    public int getCurStation() {
        return curStation;
    }

    public void setCurStation(int curStation) {
        if (curStation > 9) {
            return;
        }
        if (curStation < 0) {
            return;
        }
        this.curStation = curStation;
    }

    public int setToMaxNumberStation() {
        if (curStation <= 9) {
            curStation--;
        }
        if (curStation < 0) {
            curStation = 9;
        }
        this.curStation = curStation;
        return curStation;
    }


    public int setToMinNumberStation() {
        if (curStation <= 9) {
            curStation++;
        }
        if (curStation > 9) {
            curStation = 0;
        }
        this.curStation = curStation;
        return curStation;
    }

}


