/*
 * Copyright 2019 Krymonota
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package io.github.krymonota.rnvapi.news;

import java.util.List;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Represents a news entry.
 * @since 1.0.0
 * @version 1.1.0
 */
@Builder
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
