package com.example.streak.technospandan.fragment;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bumptech.glide.Glide;
import com.example.streak.technospandan.R;
import com.example.streak.technospandan.activity.EventDetailActivity;
import com.example.streak.technospandan.model.Event;
import com.example.streak.technospandan.viewholder.EventItemViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

public class DaysView extends Fragment {

    public static final String TAG = DaysView.class.getSimpleName();
    FirebaseRecyclerAdapter firebaseRecyclerAdapter;

    String date = "24-03-2017";

    public DaysView() {}

    public static DaysView newInstance(String date) {

        Bundle args = new Bundle();

        args.putString("DATE",date);

        DaysView fragment = new DaysView();
        fragment.setArguments(args);

        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        date = getArguments().getString("DATE");

        View v = inflater.inflate(R.layout.fragment_days_view, container, false);

        final RecyclerView recyclerView = v.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);

        DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("events");
        final Query query = databaseReference.orderByChild("date").equalTo(date);
        
        firebaseRecyclerAdapter =
                new FirebaseRecyclerAdapter<Event,EventItemViewHolder> (
                        Event.class,
                        R.layout.item_days_view,
                        EventItemViewHolder.class,
                        query) {
            @Override
            protected void populateViewHolder(EventItemViewHolder viewHolder,
                                              final Event model, final int position) {
                
                StorageReference ref = FirebaseStorage.getInstance().getReference().child(model.getImage());
                
                Log.d(TAG,ref.toString());
    
                Glide.with(getActivity())
                        .using(new FirebaseImageLoader())
                        .load(ref)
                        .into(viewHolder.getEventImageView());


                viewHolder.getDateTextView().setText(model.getTime());
                viewHolder.getEventNameTextView().setText(model.getName());
                viewHolder.getEventImageView().setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(getActivity(), EventDetailActivity.class);
                        String id = firebaseRecyclerAdapter.getRef(position).getKey();
                        intent.putExtra("eventID",id);
                        getContext().startActivity(intent);
                        ((Activity) getContext()).overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
                    }
                });

            }
        };

        recyclerView.setLayoutManager(new GridLayoutManager(getContext(),2));
        recyclerView.setAdapter(firebaseRecyclerAdapter);

        return v;
    }

}
