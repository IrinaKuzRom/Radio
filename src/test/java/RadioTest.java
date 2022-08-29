import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void testRadio() {
        Radio radio = new Radio();
    }

    @Test
    void shouldSetCurrentRadioStation() {
        Radio radio = new Radio(10);
        int expected = 10;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStationBackIfStationIsUnderMin() {
        Radio radio = new Radio(10);
        int currentRadioStation = -1;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 10;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());

    }

    @Test
    void shouldSetCurrentRadioStationBackIfStationIsMoreThanMax() {
        Radio radio = new Radio(10);
        int currentRadioStation = 11;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected = 10;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());

    }

    @Test
    void shouldChangeOnPreviousRadioStationIfStationIsMin() {
        Radio radio = new Radio(10);
        int currentRadioStation = 0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changePrevCurrentRadioStation();
        int expected = 9;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotChangeOnNextRadioStationIfStationIsMax() {
        Radio radio = new Radio(10);
        int currentRadioStation = 10;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changeNextCurrentRadioStation();
        int expected = 11;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void shouldChangeOnPreviousRadioStation() {
        Radio radio = new Radio(10);
        int currentRadioStation = 5;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changePrevCurrentRadioStation();
        int expected = 4;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void shouldChangeOnNextRadioStation() {
        Radio radio = new Radio(10);
        int currentRadioStation = 2;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changeNextCurrentRadioStation();
        int expected = 3;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void shouldSetVolumeIfVolumeIsOverMax() {
        Radio radio = new Radio(10);
        int currentVolume = 101;
        radio.setVolume(currentVolume);

        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsOverMaxOn() {
        Radio radio = new Radio(10);
        int currentVolume = 100;
        radio.setVolume(currentVolume);
        radio.currentVolumeTop();
        int expected = 100;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void shouldSetVolumeIfVolumeIsUnderMin() {
        Radio radio = new Radio(10);
        int currentVolume = -1;
        radio.setVolume(currentVolume);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());
    }


    @Test
    void shouldNotChangeVolumeIfVolumeIsMin() {
        Radio radio = new Radio(10);
        int currentVolume = 0;
        radio.setVolume(currentVolume);
        radio.currentVolumeDown();
        int expected = 0;
        Assertions.assertEquals(expected, radio.getVolume());

    }


    @Test
    void volumeUpForOne() {
        Radio radio = new Radio(10);
        int currentVolume = 2;
        radio.setVolume(currentVolume);
        radio.currentVolumeTop();
        int expected = 3;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void volumeDownForOne() {
        Radio radio = new Radio(10);
        int currentVolume = 5;
        radio.setVolume(currentVolume);
        radio.currentVolumeDown();
        int expected = 4;
        Assertions.assertEquals(expected, radio.getVolume());

    }

}
