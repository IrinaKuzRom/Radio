package ru.netology.domain;


public class Radio {
    private int currentRadioStation;

    private int currentVolume;
    private int stationAmount=20;


    public Radio() {

    }


    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > 19) {
            return;
        }
        if (currentRadioStation < 0) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void changePrevRadioStation() {
        if (currentRadioStation == 0) {
            this.currentRadioStation = 19;
            return;
        }
        this.currentRadioStation--;
    }


    public void changeNextRadioStation() {
        if (currentRadioStation == 19) {
            this.currentRadioStation = 0;
            return;
        }
        this.currentRadioStation++;
    }


    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void currentVolumeTop() {

        if (currentVolume == 100) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume < 100) {
            this.currentVolume++;
        }
    }

    public void currentVolumeDown() {
        if (currentVolume == 0) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume > 0) {
            this.currentVolume--;
        }
    }
}