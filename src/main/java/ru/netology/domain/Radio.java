package ru.netology.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Radio {
    private int currentRadioStation;
    private int minRadioStation;
    private int maxRadioStation = 10;
    private int currentVolume;
    private int minCurrentVolume;
    private int maxCurrentVolume = 100;



    public Radio(int currentRadioStation, int maxRadioStation, int currentVolume, int maxCurrentVolume) {
        this.currentRadioStation = currentRadioStation;
        this.maxRadioStation = maxRadioStation;
        this.currentVolume = currentVolume;
        this.maxCurrentVolume = maxCurrentVolume;
    }


    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int currentRadioStation) {
        if (currentRadioStation > maxRadioStation) {
            return;
        }
        if (currentRadioStation < minRadioStation) {
            return;
        }
        this.currentRadioStation = currentRadioStation;
    }


    public void changePrevRadioStation() {
        if (currentRadioStation == minRadioStation) {
            this.currentRadioStation = maxRadioStation;
            return;
        }
        this.currentRadioStation--;
    }


    public void changeNextRadioStation() {
        if (currentRadioStation == maxRadioStation) {
            this.currentRadioStation = minRadioStation;
            return;
        }
        this.currentRadioStation++;
    }


    public int getVolume() {
        return currentVolume;
    }

    public void setVolume(int currentVolume) {
        if (currentVolume < minCurrentVolume) {
            return;
        }
        if (currentVolume > maxCurrentVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void currentVolumeTop() {

        if (currentVolume == maxCurrentVolume) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume < maxCurrentVolume) {
            this.currentVolume++;
        }
    }

    public void currentVolumeDown() {
        if (currentVolume == minCurrentVolume) {
            this.currentVolume = currentVolume;
        }
        if (currentVolume > minCurrentVolume) {
            this.currentVolume--;
        }
    }
}
