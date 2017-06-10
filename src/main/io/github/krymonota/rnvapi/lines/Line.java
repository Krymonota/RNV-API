package io.github.krymonota.rnvapi.lines;

import lombok.Data;

@Data
public class Line {

    private final String lineID;
    private final String lineType;
    private final String hexcolor;
    private final String iconName;
    private final long elementID;

}