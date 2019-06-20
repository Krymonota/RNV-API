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

package io.github.krymonota.rnvapi.stationmonitor;

import java.util.List;

import io.github.krymonota.rnvapi.info.station.StationInfoTransfer;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

/**
 * Represents a journey.
 * @since 1.0.0
 * @version 1.1.0
 */
@SuperBuilder
@Getter
@ToString
@EqualsAndHashCode
public class Journey {

    private String time;
    private String shortLabel;
    private String projectedTime;
    private String label;
    private String icon;
    private String color;
    private String pastRequestText;
    private String ticker;
    private List<Departure> listOfDepartures;
    private List<StationInfoTransfer> stationInfos;

}
