package ru.netology.radio;

public class Radio {
    private int currentNumberRadioStation; // номер станции
    private int currentSoundVolume;   // текущая громкость звука

    public int getCurrentNumberRadioStation() { //вызов данных через доп переменную
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int newCurrentNumberRadioStation) {  //передача данных о р-станции
        if (newCurrentNumberRadioStation < 0) {
            return;
        }
        if (newCurrentNumberRadioStation > 9) {
            return;
        }
        currentNumberRadioStation = newCurrentNumberRadioStation;
    }

    public void nextNumberRadioStation() {    // переключение на плюс
        if (currentNumberRadioStation < 9) {
            currentNumberRadioStation++;
        } else {
            currentNumberRadioStation = 0;
        }
    }

    public void prevNumberRadioStation() { //переключение на минус
        if (currentNumberRadioStation > 0) {
            currentNumberRadioStation--;
        } else {
            currentNumberRadioStation = 9;
        }
    }

    public int getCurrentSoundVolume() { //вызов данных через доп переменную
        return currentSoundVolume;
    }

    public void setCurrentSoundVolume(int newCurrentSoundVolume) {  //  передача данных о р-станции
        if (newCurrentSoundVolume < 0) {
            return;
        }
        if (newCurrentSoundVolume > 10) {
            return;
        }
        currentSoundVolume = newCurrentSoundVolume;
    }

    public void increaseVolumeSound() {    // увеличение громкости
        if (currentSoundVolume < 10) {
            currentSoundVolume++;
        }
    }

    public void decreaseVolumeSound() { //уменьшение громкости
        if (currentSoundVolume > 0) {
            currentSoundVolume--;
        }
    }
}