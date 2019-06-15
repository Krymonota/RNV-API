package io.github.krymonota.rnvapi.stations;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Represents a station.
 * @since 1.0.0
 * @version 1.0.1
 */
@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode
public class Station {

    private String elementID;
    private String hafasID;
    private String longName;
    private String shortName;
    private String longitude;
    private String latitude;

}
