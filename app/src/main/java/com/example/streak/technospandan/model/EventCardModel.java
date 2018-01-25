package com.example.streak.technospandan.model;

import android.os.Parcel;
import android.os.Parcelable;

public class EventCardModel implements Parcelable {
    private String eventTitle;

    private int imageResId;
    private String dayPart;

    private int backgroundColorResId;

    private EventCardModel(Builder builder) {
        eventTitle = builder.eventTitle;
        imageResId = builder.imageResId;
        dayPart = builder.dayPart;
        backgroundColorResId = builder.backgroundColorResId;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public int getImageResId() {
        return imageResId;
    }

    public String getDayPart() {
        return dayPart;
    }

    public int getBackgroundColorResId() {
        return backgroundColorResId;
    }

    private EventCardModel(Parcel parcel) {
        eventTitle = parcel.readString();
        imageResId = parcel.readInt();
        dayPart = parcel.readString();
        backgroundColorResId = parcel.readInt();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(eventTitle);
        parcel.writeInt(imageResId);
        parcel.writeString(dayPart);
        parcel.writeInt(backgroundColorResId);
    }

    @SuppressWarnings("unused")
    public final static Parcelable.Creator<EventCardModel> CREATOR = new Parcelable.Creator<EventCardModel>() {

        @Override
        public EventCardModel createFromParcel(Parcel parcel) {
            return new EventCardModel(parcel);
        }

        @Override
        public EventCardModel[] newArray(int size) {
            return new EventCardModel[size];
        }
    };

    public static final class Builder {
        private String eventTitle;
        private int imageResId;
        private String dayPart;
        private int backgroundColorResId;

        private Builder() {
        }

        public Builder withEventTitle(String sportTitle) {
            this.eventTitle = sportTitle;
            return this;
        }

        public Builder withImageResId(int imageResId) {
            this.imageResId = imageResId;
            return this;
        }

        public Builder withDayPart(String dayPart) {
            this.dayPart = dayPart;
            return this;
        }

        public Builder withBackgroundColorResId(int backgroundColorResId) {
            this.backgroundColorResId = backgroundColorResId;
            return this;
        }

        public EventCardModel build() {
            return new EventCardModel(this);
        }
    }
}
