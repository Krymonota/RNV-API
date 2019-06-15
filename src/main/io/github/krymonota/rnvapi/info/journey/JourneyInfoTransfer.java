package io.github.krymonota.rnvapi.info.journey;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Represents a journey info transfer.
 * @since 1.0.0
 * @version 1.0.1
 */
@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode
public class JourneyInfoTransfer {

    private String title;
    private String text;
    private String stationID;
    private String stationName;
    private List<String> poles;
    private String author;
    private long created;
    private long validFrom;
    private long validTo;

}
