package io.github.krymonota.rnvapi;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RNVAPI {

    public static final String API_BASE_URL = "http://rnv.the-agent-factory.de:8080/easygo2/api/";

    public static RNVAPIService createAPIServiceProvider(String apiToken) {
        OkHttpClient httpClient = new OkHttpClient.Builder().addInterceptor(new Interceptor() {

            @Override
            public Response intercept(Interceptor.Chain chain) throws IOException {
                Request request = chain.request().newBuilder().addHeader("RNV_API_TOKEN", apiToken).build();

                return chain.proceed(request);
            }

        }).build();

        Retrofit retrofit = new Retrofit.Builder().client(httpClient).baseUrl(API_BASE_URL).addConverterFactory(GsonConverterFactory.create()).build();

        return retrofit.create(RNVAPIService.class);
    }

}