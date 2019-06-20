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

package io.github.krymonota.rnvapi.info.station;

import java.util.List;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

/**
 * Represents a station info transfer.
 * @since 1.0.0
 * @version 1.1.0
 */
@Builder
@Getter
@ToString
@EqualsAndHashCode
public class StationInfoTransfer {

    private String title;
    private String text;
    private String lineId;
    private List<String> stationIds;
    private List<String> stationNames;
    private String url;
    private String author;
    private long created;
    private long validFrom;
    private long validTo;
    private long displayFrom;
    private long displayTo;

}
