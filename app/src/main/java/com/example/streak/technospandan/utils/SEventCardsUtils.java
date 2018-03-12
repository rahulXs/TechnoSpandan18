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
                    .withImageResId(R.drawable.tt)
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
                    .withEventTitle("BASKETBALL")
                    .withImageResId(R.drawable.bb)
                    .withDayPart("SPORTS")
                    .withBackgroundColorResId(R.color.dodger_blue)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("STREET SOCCER")
                    .withImageResId(R.drawable.pic_card_3)
                    .withDayPart("SPORTS")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("CRICKET")
                    .withImageResId(R.drawable.cricket)
                    .withDayPart("SPORTS")
                    .withBackgroundColorResId(R.color.mantis)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("COUNTER STRIKE")
                    .withImageResId(R.drawable.langame)
                    .withDayPart("SPORTS")
                    .withBackgroundColorResId(R.color.usc_gold)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("NEED FOR SPEED")
                    .withImageResId(R.drawable.langame)
                    .withDayPart("SPORTS")
                    .withBackgroundColorResId(R.color.portland_orange)
                    .build());

        }

        return eventCardModels;
    }
}
