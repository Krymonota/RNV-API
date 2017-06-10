package io.github.krymonota.rnvapi.news;

import java.util.List;

import lombok.Data;

@Data
public class NewsEntry {

    private final long regionID;
    private final String title;
    private final String text;
    private final long validFrom;
    private final String dateAsString;
    private final long validTo;
    private final String lines;
    private final List<String> seperatedLines;
    private final String imgUrl;
    private final String textAsHtml;
    private final boolean isOldNews;
    private final String thumbUrl;
    private final String furtherLink;
    private final long elementID;

}