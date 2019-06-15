package io.github.krymonota.rnvapi.stationmonitor;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Represents a departure.
 * @since 1.0.0
 * @version 1.0.1
 */
@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode
public class Departure {

    private String lineLabel;
    private String direction;
    private String time;
    private String differenceTime;
    private String tourId;
    private String kindOfTour;
    private String foreignLine;
    private String newsAvailable;
    private String positionInTour;
    private String lineId;
    private String transportation;
    private String platform;
    private String status;
    private String statusNote;

}
