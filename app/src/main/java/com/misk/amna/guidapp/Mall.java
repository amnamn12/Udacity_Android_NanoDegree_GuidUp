package com.misk.amna.guidapp;

/**
 * Created by me on 15/04/17.
 */

public class Mall {
    private int mID;
    private String mName;
    private int mImageResourceId;

    public Mall(int mID, String mName, int mImageResourceId) {
        this.mID = mID;
        this.mName = mName;
        this.mImageResourceId = mImageResourceId;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }

    public int getmID() {
        return mID;
    }

    public void setmID(int mID) {
        this.mID = mID;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }
}
