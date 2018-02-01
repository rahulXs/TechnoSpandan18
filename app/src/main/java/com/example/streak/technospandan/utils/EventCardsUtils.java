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

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("Singing")
                    .withImageResId(R.drawable.singing)
                    .withDayPart("Cultural")
                    .withBackgroundColorResId(R.color.portland_orange)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("Dancing")
                    .withImageResId(R.drawable.dancing)
                    .withDayPart("Cultural")
                    .withBackgroundColorResId(R.color.dodger_blue)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("Sports group")
                    .withImageResId(R.drawable.cricket)
                    .withDayPart("Sports")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("Sports Solo")
                    .withImageResId(R.drawable.badminton)
                    .withDayPart("sports")
                    .withBackgroundColorResId(R.color.mantis)
                    .build());

        }
        return eventCardModels;
    }
}
