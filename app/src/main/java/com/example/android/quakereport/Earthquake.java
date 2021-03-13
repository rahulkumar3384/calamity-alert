package com.example.android.quakereport;

public class Earthquake {
    /** Magnitude of the earthquake */
    private double mMagnitude;
    /* location of the earthquake */
    private String mLocation;
   long timeInMilliseconds;

    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquake( double magnitude , String location , long timeInMilliseconds , String url){
        mMagnitude = magnitude;
        mLocation = location;
        mUrl = url;
        mTimeInMilliseconds =  timeInMilliseconds;
    }

    public double getMagnitude(){return mMagnitude;}
    public String getUrl(){return mUrl;}
    public String getLocation(){return mLocation;}
    public long getTimeInMilliseconds(){return  mTimeInMilliseconds;}


}
