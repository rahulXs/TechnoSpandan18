package com.example.streak.technospandan.utils;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.model.EventCardModel;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CEventCardsUtils {

    public static Collection<EventCardModel> generateSportCards() {
        List<EventCardModel> eventCardModels = new ArrayList<>(5);

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("Robotics")
                    .withImageResId(R.drawable.robotics)
                    .withDayPart("Technical")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("Coding")
                    .withImageResId(R.drawable.coding)
                    .withDayPart("Technical")
                    .withBackgroundColorResId(R.color.mantis)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("Electronics")
                    .withImageResId(R.drawable.pic_card_3)
                    .withDayPart("Technical")
                    .withBackgroundColorResId(R.color.usc_gold)
                    .build());

        }

        return eventCardModels;
    }
}
