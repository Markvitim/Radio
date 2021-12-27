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
        if (curStation > 9) {
            this.curStation = 0;
        }
        return curStation;
    }

    public int setToMinNumberStation() {
        if (curStation < 0) {
            this.curStation = 9;

        }
        return curStation;
    }

}

