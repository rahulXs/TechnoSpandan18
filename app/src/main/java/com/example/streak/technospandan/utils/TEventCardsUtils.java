package com.example.streak.technospandan.utils;

import com.example.streak.technospandan.R;
import com.example.streak.technospandan.model.EventCardModel;


import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class TEventCardsUtils {


    /*public static Collection<EventCardModel> generateSportCards() {
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
    }*/


    public static Collection<EventCardModel> generateTechnicalCards() {
        String technical[]=new String[]{"Air Strike", "Nirmaan", "The Robo Knight", "Robo Race", "Fumes" , "Chemwizz" , "Codetrex","App-athon", "Rule the Sky", "LFR", "Crypto" , "Play with codes", "Electrade", "Electromatrix", "The Junkyard" , "Tatva", "Quiz" , "Startup"};

        int technicalImages[]={R.drawable.airstrike,R.drawable.nirmaan,R.drawable.robowar,R.drawable.roborace,R.drawable.fumes,R.drawable.chemwizz,
                R.drawable.codetrex,R.drawable.appathon,R.drawable.airstrike,R.drawable.lfr,R.drawable.crypto,R.drawable.codeplay,
                R.drawable.electrade,R.drawable.electromatrix,R.drawable.junkyard,R.drawable.tatva,R.drawable.pic_card_3,R.drawable.startup};

        List<EventCardModel> eventCardModels = new ArrayList<>(technical.length);

        for(int i=0;i<technical.length;i++)
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle(technical[i])
                    .withImageResId(technicalImages[i])
                    .withDayPart("Technical")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }


        return eventCardModels;
    }
}
