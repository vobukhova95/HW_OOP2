package ru.netology.qa;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation > 9) {
            return;
        }
        if (newCurrentRadioStation < 0) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void next() {
        if (currentRadioStation == 9) {
            currentRadioStation = 0;
            return;
        }
        currentRadioStation++;
    }

    public void prev() {
        if (currentRadioStation == 0) {
            currentRadioStation = 9;
            return;
        }
        currentRadioStation--;
    }


    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume > 100) {
            return;
        }
        if (newCurrentVolume < 0) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume == 100) {
            return;
        }
        currentVolume++;
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            return;
        }
        currentVolume--;
    }
}
