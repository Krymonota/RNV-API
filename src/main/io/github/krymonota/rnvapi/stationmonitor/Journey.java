package io.github.krymonota.rnvapi.stationmonitor;

import java.util.List;

import io.github.krymonota.rnvapi.info.station.StationInfoTransfer;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Represents a journey.
 * @since 1.0.0
 * @version 1.0.1
 */
@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode
public class Journey {

    private String time;
    private String shortLabel;
    private String projectedTime;
    private String label;
    private String icon;
    private String color;
    private String pastRequestText;
    private String ticker;
    private List<Departure> listOfDepartures;
    private List<StationInfoTransfer> stationInfos;

}
