package com.example.streak.technospandan;

import android.app.NotificationManager;
import android.graphics.Color;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by betterclever on 3/17/2017.
 */

public class FcmService extends FirebaseMessagingService {
    
    private static final String TAG = FcmService.class.getSimpleName();
    
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.i(TAG,"Received: "+ remoteMessage.toString());
        
        if(remoteMessage.getNotification()!=null) {
         
            Log.i(TAG,"Notification: " + remoteMessage.getNotification().getBody());
            
            NotificationCompat.Builder mBuilder =
                new NotificationCompat.Builder(this)
                    .setColor(Color.RED)
                    .setSmallIcon(R.drawable.ic_notifications_black_24dp)
                    .setContentTitle(remoteMessage.getNotification().getTitle())
                    .setContentText(remoteMessage.getNotification().getBody())
                    .setStyle(new NotificationCompat.BigTextStyle()
                        .bigText(remoteMessage.getNotification().getBody()));
    
            int mNotificationId = 001;
            NotificationManager mNotifyMgr =
                (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
         
            mNotifyMgr.notify(mNotificationId, mBuilder.build());
        }
        
        if(remoteMessage.getData()!=null){
            Log.i(TAG,"Data: "+remoteMessage.getData());
        }
    }
    
    @Override
    public void onMessageSent(String s) {
        super.onMessageSent(s);
        Log.d(TAG,"Sent: "+ s);
    }
}
