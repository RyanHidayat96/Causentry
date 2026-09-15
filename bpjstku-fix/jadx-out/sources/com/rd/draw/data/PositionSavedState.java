package com.rd.draw.data;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

/* JADX INFO: loaded from: classes5.dex */
public class PositionSavedState extends View.BaseSavedState {
    public static final Parcelable.Creator<PositionSavedState> CREATOR = new Parcelable.Creator<PositionSavedState>() { // from class: com.rd.draw.data.PositionSavedState.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PositionSavedState createFromParcel(Parcel parcel) {
            return new PositionSavedState(parcel, (byte) 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PositionSavedState[] newArray(int i) {
            return new PositionSavedState[i];
        }
    };
    public int TuitionPaymentFragmentbindingInflater1;
    public int TuitionPaymentFragmentspecialinlinedviewModeldefault2;
    public int b;

    /* synthetic */ PositionSavedState(Parcel parcel, byte b) {
        this(parcel);
    }

    public PositionSavedState(Parcelable parcelable) {
        super(parcelable);
    }

    private PositionSavedState(Parcel parcel) {
        super(parcel);
        this.b = parcel.readInt();
        this.TuitionPaymentFragmentbindingInflater1 = parcel.readInt();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = parcel.readInt();
    }

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.b);
        parcel.writeInt(this.TuitionPaymentFragmentbindingInflater1);
        parcel.writeInt(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
    }
}
