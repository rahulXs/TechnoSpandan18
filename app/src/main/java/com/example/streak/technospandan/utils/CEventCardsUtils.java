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
                    .withEventTitle("AD WAR")
                    .withImageResId(R.drawable.adwar)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("OPEN MIC")
                    .withImageResId(R.drawable.openmic)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.usc_gold)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("THE VOICE")
                    .withImageResId(R.drawable.thevoice)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.portland_orange)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("DANCE FEVER")
                    .withImageResId(R.drawable.dance)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.dodger_blue)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("PARLIAMENT DIRECT")
                    .withImageResId(R.drawable.parliament)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("ONCE UPON A TIME")
                    .withImageResId(R.drawable.onceuponatime)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.mantis)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("NUKKAD NATAK")
                    .withImageResId(R.drawable.nukkadnatak)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.usc_gold)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("THE STAGE")
                    .withImageResId(R.drawable.thestage)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.portland_orange)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("FASHIONOVA")
                    .withImageResId(R.drawable.dance)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.dodger_blue)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("KISINE KHOOB LIKHA HAI")
                    .withImageResId(R.drawable.shayarana)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.mantis)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("SHOWBUZZ")
                    .withImageResId(R.drawable.showbuzz)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.usc_gold)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("PIXEL")
                    .withImageResId(R.drawable.pixel)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.portland_orange)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("STOCK-KING")
                    .withImageResId(R.drawable.stocking)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.dodger_blue)
                    .build());

        }
        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("TREASURE HUNT")
                    .withImageResId(R.drawable.treasurehunt)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.dark_orchid)
                    .build());

        }

        {
            eventCardModels.add(EventCardModel
                    .newBuilder()
                    .withEventTitle("THE SPELLING BEE")
                    .withImageResId(R.drawable.spellbee)
                    .withDayPart("CULTURAL")
                    .withBackgroundColorResId(R.color.mantis)
                    .build());

        }

        return eventCardModels;
    }
}
