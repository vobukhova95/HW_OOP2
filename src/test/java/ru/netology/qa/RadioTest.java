package ru.netology.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    Radio radio = new Radio();

    @Test
    public void CountRadioStationDefault() {
        Assertions.assertEquals(10, radio.getCountRadioStation());
        Assertions.assertEquals(0, radio.getMinRadioStation());
        Assertions.assertEquals(9, radio.getMaxRadioStation());
        Assertions.assertEquals(0, radio.getCurrentRadioStation());

        Assertions.assertEquals(0, radio.getMinVolume());
        Assertions.assertEquals(100, radio.getMaxVolume());
        Assertions.assertEquals(50, radio.getCurrentVolume());
    }

    @Test

    public void CountRadioStation() {
        Radio countRadio = new Radio(20);

        Assertions.assertEquals(20, countRadio.getCountRadioStation());
        Assertions.assertEquals(0, countRadio.getMinRadioStation());
        Assertions.assertEquals(19, countRadio.getMaxRadioStation());
        Assertions.assertEquals(0, countRadio.getCurrentRadioStation());

        Assertions.assertEquals(0, countRadio.getMinVolume());
        Assertions.assertEquals(100, countRadio.getMaxVolume());
        Assertions.assertEquals(50, countRadio.getCurrentVolume());
    }

    @Test
    public void CountRadioStationLess0() {
        Radio countRadio = new Radio(-1);

        Assertions.assertEquals(10, countRadio.getCountRadioStation());
        Assertions.assertEquals(0, countRadio.getMinRadioStation());
        Assertions.assertEquals(9, countRadio.getMaxRadioStation());
        Assertions.assertEquals(0, countRadio.getCurrentRadioStation());

        Assertions.assertEquals(0, countRadio.getMinVolume());
        Assertions.assertEquals(100, countRadio.getMaxVolume());
        Assertions.assertEquals(50, countRadio.getCurrentVolume());
    }

    @Test
    public void CountRadioStation0() {
        Radio countRadio = new Radio(0);

        Assertions.assertEquals(10, countRadio.getCountRadioStation());
        Assertions.assertEquals(0, countRadio.getMinRadioStation());
        Assertions.assertEquals(9, countRadio.getMaxRadioStation());
        Assertions.assertEquals(0, countRadio.getCurrentRadioStation());

        Assertions.assertEquals(0, countRadio.getMinVolume());
        Assertions.assertEquals(100, countRadio.getMaxVolume());
        Assertions.assertEquals(50, countRadio.getCurrentVolume());
    }

    @Test
    public void CountRadioStation1() {
        Radio countRadio = new Radio(1);

        Assertions.assertEquals(10, countRadio.getCountRadioStation());
        Assertions.assertEquals(0, countRadio.getMinRadioStation());
        Assertions.assertEquals(9, countRadio.getMaxRadioStation());
        Assertions.assertEquals(0, countRadio.getCurrentRadioStation());

        Assertions.assertEquals(0, countRadio.getMinVolume());
        Assertions.assertEquals(100, countRadio.getMaxVolume());
        Assertions.assertEquals(50, countRadio.getCurrentVolume());
    }

    @Test
    public void CountRadioStation2() {
        Radio countRadio = new Radio(2);

        Assertions.assertEquals(2, countRadio.getCountRadioStation());
        Assertions.assertEquals(0, countRadio.getMinRadioStation());
        Assertions.assertEquals(1, countRadio.getMaxRadioStation());
        Assertions.assertEquals(0, countRadio.getCurrentRadioStation());

        Assertions.assertEquals(0, countRadio.getMinVolume());
        Assertions.assertEquals(100, countRadio.getMaxVolume());
        Assertions.assertEquals(50, countRadio.getCurrentVolume());
    }

    @Test
    public void CountRadioStation3() {
        Radio countRadio = new Radio(3);

        Assertions.assertEquals(3, countRadio.getCountRadioStation());
        Assertions.assertEquals(0, countRadio.getMinRadioStation());
        Assertions.assertEquals(2, countRadio.getMaxRadioStation());
        Assertions.assertEquals(0, countRadio.getCurrentRadioStation());

        Assertions.assertEquals(0, countRadio.getMinVolume());
        Assertions.assertEquals(100, countRadio.getMaxVolume());
        Assertions.assertEquals(50, countRadio.getCurrentVolume());
    }

    @Test
    public void SetCurrentRadioStationLess0() {
        radio.setCurrentRadioStation(-1);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetCurrentRadioStation0() {
        radio.setCurrentRadioStation(0);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetCurrentRadioStation1() {
        radio.setCurrentRadioStation(1);
        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetCurrentRadioStation8() {
        radio.setCurrentRadioStation(8);
        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetCurrentRadioStation9() {
        radio.setCurrentRadioStation(9);
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void SetCurrentRadioStation10() {
        radio.setCurrentRadioStation(10);
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStationLess0() {
        radio.setCurrentRadioStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation0() {
        radio.setCurrentRadioStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void prevRadioStation1() {
        radio.setCurrentRadioStation(2);
        radio.prev();
        int expected = 1;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation8() {
        radio.setCurrentRadioStation(7);
        radio.next();
        int expected = 8;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStation9() {
        radio.setCurrentRadioStation(8);
        radio.next();
        int expected = 9;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void nextRadioStationMore9() {
        radio.setCurrentRadioStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentRadioStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolumeLess0() {
        radio.setCurrentVolume(-1);
        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume0() {
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume1() {
        radio.setCurrentVolume(1);
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume99() {
        radio.setCurrentVolume(99);
        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume100() {
        radio.setCurrentVolume(100);
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void setCurrentVolume101() {
        radio.setCurrentVolume(101);
        int expected = 50;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeLess0() {
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume0() {
        radio.setCurrentVolume(1);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume1() {
        radio.setCurrentVolume(2);
        radio.decreaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume99() {
        radio.setCurrentVolume(98);
        radio.increaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume100() {
        radio.setCurrentVolume(99);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume101() {
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}


