package ru.netology;

public class Radio {

    private int currentStation;
    private final int maxStation = 9;
    private final int minStation = 0;
    private int currentVolume;
    private final int maxVolume = 10;
    private final int minVolume = 0;

    public int getCurrentStation() {
        return currentStation;
    }

    public int setCurrentStation(int currentStation) {
        if (currentStation <= maxStation && currentStation >= minStation) ;
        {
            this.currentStation = currentStation;
        }
        return this.currentStation;
    }

    public void switchCurrentStationNext() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation++;

    }

    public void switchCurrentStationPrev() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentVolume(int currentVolume) {
        if (currentVolume <= maxVolume && currentVolume >= minVolume) {
            this.currentVolume = currentVolume;
        }
        return this.currentVolume;

    }

    public void increaseVolume () {
        if (currentVolume == maxVolume) {
            this.currentVolume = maxVolume;
        } else currentVolume++;
    }

    public void reduceVolume () {
        if (currentVolume == minVolume) {
            this.currentVolume = minVolume;
        } else currentVolume--;
    }
}
