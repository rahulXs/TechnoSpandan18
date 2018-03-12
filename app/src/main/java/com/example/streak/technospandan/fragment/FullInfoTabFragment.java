package com.example.streak.technospandan.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.adapters.PagerAdapter;
import com.example.streak.technospandan.model.AllEvents;
import com.example.streak.technospandan.model.EventCardModel;
import com.example.streak.technospandan.model.EventsModel;
import com.example.streak.technospandan.utils.MyAdapter2;

import java.util.ArrayList;
import java.util.List;

public class FullInfoTabFragment extends Fragment {

    private static final String EXTRA_SRORT_CARD_MODEL = "EXTRA_SRORT_CARD_MODEL";
    //    String transitionTag;
    private EventCardModel mEventCardModel;
    private Toolbar toolbar;
    private ImageView ivPhoto;
    private RecyclerView rvAthletics;

    public static FullInfoTabFragment newInstance(EventCardModel eventCardModel) {
        FullInfoTabFragment fragment = new FullInfoTabFragment();
        Bundle args = new Bundle();
        args.putParcelable(EXTRA_SRORT_CARD_MODEL, eventCardModel);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mEventCardModel = getArguments().getParcelable(EXTRA_SRORT_CARD_MODEL);
        }
        if (savedInstanceState != null) {
            mEventCardModel = savedInstanceState.getParcelable(EXTRA_SRORT_CARD_MODEL);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_full_info, container, false);
        toolbar = view.findViewById(R.id.toolbar);
        ivPhoto =  view.findViewById(R.id.ivPhoto);
        rvAthletics=view.findViewById(R.id.rv);
        /*rvAthletics = view.findViewById(R.id.rvAthletics);*/
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        toolbar.setTitle(mEventCardModel.getEventTitle());
        //toolbar.setNavigationIcon(R.drawable.ic_back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getActivity().onBackPressed();
            }
        });
        toolbar.setBackgroundColor(ContextCompat.getColor(getContext(), mEventCardModel.getBackgroundColorResId()));
        ivPhoto.setImageResource(mEventCardModel.getImageResId());
        /*List<EventsModel> items = new ArrayList<>();
       // for (int i = 10; i > 0; i--) {
       //     int points = i * 100;
            items.add(new EventsModel("Event name here", AllEvents.CODING));
            items.add(new EventsModel("event name herer", AllEvents.ROBOTICS));
            items.add(new EventsModel("evente name here", AllEvents.ELECTRONICS));
        //}

        MyAdapter2 myAdapter2 = new MyAdapter2();
        myAdapter2.addItems(items);

        rvAthletics.setAdapter(myAdapter2);
        rvAthletics.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        rvAthletics.setItemAnimator(new DefaultItemAnimator());
        rvAthletics.addItemDecoration(new DividerItemDecoration(getContext()));
*/

        PagerAdapter pagerAdapter=new PagerAdapter(mEventCardModel.getEventTitle());
        rvAthletics.setAdapter(pagerAdapter);
        rvAthletics.setLayoutManager(new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false));
        rvAthletics.setItemAnimator(new DefaultItemAnimator());
        rvAthletics.addItemDecoration(new DividerItemDecoration(getContext()));


    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        outState.putParcelable(EXTRA_SRORT_CARD_MODEL, mEventCardModel);
        super.onSaveInstanceState(outState);
    }

    private static class DividerItemDecoration extends RecyclerView.ItemDecoration {

        private static final int[] ATTRS = new int[]{android.R.attr.listDivider};

        private Drawable mDivider;

        /**
         * Default divider will be used
         */
        public DividerItemDecoration(Context context) {
            final TypedArray styledAttributes = context.obtainStyledAttributes(ATTRS);
            mDivider = styledAttributes.getDrawable(0);
            styledAttributes.recycle();
        }

        public DividerItemDecoration(Context context, int resId) {
            mDivider = ContextCompat.getDrawable(context, resId);
        }

        @Override
        public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
            int left = parent.getPaddingLeft();
            int right = parent.getWidth() - parent.getPaddingRight();

            int childCount = parent.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View child = parent.getChildAt(i);

                RecyclerView.LayoutParams params = (RecyclerView.LayoutParams) child.getLayoutParams();

                int top = child.getBottom() + params.bottomMargin;
                int bottom = top + mDivider.getIntrinsicHeight();

                mDivider.setBounds(left, top, right, bottom);
                mDivider.draw(c);
            }
        }
    }
}
