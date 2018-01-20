package com.example.streak.technospandan.fragment;

/**
 * Created by streak on 19/1/18.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.utils.ViewPagerAdapter;

public class NotificationsFragment extends Fragment {

    static  int flag=0;                     //to make app not to crash
    int currentPage = 0;
    ViewPager viewPager;

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
        return inflater.inflate(R.layout.fragment_notifications, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        getActivity().setTitle("Notifications");
        final String text = getArguments().getString(EXTRA_TEXT);
        TextView textView = view.findViewById(R.id.text);
        textView.setText(text);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View v) {
                Toast.makeText(v.getContext(), text, Toast.LENGTH_SHORT).show();
            }
        });


        final Handler handler = new Handler();
        final Runnable Update = new Runnable() {
            public void run() {
                if (currentPage == (new ViewPagerAdapter(getActivity()).getCount())) {
                    currentPage = 0;
                }
                if (flag==0)
                    viewPager.setCurrentItem(currentPage++, true);
                else
                    onDestroyView();
            }
        };
    }
}
