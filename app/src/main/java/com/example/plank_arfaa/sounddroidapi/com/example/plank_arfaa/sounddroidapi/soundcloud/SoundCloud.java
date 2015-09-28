package com.example.plank_arfaa.sounddroidapi.com.example.plank_arfaa.sounddroidapi.soundcloud;

import retrofit.RestAdapter;

/**
 * Created by plank-arfaa on 9/24/2015.
 */
public class SoundCloud {
    private static final String API_URl= "http://api.soundcloud.com";

    private static final RestAdapter REST_ADAPTER = new RestAdapter.Builder()
            .setEndpoint(API_URl)
            .build();
    private static final SoundCloudService SERVICE = REST_ADAPTER.create(SoundCloudService.class);

    public static SoundCloudService getService()
    {
        return SERVICE;

    }
}
