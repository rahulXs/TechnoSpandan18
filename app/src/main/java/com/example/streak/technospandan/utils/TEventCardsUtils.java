package com.example.streak.technospandan.utils;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.model.EventCardModel;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TEventCardsUtils {

    public static Collection<EventCardModel> generateSportCards() {
        List<EventCardModel> eventCardModels = new ArrayList<>(5);

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("AIR STRIKE")
                    .withImageResId(R.drawable.airstrike)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("NIRMAAN")
                    .withImageResId(R.drawable.nirmaan)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.mantis)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("THE ROBO KNIGHT")
                    .withImageResId(R.drawable.robowar)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.usc_gold)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("ROBORACE")
                    .withImageResId(R.drawable.roborace)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.portland_orange)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("FUMES")
                    .withImageResId(R.drawable.fumes)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.dodger_blue)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("CHEMWIZZ")
                    .withImageResId(R.drawable.chemwizz)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("CODETREX")
                    .withImageResId(R.drawable.codetrex)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.mantis)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("APP-ATHON")
                    .withImageResId(R.drawable.appathon)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.usc_gold)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("RULE THE SKY")
                    .withImageResId(R.drawable.rocketwar)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.portland_orange)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("LFR")
                    .withImageResId(R.drawable.lfr)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.dodger_blue)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("CRYPTO")
                    .withImageResId(R.drawable.crypto)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("PLAY WITH CODES")
                    .withImageResId(R.drawable.codeplay)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.mantis)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("ELECTRADE")
                    .withImageResId(R.drawable.electrade)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.usc_gold)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("ELECTROMATRIX")
                    .withImageResId(R.drawable.electromatrix)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.portland_orange)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("THE JUNKYARD")
                    .withImageResId(R.drawable.junkyard)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.dodger_blue)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("TATVA")
                    .withImageResId(R.drawable.tatva)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("QUIZ")
                    .withImageResId(R.drawable.pic_card_3)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.mantis)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("STARTUP")
                    .withImageResId(R.drawable.startup)
                    .withDayPart("TECHNICAL")
                    .withBackgroundColorResId(R.color.usc_gold)
                    .build());

        }

        return eventCardModels;
    }
}
