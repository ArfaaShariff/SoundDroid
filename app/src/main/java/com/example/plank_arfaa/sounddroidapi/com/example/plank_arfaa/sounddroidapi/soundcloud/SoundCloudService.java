package com.example.plank_arfaa.sounddroidapi.com.example.plank_arfaa.sounddroidapi.soundcloud;

import java.util.List;

import retrofit.Callback;
import retrofit.http.GET;
import retrofit.http.Query;

/**
 * Created by plank-arfaa on 9/24/2015.
 */
public interface SoundCloudService
{
    static final String CLIENT_ID ="95907cf282fc2dbb3d242cfd5ca9616a";
    @GET("/tracks?client_id="+CLIENT_ID)
    public void searchSongs(@Query("q")String query, Callback<List<Track>> cb);


}
