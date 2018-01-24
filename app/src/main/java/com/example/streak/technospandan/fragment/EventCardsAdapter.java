package com.example.streak.technospandan.fragment;
import android.content.Context;
import android.os.Build;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.model.EventCardModel;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EventCardsAdapter extends RecyclerView.Adapter<EventCardsAdapter.SportCardViewHolder> {
    private final List<EventCardModel> mItems = new ArrayList<>();
    private Context mContext;
    private OnItemClickListener mOnItemClickListener;

    EventCardsAdapter(Context context) {
        mContext = context;
    }

    public boolean add(EventCardModel item) {
        boolean isAdded = mItems.add(item);
        if (isAdded) {
            notifyDataSetChanged();
        }
        return isAdded;
    }

    boolean addAll(Collection<EventCardModel> items) {
        boolean isAdded = mItems.addAll(items);
        if (isAdded) {
            notifyDataSetChanged();
        }
        return isAdded;
    }

    public void clear() {
        mItems.clear();
        notifyDataSetChanged();
    }

    @Override
    public SportCardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card, parent, false);
        return new SportCardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final SportCardViewHolder holder, int position) {
        EventCardModel item = mItems.get(position);
        holder.tvEventTitle.setText(item.getEventTitle());
        holder.tvEventSubtitle.setText(item.getEventSubtitle());
        holder.ivEventPreview.setImageResource(item.getImageResId());
        holder.tvDayPart.setText(item.getDayPart());

        ((CardView) holder.itemView).setCardBackgroundColor(ContextCompat.getColor(mContext, item.getBackgroundColorResId()));


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            holder.ivEventPreview.setTransitionName("shared" + String.valueOf(position));
        }

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mOnItemClickListener != null) {
                    mOnItemClickListener.onItemClicked(holder.getAdapterPosition(), holder.ivEventPreview);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    public OnItemClickListener getOnItemClickListener() {
        return mOnItemClickListener;
    }

    void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        mOnItemClickListener = onItemClickListener;
    }

    EventCardModel getModelByPos(int pos) {
        return mItems.get(pos);

    }

    interface OnItemClickListener {
        void onItemClicked(int pos, View view);
    }

    class SportCardViewHolder extends RecyclerView.ViewHolder {

        final TextView tvEventTitle;
        final TextView tvEventSubtitle;
        final TextView tvDayPart;
        ImageView ivEventPreview;

        SportCardViewHolder(View itemView) {
            super(itemView);
            tvEventTitle = (TextView) itemView.findViewById(R.id.tvEventTitle);
            tvEventSubtitle = (TextView) itemView.findViewById(R.id.tvEventSubtitle);
            ivEventPreview = (ImageView) itemView.findViewById(R.id.ivEventPreview);
            tvDayPart = (TextView) itemView.findViewById(R.id.tvDayPart);
        }
    }
}
