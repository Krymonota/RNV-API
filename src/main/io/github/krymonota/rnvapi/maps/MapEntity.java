package io.github.krymonota.rnvapi.maps;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Represents a map.
 * @since 1.0.0
 * @version 1.0.1
 */
@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode
public class MapEntity {

    private String name;
    private String shortName;
    private String thumbnailUrl;
    private String mapUrl;
    private String validFrom;

}
