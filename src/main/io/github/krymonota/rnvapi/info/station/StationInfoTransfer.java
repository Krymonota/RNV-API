package io.github.krymonota.rnvapi.info.station;

import java.util.List;

import lombok.Data;

@Data
public class StationInfoTransfer {

    private final String title;
    private final String text;
    private final String lineId;
    private final List<String> stationIds;
    private final List<String> stationNames;
    private final String url;
    private final String author;
    private final long created;
    private final long validFrom;
    private final long validTo;
    private final long displayFrom;
    private final long displayTo;

}