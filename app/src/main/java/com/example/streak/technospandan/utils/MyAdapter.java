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


    private int image2[]={R.drawable.robowar,R.drawable.crypto,R.drawable.chemwizz,R.drawable.fumes,R.drawable.appathon,
            R.drawable.electromatrix,R.drawable.nirmaan,R.drawable.spellbee,R.drawable.thestage,R.drawable.debate,R.drawable.adwar,
            R.drawable.showbuzz,R.drawable.bandwar,R.drawable.pushup,R.drawable.skipping,R.drawable.cricket,R.drawable.badminton,
            R.drawable.chess,R.drawable.tt,R.drawable.bb};
    private int image3[]={R.drawable.junkyard,R.drawable.lfr,R.drawable.airstrike,R.drawable.treasurehunt,R.drawable.shayarana,
            R.drawable.dance,R.drawable.nn,R.drawable.ritambhara,R.drawable.cricket};
    private int image4[]={R.drawable.adwar,R.drawable.bandwar,R.drawable.openmic,R.drawable.viralvoice,R.drawable.dance,R.drawable.debate,
            R.drawable.storytelling,R.drawable.nn,R.drawable.thestage,R.drawable.home_background,R.drawable.ritambhara,
            R.drawable.shayarana,R.drawable.showbuzz,R.drawable.pic_card_3,R.drawable.stockking,R.drawable.treasurehunt,R.drawable.spellbee};
    private int image5[]={R.drawable.airstrike,R.drawable.nirmaan,R.drawable.robowar,R.drawable.roborace,R.drawable.fumes,R.drawable.chemwizz,
            R.drawable.codetrex,R.drawable.appathon,R.drawable.airstrike,R.drawable.lfr,R.drawable.crypto,R.drawable.codeplay,
            R.drawable.electrade,R.drawable.electromatrix,R.drawable.junkyard,R.drawable.tatva,R.drawable.pic_card_3,R.drawable.startup};
    private int image6[]={R.drawable.chess,R.drawable.tt,R.drawable.badminton,R.drawable.marathon,R.drawable.bb,R.drawable.slide3,R.drawable.cricket,
            R.drawable.langame,R.drawable.nn,R.drawable.langame};
    private int image7[]={R.drawable.vcnote,R.drawable.directornote,R.drawable.qr_code,R.drawable.startup};
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
        String s=mDataset[mDataset.length-1];
        if(s.equals("Chess"))
            holder.imageView.setImageResource(image[position]);
        else if(s.equals("BasketBall"))
            holder.imageView.setImageResource(image2[position]);
        else if(s.equals("Cricket"))
            holder.imageView.setImageResource(image3[position]);
        else if(s.equals("THE SPELLING BEE"))
            holder.imageView.setImageResource(image4[position]);
        else if(s.equals("Startup"))
            holder.imageView.setImageResource(image5[position]);
        else if(s.equals("TEST YOUR STRENGTH"))
            holder.imageView.setImageResource(image6[position]);
        else if(s.equals("CLOSING CEREMONY"))
            holder.imageView.setImageResource(image7[position]);

    }

    @Override
    public int getItemCount() {
        return mDataset.length;
    }
}