package io.github.krymonota.rnvapi;

import io.github.krymonota.rnvapi.canceled.lines.CanceledLineTransfer;
import io.github.krymonota.rnvapi.info.journey.JourneyInfoTransfer;
import io.github.krymonota.rnvapi.info.station.StationInfoTransfer;
import io.github.krymonota.rnvapi.lines.Line;
import io.github.krymonota.rnvapi.lines.LineJourney;
import io.github.krymonota.rnvapi.maps.MapEntity;
import io.github.krymonota.rnvapi.news.NewsEntry;
import io.github.krymonota.rnvapi.stationmonitor.Journey;
import io.github.krymonota.rnvapi.stations.StationPackage;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

/**
 * Interface containing all callable api routes.
 * @since 1.0.0
 * @version 1.0.1
 */
public interface RNVAPIService {

    @GET("regions/rnv/modules/stations/packages/{id}")
    Call<StationPackage> getStationPackage(
            @Path("id") int id);

    @GET("regions/rnv/modules/lines/all")
    Call<List<Line>> getAllLines();

    @GET("regions/rnv/modules/lines/allJourney")
    Call<List<LineJourney>> getAllLineJourneys();

    @GET("regions/rnv/modules/lines")
    Call<LineJourney> getLineJourney(
            @Query("lineID") String lineID,
            @Query("stopIndex") int stopIndex,
            @Query("time") String time,
            @Query("tourType") String tourType,
            @Query("tourID") String tourID,
            @Query("hafasID") String hafasID);

    @GET("regions/rnv/modules/stationmonitor/element")
    Call<Journey> getStationMonitor(
            @Query("hafasID") String hafasID,
            @Query("mode") String mode,
            @Query("time") String time,
            @Query("poles") String poles,
            @Query("needPlatformDetail") String needPlatformDetail);

    @GET("regions/rnv/modules/canceled/line")
    Call<List<CanceledLineTransfer>> getCanceledLines(
            @Query("line") String line,
            @Query("departureTime") String departureName);

    @GET("regions/rnv/modules/info/station")
    Call<List<StationInfoTransfer>> getStationInfo(
            @Query("lines") String lines,
            @Query("hafasID") String hafasID,
            @Query("departureTime") String departureName);

    @GET("regions/rnv/modules/info/station")
    Call<List<JourneyInfoTransfer>> getJourneyInfo(
            @Query("hafasID") String hafasID,
            @Query("poles") String poles,
            @Query("departureTime") String departureName);

    @GET("regions/rnv/modules/news")
    Call<List<NewsEntry>> getNewsEntries();

    @GET("regions/rnv/modules/ticker")
    Call<List<NewsEntry>> getTickerEntries(
            @Query("lines") String lines);

    @GET("regions/rnv/modules/maps")
    Call<List<MapEntity>> getMaps(
            @Query("thumbnailSize") int thumbnailSize,
            @Query("format") String format);

}
