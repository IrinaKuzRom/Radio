import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {


    @Test
    void shouldSetCurrentRadioStation() {
        Radio radio = new Radio();
        radio.setCurrentRadioStation(0);
        radio.changePrevRadioStation();

        int expected = 29;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldSetCurrentRadioStationBackIfStationIsUnderMin() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(-1);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());

    }

    @Test
    void shouldSetCurrentRadioStationBackIfStationIsMoreThanMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(30);
        int expected = 0;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());

    }

    @Test
    void shouldChangeOnPreviousRadioStationIfStationIsMin() {
        Radio radio = new Radio(30);

        radio.setCurrentRadioStation(25);

        int expected = 25;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotChangeOnNextRadioStationIfStationIs() {
        Radio radio = new Radio(35);

        radio.setCurrentRadioStation(30);
        radio.changeNextRadioStation();
        int expected = 31;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldNotChangeOnNextRadioStationIfStationIsMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(23);
        radio.changePrevRadioStation();
        int expected = 22;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }

    @Test
    void shouldChangeOnPreviousRadioStation() {
        Radio radio = new Radio(50);

        radio.setCurrentRadioStation(42);
        radio.changePrevRadioStation();
        int expected = 41;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }


    @Test
    void shouldChangeOnNextRadioStation() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(15);
        radio.changeNextRadioStation();
        int expected = 16;
        Assertions.assertEquals(expected, radio.getCurrentRadioStation());
    }
    @Test
    void shouldChangeOnNextRadioStationMax() {
        Radio radio = new Radio();

        radio.setCurrentRadioStation(29);
        radio.changeNextRadioStation();
        int expected = 0;
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
        Radio radio = new Radio(5);
        int currentVolume = 2;
        radio.setVolume(currentVolume);
        radio.currentVolumeTop();
        int expected = 3;
        Assertions.assertEquals(expected, radio.getVolume());
    }

    @Test
    void volumeDownForOne() {
        Radio radio = new Radio(15);
        int currentVolume = 5;
        radio.setVolume(currentVolume);
        radio.currentVolumeDown();
        int expected = 4;
        Assertions.assertEquals(expected, radio.getVolume());

    }

}

