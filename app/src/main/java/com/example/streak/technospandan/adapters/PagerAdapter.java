package com.example.streak.technospandan.adapters;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.utils.MyAdapter;

/**
 * Created by PIYUSH on 12-03-2018.
 */

public class PagerAdapter extends RecyclerView.Adapter<PagerAdapter.MyPagerAdapter>{
    String title;
    String technical[] = new String[]{"Air Strike", "Nirmaan", "The Robo Knight", "Robo Race", "Fumes" , "Chemwizz" , "Codetrex","App-athon", "Rule the Sky", "LFR", "Crypto" , "Play with codes", "Electrade", "Electromatrix", "The Junkyard" , "Tatva", "Quiz" , "Startup"};
    String location[] = new String[]{" 7 PM - 9 PM \n23-03-2018","10-12"};
    String About[] = new String[]{"Rule the unbound sky with the RC Flyer ","Splash"};
    String organiser[] = new String[]{"Avinash Tripathi\nHarshit Verma","shjdh"};

    public static class MyPagerAdapter extends RecyclerView.ViewHolder {
        private CardView mCardView;
        private TextView mTextView,mTextView2,mTextView3;
        private MyPagerAdapter(View v) {
            super(v);

            mCardView = v.findViewById(R.id.card);
            mTextView = v.findViewById(R.id.about);
            mTextView2 =v.findViewById(R.id.location);
            mTextView3=v.findViewById(R.id.organizer);
        }
    }
    public PagerAdapter(String title) {
        this.title=title;
    }



    @Override
    public PagerAdapter.MyPagerAdapter onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.cardn_item, parent, false);
        PagerAdapter.MyPagerAdapter vh = new MyPagerAdapter(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(PagerAdapter.MyPagerAdapter holder, int position) {

        for(int i=0;i<technical.length;i++){
            if(title.equals(technical[i])){
                holder.mTextView.setText(About[i]);
                holder.mTextView2.setText(location[i]);
                holder.mTextView3.setText(organiser[i]);
                break;
            }

        }
        /*
        holder.mTextView.setText(About[position]);
        holder.mTextView2.setText(location[position]);
        holder.mCardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String currentValue = mDataset[position];
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
*/
    }

    @Override
    public int getItemCount() {
        return 1;
    }
}
