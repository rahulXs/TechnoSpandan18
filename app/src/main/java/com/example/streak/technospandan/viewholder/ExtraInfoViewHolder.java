package com.example.streak.technospandan.viewholder;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.model.ExtraInfo;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by betterclever on 3/14/2017.
 */

public class ExtraInfoViewHolder extends RecyclerView.ViewHolder {
    
    @BindView(R.id.info_title)
    TextView infoTitleTV;
    
    @BindView(R.id.info_detail)
    TextView infoDetailTV;
    
    public ExtraInfoViewHolder(View itemView) {
        super(itemView);
        ButterKnife.bind(this,itemView);
    }
    
    public void updateData(ExtraInfo info){
        Log.d("ExtraInfoVH",info.getInfoTitle());
        
        infoTitleTV.setText(info.getInfoTitle());
        infoDetailTV.setText(info.getInfoDetail());
    }
}
