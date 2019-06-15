/*
 * Copyright 2019 Krymonota
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.krymonota.rnvapi.test;

import java.io.IOException;
import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import io.github.krymonota.rnvapi.RNVAPI;
import io.github.krymonota.rnvapi.RNVAPIService;
import io.github.krymonota.rnvapi.lines.Line;
import io.github.krymonota.rnvapi.lines.LineJourney;
import retrofit2.Response;

@TestInstance(Lifecycle.PER_CLASS)
public class LineTest {

    private RNVAPIService apiService;

    @BeforeAll
    public void initializeTest() {
        this.apiService = RNVAPI.createAPIServiceProvider(System.getenv("API_TOKEN"));
    }

    @Test
    public void testGetAllLines() throws IOException {
        final Response<List<Line>> response = this.apiService.getAllLines().execute();

        TestUtils.testResponse(response);

        final List<Line> lines = response.body();

        TestUtils.testListNotEmpty(lines);

        for (Line line : lines) {
            this.testLine(line);
        }
    }

    @Test
    public void testGetAllLineJourney() throws IOException {
        final Response<List<LineJourney>> response = this.apiService.getAllLineJourneys().execute();

        TestUtils.testResponse(response);

        final List<LineJourney> lineJourneys = response.body();

        TestUtils.testListNotEmpty(lineJourneys);

        for (LineJourney lineJourney : lineJourneys) {
            this.testLineJourney(lineJourney);
        }
    }

    private void testLine(Line line) {
        TestUtils.testAllFieldsNotNull(TestUtils.getAllFields(line), line);

        System.out.println(line.toString());
    }

    private void testLineJourney(LineJourney lineJourney) {
        TestUtils.testAllFieldsNotNull(TestUtils.getAllFields(lineJourney, "ticker", "timeList", "stopListIds", "predictedTimeList", "stationIDs", "directions"), lineJourney);

        System.out.println(lineJourney.toString());
    }

}
