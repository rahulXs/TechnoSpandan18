package com.example.streak.technospandan.utils;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.model.EventCardModel;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class EventCardsUtils {

    public static Collection<EventCardModel> generateSportCards() {
        List<EventCardModel> eventCardModels = new ArrayList<>(5);

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("Robotics")
                    .withEventSubtitle("short desc")
                    .withImageResId(R.drawable.pic_card_1)
                    .withDayPart("category")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("coding")
                    .withEventSubtitle("short desc")
                    .withImageResId(R.drawable.pic_card_2)
                    .withDayPart("category")
                    .withBackgroundColorResId(R.color.mantis)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("hfsdjhjk")
                    .withEventSubtitle("shdfoijh")
                    .withImageResId(R.drawable.pic_card_3)
                    .withDayPart("hjdsfj")
                    .withBackgroundColorResId(R.color.usc_gold)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("jslkdfj")
                    .withEventSubtitle("jhsdfh")
                    .withImageResId(R.drawable.pic_card_5)
                    .withDayPart("hjdsfhj")
                    .withBackgroundColorResId(R.color.portland_orange)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("jhsdkjfhj")
                    .withEventSubtitle("hds")
                    .withImageResId(R.drawable.pic_card_4)
                    .withDayPart("jsdhfjh")
                    .withBackgroundColorResId(R.color.dodger_blue)
                    .build());

        }
        return eventCardModels;
    }
}
