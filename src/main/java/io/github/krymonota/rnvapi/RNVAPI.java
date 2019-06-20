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

package io.github.krymonota.rnvapi;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Main class used for creating an api provider instance of {@link RNVAPIService}.
 * @since 1.0.0
 * @version 1.1.0
 */
public final class RNVAPI {

    public static final String API_BASE_URL = "http://rnv.the-agent-factory.de:8080/easygo2/api/";

    /**
     * Creates an instance of {@link RNVAPIService}.
     * @param  apiToken The RNV API token
     * @return The created instance of {@link RNVAPIService}
     */
    public static RNVAPIService createAPIServiceProvider(final String apiToken) {
        final OkHttpClient httpClient = new OkHttpClient.Builder().addInterceptor(new Interceptor() {

            @Override
            public Response intercept(final Interceptor.Chain chain) throws IOException {
                final Request request = chain.request().newBuilder().addHeader("RNV_API_TOKEN", apiToken).build();

                return chain.proceed(request);
            }

        }).build();

        return RNVAPI.createAPIServiceProvider(apiToken, httpClient);
    }

    /**
     * Creates an instance of {@link RNVAPIService} with a custom {@link OkHttpClient}.
     * @param  apiToken The RNV API token
     * @param  httpClient An instance of {@link OkHttpClient}
     * @return The created instance of {@link RNVAPIService}
     */
    public static RNVAPIService createAPIServiceProvider(final String apiToken, final OkHttpClient httpClient) {
        final Retrofit retrofit = new Retrofit.Builder()
                .client(httpClient)
                .baseUrl(API_BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        return retrofit.create(RNVAPIService.class);
    }

    private RNVAPI() { }

}
