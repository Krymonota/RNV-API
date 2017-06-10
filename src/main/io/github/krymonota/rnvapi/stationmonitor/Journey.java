package io.github.krymonota.rnvapi.stationmonitor;

import io.github.krymonota.rnvapi.info.station.StationInfoTransfer;

import java.util.List;

import lombok.Data;

@Data
public class Journey {

    private final String time;
    private final String shortLabel;
    private final String projectedTime;
    private final String label;
    private final String icon;
    private final String color;
    private final String pastRequestText;
    private final String ticker;
    private final List<Departure> listOfDepartures;
    private final List<StationInfoTransfer> stationInfos;

}