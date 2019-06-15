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

package io.github.krymonota.rnvapi.examples;

import io.github.krymonota.rnvapi.RNVAPI;
import io.github.krymonota.rnvapi.RNVAPIService;
import io.github.krymonota.rnvapi.info.station.StationInfoTransfer;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class AsyncRequestExample {

    public static void main(String[] args) {
        final RNVAPIService apiService = RNVAPI.createAPIServiceProvider(args[0]);

        // Asynchronous Request
        apiService.getStationInfo("1", null, null).enqueue(new Callback<List<StationInfoTransfer>>() {

            @Override
            public void onResponse(Call<List<StationInfoTransfer>> call, Response<List<StationInfoTransfer>> response) {
                if (response.isSuccessful()) {
                    // Resource available
                    response.body().stream().findFirst().ifPresent(stationInfo -> System.out.println(stationInfo.getText()));
                } else {
                 // Error response, no access to resource?
                }
            }

            @Override
            public void onFailure(Call<List<StationInfoTransfer>> call, Throwable t) {
                // Something went terribly wrong (e. g. no internet connection)
                t.printStackTrace();
            }

        });
    }

}