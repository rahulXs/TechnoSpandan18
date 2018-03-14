package com.example.streak.technospandan.fragment;

/**
 * Created by streak on 19/1/18.
 */
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.model.Update;
import com.example.streak.technospandan.utils.ViewPagerAdapter;
import com.example.streak.technospandan.viewholder.UpdateViewholder;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;

public class NotificationsFragment extends Fragment {


    static int flag=0;                     //to make app not to crash
    int currentPage = 0;
    ViewPager viewPager;

    RecyclerView recyclerView;

    private static final String EXTRA_TEXT = "text";

    public static void setFlag(int f){
        flag = f;
    }


    public static NotificationsFragment createFor(String text) {
        NotificationsFragment fragment = new NotificationsFragment();
        Bundle args = new Bundle();
        args.putString(EXTRA_TEXT, text);
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Notifications");
        View v =  inflater.inflate(R.layout.fragment_updates, container, false);
        recyclerView = v.findViewById(R.id.recyclerView);

        DatabaseReference ref = FirebaseDatabase.getInstance().getReference("updates");
        Query query = ref;
        FirebaseRecyclerAdapter adapter = new FirebaseRecyclerAdapter<Update,UpdateViewholder>(
                Update.class,
                R.layout.update_card,
                UpdateViewholder.class,
                query
        ) {
            @Override
            protected void populateViewHolder(UpdateViewholder viewHolder, final Update model, int position) {
                viewHolder.setData(model);

                }

            };
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

        return v;
    }
}
