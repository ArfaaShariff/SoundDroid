package com.example.plank_arfaa.sounddroidapi;



import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.plank_arfaa.sounddroidapi.com.example.plank_arfaa.sounddroidapi.soundcloud.Track;
import com.squareup.picasso.Picasso;

import java.util.List;


/**
 * Created by plank-arfaa on 9/24/2015.
 */
public class TracksAdapter extends RecyclerView.Adapter<TracksAdapter.ViewHolder>{
    public class ViewHolder extends RecyclerView.ViewHolder{
        private final TextView titleTextView;
        private final ImageView thumbImageView;


        ViewHolder(View v){
            super(v);
            titleTextView= (TextView)v.findViewById(R.id.track_title);
            thumbImageView = (ImageView)v.findViewById(R.id.track_thumbnail);
        }
    }

    private List<Track> mTracks;
    private Context mContext;

    TracksAdapter(Context context, List<Track> tracks){
        mContext = context;
        mTracks = tracks;
    }

    @Override
    public int getItemCount() {
        return mTracks.size();
    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Track track = mTracks.get(i);
        viewHolder.titleTextView.setText(track.getTitle());

        Picasso.with(mContext).load(track.getAvatarURL()).into(viewHolder.thumbImageView);

    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext())
                .inflate(R.layout.track_row, viewGroup, false);
        return new ViewHolder(v);
    }
}
