import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.domain.Radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
public void shouldSetCurrentRadioStation(){
        Radio radio=new Radio();
        int currentRadioStation=10;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected=0;
        assertEquals(expected,radio.getCurrentRadioStation());
    }
    @Test
    public void shouldSetCurrentRadioStationIncrease(){
        Radio radio=new Radio();
        int currentRadioStation=-1;
        radio.setCurrentRadioStation(currentRadioStation);
        int expected=0;
        assertEquals(expected,radio.getCurrentRadioStation());
    }
    @Test
    public void shouldSetCurrentRadioStationPrev(){
        Radio radio=new Radio();
        int currentRadioStation=0;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changePrevCurrentRadioStation();
        int expected=9;
        assertEquals(expected,radio.getCurrentRadioStation());
    }
    @Test
    public void shouldSetCurrentRadioStationNext(){
        Radio radio=new Radio();
        int currentRadioStation=9;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changeNextCurrentRadioStation();
        int expected=0;
        assertEquals(expected,radio.getCurrentRadioStation());
    }
    @Test
    public void shouldSetCurrentRadioStationOnNext(){
        Radio radio=new Radio();
        int currentRadioStation=2;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changeNextCurrentRadioStation();
        int expected=3;
        assertEquals(expected,radio.getCurrentRadioStation());
    }
    @Test
    public void shouldSetCurrentRadioStationOnPrev(){
        Radio radio=new Radio();
        int currentRadioStation=5;
        radio.setCurrentRadioStation(currentRadioStation);
        radio.changePrevCurrentRadioStation();
        int expected=4;
        assertEquals(expected,radio.getCurrentRadioStation());
    }
    @Test
    public void shouldSetVolume(){
        Radio radio=new Radio();
        int currentVolume=11;
        radio.setVolume(currentVolume);

        int expected=0;
        assertEquals(expected,radio.getVolume());
    }
    @Test
    public void shouldSetVolumePrev(){
        Radio radio=new Radio();
        int currentVolume=-1;
        radio.setVolume(currentVolume);

        int expected=0;
        assertEquals(expected,radio.getVolume());
    }
    @Test
    public void shouldSetVolumeIncrease(){
        Radio radio=new Radio();
        int currentVolume=2;
        radio.setVolume(currentVolume);
        radio.increaseVolume();
        int expected=3;
        assertEquals(expected,radio.getVolume());
    }
    @Test
    public void shouldSetVolumeIncreaseMax(){
        Radio radio=new Radio();
        int currentVolume=10;
        radio.setVolume(currentVolume);
        radio.increaseVolume();
        int expected=10;
        assertEquals(expected,radio.getVolume());
    }
    @Test
    public void shouldSetVolumeIncreaseMin(){
        Radio radio=new Radio();
        int currentVolume=0;
        radio.setVolume(currentVolume);
        radio.decreaseVolume();
        int expected=0;
        assertEquals(expected,radio.getVolume());
    }
    @Test
    public void shouldSetVolumeDecrease(){
        Radio radio=new Radio();
        int currentVolume=5;
        radio.setVolume(currentVolume);
        radio.decreaseVolume();
        int expected=4;
        assertEquals(expected,radio.getVolume());
    }
}
