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
import io.github.krymonota.rnvapi.maps.MapEntity;
import retrofit2.Response;

@TestInstance(Lifecycle.PER_CLASS)
public class MapTest {

    private RNVAPIService apiService;

    @BeforeAll
    public void initializeTest() {
        this.apiService = RNVAPI.createAPIServiceProvider(System.getenv("API_TOKEN"));
    }

    @Test
    public void testGetNewsEntries() throws IOException {
        final Response<List<MapEntity>> response = this.apiService.getMaps(512, "pdf").execute();

        TestUtils.testResponse(response);

        final List<MapEntity> mapEntities = response.body();

        TestUtils.testListNotEmpty(mapEntities);

        for (MapEntity mapEntity : mapEntities) {
            this.testMapEntity(mapEntity);
        }
    }

    private void testMapEntity(MapEntity mapEntity) {
        TestUtils.testAllFieldsNotNull(TestUtils.getAllFields(mapEntity), mapEntity);

        System.out.println(mapEntity.toString());
    }

}
