package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import defpackage.CameraProviderInitRetryPolicy1;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator<ReviewInfo> CREATOR = new CameraProviderInitRetryPolicy1();

    public abstract boolean TuitionPaymentFragmentbindingInflater1();

    public abstract PendingIntent b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(b(), 0);
        parcel.writeInt(TuitionPaymentFragmentbindingInflater1() ? 1 : 0);
    }
}
