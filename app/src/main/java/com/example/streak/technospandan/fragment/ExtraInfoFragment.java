package com.example.streak.technospandan.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.model.ExtraInfo;
import com.example.streak.technospandan.viewholder.ExtraInfoViewHolder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by betterclever on 14/03/2017
 */

public class ExtraInfoFragment extends Fragment {
    
    String refPath;
    DatabaseReference dbRef;
    
    @BindView(R.id.extra_info_recycler_view)
    RecyclerView extraInfoRecyclerView;
    
    public ExtraInfoFragment() {
        // Required empty public constructor
    }
    
    public static ExtraInfoFragment newInstance(String refPath) {
        
        Bundle args = new Bundle();
        args.putString("refPath",refPath);
        
        ExtraInfoFragment fragment = new ExtraInfoFragment();
        fragment.setArguments(args);
        return fragment;
    }
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_extra_info, container, false);
        ButterKnife.bind(this, view);
        
        refPath = getArguments().getString("refPath");
        dbRef = FirebaseDatabase.getInstance().getReference().child(refPath);
        
        dbRef.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                Log.d("ds",dataSnapshot.toString());
                Log.d("ds",dataSnapshot.toString());
            }
    
            @Override
            public void onCancelled(DatabaseError databaseError) {
        
            }
        });
        
        RecyclerView.Adapter adapter = new FirebaseRecyclerAdapter<ExtraInfo,ExtraInfoViewHolder>(
            ExtraInfo.class,
            R.layout.item_extra_info,
            ExtraInfoViewHolder.class,
            dbRef
        ) {
            @Override
            protected void populateViewHolder(ExtraInfoViewHolder viewHolder, ExtraInfo model, int position) {
                viewHolder.updateData(model);
            }
        };
        
        extraInfoRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        extraInfoRecyclerView.setAdapter(adapter);
        
        return view;
    }
    
}
