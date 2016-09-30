package com.example.wesley.myjobs.api;

import com.google.gson.JsonElement;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

/**
 * Created by wesley on 9/7/16.
 */
public interface EventsApi {
    @GET("u/20501812/MyJobsService/index")
    Observable<JsonElement> getJSONDataFromURL();

    @GET("/{path}")
    Observable<JsonElement> getBaseJSONDataFromURL(@Path("path") String path);
}
