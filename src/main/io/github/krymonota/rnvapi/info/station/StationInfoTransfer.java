package io.github.krymonota.rnvapi.info.station;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Represents a station info transfer.
 * @since 1.0.0
 * @version 1.0.1
 */
@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode
public class StationInfoTransfer {

    private String title;
    private String text;
    private String lineId;
    private List<String> stationIds;
    private List<String> stationNames;
    private String url;
    private String author;
    private long created;
    private long validFrom;
    private long validTo;
    private long displayFrom;
    private long displayTo;

}
