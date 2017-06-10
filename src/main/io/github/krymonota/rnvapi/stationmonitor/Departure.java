package io.github.krymonota.rnvapi.stationmonitor;

import lombok.Data;

@Data
public class Departure {

    private final String lineLabel;
    private final String direction;
    private final String time;
    private final String differenceTime;
    private final String tourId;
    private final String kindOfTour;
    private final String foreignLine;
    private final String newsAvailable;
    private final String positionInTour;
    private final String lineId;
    private final String transportation;
    private final String platform;
    private final String status;
    private final String statusNote;

}