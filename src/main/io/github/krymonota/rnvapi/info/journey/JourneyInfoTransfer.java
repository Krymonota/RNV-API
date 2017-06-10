package io.github.krymonota.rnvapi.info.journey;

import java.util.List;

import lombok.Data;

@Data
public class JourneyInfoTransfer {

    private final String title;
    private final String text;
    private final String stationID;
    private final String stationName;
    private final List<String> poles;
    private final String author;
    private final long created;
    private final long validFrom;
    private final long validTo;

}