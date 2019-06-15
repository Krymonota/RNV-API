package io.github.krymonota.rnvapi.lines;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Represents a line.
 * @since 1.0.0
 * @version 1.0.1
 */
@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode
public class Line {

    private String lineID;
    private String lineType;
    private String hexcolor;
    private String iconName;
    private long elementID;

}
