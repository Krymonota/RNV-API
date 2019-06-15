package io.github.krymonota.rnvapi.lines;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Represents a line journey.
 * @since 1.0.0
 * @version 1.0.1
 */
@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode
public class LineJourney {

    private String lineId;
    private String ticker;
    private int validFromIndex;
    private List<String> lineIDs;
    private List<String> timeList;
    private List<String> stopListIds;
    private List<String> predictedTimeList;
    private List<String> stationIDs;
    private List<String> directions;

}