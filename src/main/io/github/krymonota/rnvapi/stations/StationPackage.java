package io.github.krymonota.rnvapi.stations;

import java.util.List;

import lombok.Data;

@Data
public class StationPackage {

    private final String name;
    private final long regionID;
    private final long elementID;
    private final List<Station> stations;

}