package io.github.krymonota.rnvapi.stations;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Represents a station package.
 * @since 1.0.0
 * @version 1.0.1
 */
@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode
public class StationPackage {

    private String name;
    private long regionID;
    private long elementID;
    private List<Station> stations;

}
