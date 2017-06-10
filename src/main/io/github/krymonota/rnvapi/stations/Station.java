package io.github.krymonota.rnvapi.stations;

import lombok.Data;

@Data
public class Station {

    private final String elementID;
    private final String hafasID;
    private final String longName;
    private final String shortName;
    private final String longitude;
    private final String latitude;

}