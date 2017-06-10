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
            String result = new Gson().toJson(apiService.getAllLines().execute().body());
            
            System.out.println(result);
        } catch (IOException e) {
         // Something went wrong
            e.printStackTrace();
        }
    }

}