package com.example.streak.technospandan.utils;
import android.content.Context;
import android.media.Image;
import android.provider.MediaStore;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;
import java.util.List;
import com.example.streak.technospandan.R;


public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private String[] mDataset;

    private int[] image ={R.drawable.vcnote,
            R.drawable.directornote,
            R.drawable.qr_code,
            R.drawable.startup,
            R.drawable.chemwizz,
            R.drawable.codetrex,
            R.drawable.roborace,
            R.drawable.electrade,
            R.drawable.rocketwar,
            R.drawable.langame,
            R.drawable.codeplay,
            R.drawable.tatva,
            R.drawable.constructo,
            R.drawable.openmic,
            R.drawable.viralvoice,
            R.drawable.stockking,
            R.drawable.storytelling,
            R.drawable.adwar,
            R.drawable.dance,
            R.drawable.marathon,
            R.drawable.pushup,
            R.drawable.skipping,
            R.drawable.cricket,
            R.drawable.badminton,
            R.drawable.chess};

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        private ImageView imageView;
        private CardView mCardView;
        private TextView mTextView;
        private MyViewHolder(View v) {
            super(v);

            mCardView = v.findViewById(R.id.card_view);
            mTextView = v.findViewById(R.id.tv_text);
            imageView =v.findViewById(R.id.iv_image);
        }
    }
    public MyAdapter(String[] myDataset) {
        mDataset = myDataset;
    }

    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent,
                                                     int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item, parent, false);
        MyViewHolder vh = new MyViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, final int position) {
        holder.mTextView.setText(mDataset[position]);
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = mDataset[position];
                Log.d("CardView", "CardView Clicked: " + currentValue);
            }
        });
        holder.imageView.setImageResource(image[position]);
    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}