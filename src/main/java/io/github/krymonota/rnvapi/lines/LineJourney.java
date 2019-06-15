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

package io.github.krymonota.rnvapi.lines;

import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Represents a line journey.
 * @since 1.0.0
 * @version 1.0.1
 */
@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode
public class LineJourney {

    private String lineId;
    private String ticker;
    private int validFromIndex;
    private List<String> lineIDs;
    private List<String> timeList;
    private List<String> stopListIds;
    private List<String> predictedTimeList;
    private List<String> stationIDs;
    private List<String> directions;

}