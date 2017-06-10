package io.github.krymonota.rnvapi.canceled.lines;

import lombok.Data;

@Data
public class CanceledLineTransfer {

    private final String id;
    private final String line;
    private final String author;
    private final long validFrom;
    private final long validTo;
    private final long created;
    private final boolean canceled;
    private final boolean deleted;

}