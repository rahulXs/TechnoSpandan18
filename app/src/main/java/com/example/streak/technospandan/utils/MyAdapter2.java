package com.example.streak.technospandan.utils;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.model.EventsModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyAdapter2 extends RecyclerView.Adapter<MyAdapter2.AthleticHolder> {

    private final List<EventsModel> mItems = new ArrayList<>();

    public void addItems(@NonNull Collection<EventsModel> items) {
        mItems.addAll(items);
        notifyItemRangeInserted(mItems.size() - items.size() - 1, items.size());
    }

    public void clear() {
        mItems.clear();
        notifyDataSetChanged();
    }

    @Override
    public AthleticHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_score, parent, false);
        return new AthleticHolder(view);
    }

    @Override
    public void onBindViewHolder(AthleticHolder holder, int position) {
        EventsModel item = mItems.get(position);
        holder.tvCountry.setText(item.getEvent().getEvent());
        switch (item.getEvent()) {
            case ROBOTICS: {
                holder.ivAthleticFlag.setImageResource(R.drawable.categ);
                break;
            }
            case ELECTRONICS: {
                holder.ivAthleticFlag.setImageResource(R.drawable.categ);
                break;
            }
            case CODING: {
                holder.ivAthleticFlag.setImageResource(R.drawable.categ);
                break;
            }
        }

    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class AthleticHolder extends RecyclerView.ViewHolder {
        ImageView ivAthleticFlag;
        TextView tvCountry;


        AthleticHolder(View itemView) {
            super(itemView);
            ivAthleticFlag = (ImageView) itemView.findViewById(R.id.ivAthleticFlag);
            tvCountry = (TextView) itemView.findViewById(R.id.tvCountry);
        }
    }
}
