package com.example.streak.technospandan.fragment;

import android.app.Activity;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.streak.technospandan.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class DescriptionFragment extends Fragment {

    @BindView(R.id.description_textview)
    TextView descriptionTextView;

    String description = "";

    public DescriptionFragment() {
    }

    public static DescriptionFragment newInstance() {

        Bundle args = new Bundle();

        DescriptionFragment fragment = new DescriptionFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_description, container, false);
        ButterKnife.bind(this, view);
        descriptionTextView.setText(description);
        return view;

    }

    public void setDescription(String description) {
        this.description = description;
        if(descriptionTextView!=null) {
            descriptionTextView.setText(description);
        }
    }
}
