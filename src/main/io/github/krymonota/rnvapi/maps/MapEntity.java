package io.github.krymonota.rnvapi.maps;

import lombok.Data;

@Data
public class MapEntity {

    private final String name;
    private final String shortName;
    private final String thumbnailUrl;
    private final String mapUrl;
    private final String validFrom;

}