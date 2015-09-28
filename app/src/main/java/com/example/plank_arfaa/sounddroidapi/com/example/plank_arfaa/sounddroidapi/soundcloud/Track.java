package com.example.plank_arfaa.sounddroidapi.com.example.plank_arfaa.sounddroidapi.soundcloud;

import com.google.gson.annotations.SerializedName;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by plank-arfaa on 9/24/2015.
 */
public class Track {
    @SerializedName("title")
    private String mTitle;

    @SerializedName("stream_url")
    private String mStreamURL;

    @SerializedName("id")
    private int mID;

    @SerializedName("artwork_url")
    private String artworkURL;

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getStreamURL() {
        return mStreamURL;
    }

    public void setStreamURL(String streamURL) {
        mStreamURL = streamURL;
    }

    public int getID() {
        return mID;
    }

    public void setID(int ID) {
        mID = ID;
    }

    public String getArtworkURL() {
        return artworkURL;
    }

    public String getAvatarURL(){
        String avatarURL = artworkURL;
        if(avatarURL !=null){
            avatarURL = avatarURL.replace("large","tiny");
        }
        return avatarURL;
    }

    /*  public static Track parse(JSONObject jsonObject){
        Track t = new Track();
        try{
        t.setTitle(jsonObject.getString("title"));
        }catch (JSONException e){
    }
    return t;

}*/
}
