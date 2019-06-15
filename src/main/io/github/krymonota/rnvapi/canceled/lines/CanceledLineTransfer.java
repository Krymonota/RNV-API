package io.github.krymonota.rnvapi.canceled.lines;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Represents a cancelled line transfer.
 * @since 1.0.0
 * @version 1.0.1
 */
@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode
public class CanceledLineTransfer {

    private String id;
    private String line;
    private String author;
    private long validFrom;
    private long validTo;
    private long created;
    private boolean canceled;
    private boolean deleted;

}
