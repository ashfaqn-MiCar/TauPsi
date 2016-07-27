package com.asutaupsi.taupsi.entities;

import android.os.Parcel;
import android.os.Parcelable;

public class RushEvent implements Parcelable {
    private int eventId;
    private String eventName;
    private String eventDate;
    private String eventTime;
    private String eventLocation;
    private double eventLatitude;
    private double eventLongitude;
    private boolean isAtAsu;
    private boolean isDowntown;
    private String eventDescription;

    public RushEvent(int eventId, String eventName, String eventDate, String eventTime, String eventLocation, double eventLatitude, double eventLongitude , boolean isAtAsu ,boolean isDowntown,String eventDiscription) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.eventDate = eventDate;
        this.eventTime = eventTime;
        this.eventLocation = eventLocation;
        this.eventLatitude = eventLatitude;
        this.eventLongitude = eventLongitude;
        this.isAtAsu = isAtAsu;
        this.isDowntown = isDowntown;
        this.eventDescription = eventDiscription;
    }

    protected RushEvent(Parcel in) {
        eventId = in.readInt();
        eventName = in.readString();
        eventDate = in.readString();
        eventTime = in.readString();
        eventLocation = in.readString();
        eventLatitude = in.readDouble();
        eventLongitude = in.readDouble();
        isAtAsu = in.readByte() !=0;
        isDowntown = in.readByte() !=0;
        eventDescription = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(eventId);
        dest.writeString(eventName);
        dest.writeString(eventDate);
        dest.writeString(eventTime);
        dest.writeString(eventLocation);
        dest.writeDouble(eventLatitude);
        dest.writeDouble(eventLongitude);
        dest.writeByte((byte) (isAtAsu ? 1 : 0));
        dest.writeByte((byte) (isDowntown ? 1 : 0));
        dest.writeString(eventDescription);

    }


    public boolean isDowntown() {
        return isDowntown;
    }

    public boolean isAtAsu() {
        return isAtAsu;
    }

    public String getEventDescription() {
        return eventDescription;
    }


    public static Creator<RushEvent> getCREATOR() {
        return CREATOR;
    }

    public int getEventId() {
        return eventId;
    }

    public String getEventName() {
        return eventName;
    }


    public String getEventDate() {
        return eventDate;
    }


    public String getEventTime() {
        return eventTime;
    }


    public String getEventLocation() {
        return eventLocation;
    }


    public double getEventLatitude() {
        return eventLatitude;
    }


    public double getEventLongitude() {
        return eventLongitude;
    }






    public static final Creator<RushEvent> CREATOR = new Creator<RushEvent>() {
        @Override
        public RushEvent createFromParcel(Parcel in) {
            return new RushEvent(in);
        }

        @Override
        public RushEvent[] newArray(int size) {
            return new RushEvent[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

}
