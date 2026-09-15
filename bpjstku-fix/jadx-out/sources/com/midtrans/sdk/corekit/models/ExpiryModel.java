package com.midtrans.sdk.corekit.models;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.gson.annotations.SerializedName;

/* JADX INFO: loaded from: classes4.dex */
public class ExpiryModel {
    public static final String UNIT_DAY = "days";
    public static final String UNIT_HOUR = "hours";
    public static final String UNIT_MINUTE = "minutes";

    @SerializedName(TypedValues.TransitionType.S_DURATION)
    public int duration;

    @SerializedName("start_time")
    public String startTime;

    @SerializedName("unit")
    public String unit;

    public int getDuration() {
        return this.duration;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setStartTime(String str) {
        this.startTime = str;
    }

    public void setUnit(String str) {
        this.unit = str;
    }
}
