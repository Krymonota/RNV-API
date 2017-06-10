# RNV-API
Java-based client implementation of the RNV (Rhein-Neckar-Verkehr) API.  
You can find the full documentation and request an API token on the [OpenData Portal of Rhein-Neckar-Verkehr](https://opendata.rnv-online.de/startinfo-api).

------

Getting Started
------
First of all, you need an API token that can be requested on the [OpenData Portal of Rhein-Neckar-Verkehr](https://opendata.rnv-online.de/startinfo-api).  
Once you have an API token, you can start by creating an instance of [RNVAPIService](https://github.com/Krymonota/RNV-API/blob/master/src/main/io/github/krymonota/rnvapi/RNVAPIService.java) by calling [RNVAPI#createAPIServiceProvider](https://github.com/Krymonota/RNV-API/blob/master/src/main/io/github/krymonota/rnvapi/RNVAPI.java#L16) and passing the API token as parameter.  
Then you can gather any information you want by calling the API methods in the [RNVAPIService](https://github.com/Krymonota/RNV-API/blob/master/src/main/io/github/krymonota/rnvapi/RNVAPIService.java) interface.
For more information how to call these API methods, [check out the examples](https://github.com/Krymonota/RNV-API/tree/master/src/examples/io/github/krymonota/rnvapi/examples).  


Interfaces
------
- Station Package
- Line Package
- Station Monitor
- Line Journey
- Station Info
- Journey Info
- News
- Ticker
- Canceled Lines


Dependencies ([Maven](https://maven.apache.org))
------
- [Lombok](https://projectlombok.org)
- [Retrofit](http://square.github.io/retrofit)
- [Gson](https://github.com/google/gson) / Gson-Converter for Retrofit
