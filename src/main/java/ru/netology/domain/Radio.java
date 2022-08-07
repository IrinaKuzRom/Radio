package ru.netology.domain;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 9) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }

    public void changePrevCurrentRadioStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 9;
            return;
        }
        this.currentRadioStation--;
    }

    public void changeNextCurrentRadioStation() {
        if (currentRadioStation == 9) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation++;
    }

    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == 10) {
            this.currentVolume= currentVolume;
        }
        if (currentVolume < 10) {
            this.currentVolume++;
        }

    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume > 0) {
            this.currentVolume--;
        }
    }
}
