package com.example.streak.technospandan.activity;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.Fragment;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.animation.GlideAnimation;
import com.bumptech.glide.request.target.SimpleTarget;
import com.example.streak.technospandan.R;
import com.example.streak.technospandan.fragment.DescriptionFragment;
import com.example.streak.technospandan.fragment.ExtraInfoFragment;
import com.example.streak.technospandan.fragment.OrganizerFragment;
import com.example.streak.technospandan.fragment.TimeDateFragment;
import com.example.streak.technospandan.fragment.UpdatesFragment;
import com.example.streak.technospandan.model.Event;
import com.firebase.ui.storage.images.FirebaseImageLoader;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import eu.long1.spacetablayout.SpaceTabLayout;
import jp.wasabeef.blurry.Blurry;

public class EventDetailActivity extends AppCompatActivity implements ValueEventListener {
    
    @BindView(R.id.viewPager)
    ViewPager viewPager;
    @BindView(R.id.spaceTabLayout)
    SpaceTabLayout spaceTabLayout;
    @BindView(R.id.eventImageView)
    ImageView eventImageView;
    @BindView(R.id.event_image_view_second)
    ImageView eventImageViewSecond;
    @BindView(R.id.eventTitleTextView)
    TextView eventTitleTextView;
    
    DatabaseReference eventDbRef;
    StorageReference imageStorageRef;
    String eventID;
    
    TimeDateFragment timeDateFragment;
    DescriptionFragment descriptionFragment;
    OrganizerFragment organizerFragment;
    ExtraInfoFragment extraInfoFragment;
    UpdatesFragment updatesFragment;
    
    ProgressDialog progressDialog;
    
    private static final int CALL_PERMISSSION_STATUS = 123;
    private String numberToCall;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event_detail);
        ButterKnife.bind(this);
    
        progressDialog = new ProgressDialog(this);
        progressDialog.setProgressStyle(ProgressDialog.STYLE_SPINNER);
        progressDialog.setMessage("Loading");
        progressDialog.show();
        
        eventID = getIntent().getStringExtra("eventID");
        init(savedInstanceState);
        
        eventDbRef = FirebaseDatabase.getInstance().getReference().child("events").child(eventID);
        
        eventDbRef.addValueEventListener(this);
    }
    
    private void init(Bundle savedInstanceState) {
        
        String extraInfoRefPath = "events/"+eventID+"/extrainfo";
        
        List<Fragment> fragmentList = new ArrayList<>();
        
        timeDateFragment = TimeDateFragment.newInstance();
        descriptionFragment = DescriptionFragment.newInstance();
        organizerFragment = OrganizerFragment.newInstance();
        extraInfoFragment = ExtraInfoFragment.newInstance(extraInfoRefPath);
        updatesFragment = UpdatesFragment.newInstance(eventID);
        
        fragmentList.add(timeDateFragment);
        fragmentList.add(descriptionFragment);
        fragmentList.add(organizerFragment);
        fragmentList.add(extraInfoFragment);
        fragmentList.add(updatesFragment);
        
        spaceTabLayout.initialize(viewPager, getSupportFragmentManager(),
            fragmentList, savedInstanceState);
        
    }
    
    @Override
    public void onDataChange(DataSnapshot dataSnapshot) {
        
        Event event = dataSnapshot.getValue(Event.class);
        imageStorageRef = FirebaseStorage.getInstance().getReference().child(event.getImage());
        
        descriptionFragment.setDescription(event.getDescription());
        timeDateFragment.update(event);
        organizerFragment.update(event.getOrganizers());
        eventTitleTextView.setText(event.getName());
        
        Glide
            .with(this)
            .using(new FirebaseImageLoader())
            .load(imageStorageRef)
            .asBitmap()
            .into(new SimpleTarget<Bitmap>(500,500) {
                @Override
                public void onResourceReady(Bitmap resource, GlideAnimation glideAnimation) {
                    Blurry.with(EventDetailActivity.this)
                        .color(Color.argb(120, 0, 0, 0))
                        .from(resource)
                        .into(eventImageView);
                    
                    eventImageViewSecond.setImageBitmap(resource);
                    dismissLoadingDialog();
                }
            });
    }
    
    private void dismissLoadingDialog() {
        if(progressDialog!=null){
            progressDialog.dismiss();
        }
    }
    
    @Override
    public void onCancelled(DatabaseError databaseError) {
        
    }
    
    public void call(String number){
        
        numberToCall = number;
        
        Intent intent = new Intent(Intent.ACTION_CALL);
        intent.setData(Uri.parse("tel:" + number));
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED) {
            ActivityCompat.requestPermissions(this,
                new String[]{Manifest.permission.CALL_PHONE},CALL_PERMISSSION_STATUS);
            return;
        }
        startActivity(intent);
    }
    
    @Override
    public void onRequestPermissionsResult(int requestCode,
                                           String permissions[], int[] grantResults) {
        
        switch (requestCode) {
            case CALL_PERMISSSION_STATUS: {
                if (grantResults.length > 0
                    && grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                    
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + numberToCall));
                    startActivity(intent);
                    
                } else {
                    Toast.makeText(this,"Calling permission not granted. Grant permission in Settings",Toast.LENGTH_SHORT);
                }
                return;
            }
        }
    }
    
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        overridePendingTransition(R.anim.slide_in, R.anim.slide_out);
    }
}
