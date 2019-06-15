package io.github.krymonota.rnvapi.news;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Represents a news entry.
 * @since 1.0.0
 * @version 1.0.1
 */
@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode
public class NewsEntry {

    private long regionID;
    private String title;
    private String text;
    private long validFrom;
    private String dateAsString;
    private long validTo;
    private String lines;
    private List<String> seperatedLines;
    private String imgUrl;
    private String textAsHtml;
    private boolean isOldNews;
    private String thumbUrl;
    private String furtherLink;
    private long elementID;

}
