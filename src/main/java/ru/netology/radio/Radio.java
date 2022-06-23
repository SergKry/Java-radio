package ru.netology.radio;

public class Radio {
    public int currentNumberRadioStation; // текущий номер р-станции

    public int getCurrentNumberRadioStation() { //вызов данных через доп переменную
        return currentNumberRadioStation;
    }

    public void setCurrentNumberRadioStation(int newCurrentNumberRadioStation) {  // прямая передача данных о р-станции
        if (newCurrentNumberRadioStation < 0) {
            return; // прекращение при отрицательном значении
        }
        if (newCurrentNumberRadioStation > 9) {
            return; // прекращение запроса при значении больше 9
        }
        currentNumberRadioStation = newCurrentNumberRadioStation;
    }
    public void nextNumberRadioStation() {    // переключение на плюс
        if (currentNumberRadioStation < 9) {
            currentNumberRadioStation = currentNumberRadioStation + 1;
        } else {
            currentNumberRadioStation = 0;
        }

    }

    public void prevNumberRadioStation() { //переключение на минус
        if (currentNumberRadioStation > 0 && currentNumberRadioStation <= 9) {
            currentNumberRadioStation = currentNumberRadioStation - 1;
            //}
        }
        else if (currentNumberRadioStation ==0){
            currentNumberRadioStation = 9;
        }
       // if (currentNumberRadioStation <= -1 && currentNumberRadioStation >= 10){
      //      return;   ограничение на числа до и после не работает
      //  }
    }

    int currentSoundVolume;   // текущая громкость

    public int getCurrentSoundVolume() { //вызов данных через доп переменную
        return currentSoundVolume;
    }

    public void increaseVolumeSound() {    // увеличение громкости
        if (currentSoundVolume < 10) {
            currentSoundVolume = currentSoundVolume + 1;
        }
        if (currentSoundVolume >= 10) {
            currentSoundVolume = 10;
        }
    }

    public void decreaseVolumeSound() { //уменьшение громкости
        if (currentSoundVolume <= 10) {
            currentSoundVolume = currentSoundVolume - 1;
        }
        if (currentSoundVolume <= 0) {
            currentSoundVolume = 0;
        }
    }
}