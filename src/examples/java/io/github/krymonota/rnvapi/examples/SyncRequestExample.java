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

import java.io.IOException;

import io.github.krymonota.rnvapi.RNVAPI;
import io.github.krymonota.rnvapi.RNVAPIService;

import com.google.gson.Gson;

public class SyncRequestExample {

    public static void main(String[] args) {
        final RNVAPIService apiService = RNVAPI.createAPIServiceProvider(args[0]);

        try {
            // Synchronous Request
            final String result = new Gson().toJson(apiService.getAllLines().execute().body());

            System.out.println(result);
        } catch (IOException e) {
         // Something went wrong
            e.printStackTrace();
        }
    }

}