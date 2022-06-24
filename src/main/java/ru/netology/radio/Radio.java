package ru.netology.radio;

public class Radio {

    private int currentNumberRadioStation;
    private int maxNumberRadioStation;
    private int minNumberRadioStation;
    private int currentSoundVolume;   // текущая громкость звука

    public Radio() {
        maxNumberRadioStation = 9;
        minNumberRadioStation = 0;
    }

    public Radio(int quantityRadioStation) {
        this.maxNumberRadioStation = quantityRadioStation - 1;
    }

    public int getCurrentNumberRadioStation() { //вызов данных через доп переменную
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int newCurrentNumberRadioStation) {  //передача данных о р-станции
        if (newCurrentNumberRadioStation < minNumberRadioStation) {
            return;
        }
        if (newCurrentNumberRadioStation > maxNumberRadioStation) {
            return;
        }
        currentNumberRadioStation = newCurrentNumberRadioStation;
    }

    public void nextNumberRadioStation() {    // переключение на плюс
        if (currentNumberRadioStation < maxNumberRadioStation) {
            currentNumberRadioStation++;
        } else {
            currentNumberRadioStation = minNumberRadioStation;
        }
    }

    public void prevNumberRadioStation() { //переключение на минус
        if (currentNumberRadioStation > minNumberRadioStation) {
            currentNumberRadioStation--;
        } else {
            currentNumberRadioStation = maxNumberRadioStation;
        }
    }

    public int getCurrentSoundVolume() { //вызов данных через доп переменную
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {  //  передача данных о р-станции
        if (newCurrentSoundVolume < 0) {
            return;
        }
        if (newCurrentSoundVolume > 100) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void increaseVolumeSound() {    // увеличение громкости
        if (currentSoundVolume < 100) {
            currentSoundVolume++;
        }
    }

    public void decreaseVolumeSound() { //уменьшение громкости
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        }
    }
}