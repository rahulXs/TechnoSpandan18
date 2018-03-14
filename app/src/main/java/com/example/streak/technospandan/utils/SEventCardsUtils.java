package com.example.streak.technospandan.utils;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.model.EventCardModel;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class SEventCardsUtils {

    public static Collection<EventCardModel> generateSportCards() {
        List<EventCardModel> eventCardModels = new ArrayList<>(5);

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("CHECKMATE")
                    .withImageResId(R.drawable.chess)
                    .withDayPart("SPORTS")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("TABLE TENNIS")
                    .withImageResId(R.drawable.tabletennis)
                    .withDayPart("SPORTS")
                    .withBackgroundColorResId(R.color.mantis)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("BADMINTON")
                    .withImageResId(R.drawable.badminton)
                    .withDayPart("SPORTS")
                    .withBackgroundColorResId(R.color.usc_gold)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("MARATHON")
                    .withImageResId(R.drawable.marathon)
                    .withDayPart("SPORTS")
                    .withBackgroundColorResId(R.color.portland_orange)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("STREET SOCCER")
                    .withImageResId(R.drawable.streetsoccer)
                    .withDayPart("SPORTS")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("LAN GAMING")
                    .withImageResId(R.drawable.langame)
                    .withDayPart("SPORTS")
                    .withBackgroundColorResId(R.color.portland_orange)
                    .build());

        }

        return eventCardModels;
    }
}
