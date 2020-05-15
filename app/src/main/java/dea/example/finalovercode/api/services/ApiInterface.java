package dea.example.finalovercode.api.services;


import java.util.List;

import dea.example.finalovercode.api.models.Album;
import dea.example.finalovercode.api.models.Envelope;
import dea.example.finalovercode.api.models.Tracks;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("v3.0/albums/")
    Call<Envelope<List<Album>>> getLagu(@Query("client_id") String client_id, @Query("format") String format, @Query("name") String name);

    @GET("v3.0/tracks/")
    Call<Envelope<List<Tracks>>> getTracks(@Query("client_id") String client_id, @Query("format") String format, @Query("name") String name);

}
