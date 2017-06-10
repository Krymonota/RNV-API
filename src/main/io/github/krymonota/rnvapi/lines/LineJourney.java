package io.github.krymonota.rnvapi.lines;

import java.util.List;

import lombok.Data;

@Data
public class LineJourney {

    private final String lineId;
    private final String ticker;
    private final int validFromIndex;
    private final List<String> lineIDs;
    private final List<String> timeList;
    private final List<String> stopListIds;
    private final List<String> predictedTimeList;
    private final List<String> stationIDs;
    private final List<String> directions;

}