package com.esafirm.imagepicker.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class Image implements Parcelable {
    public static final Parcelable.Creator<Image> CREATOR = new Parcelable.Creator<Image>() { // from class: com.esafirm.imagepicker.model.Image.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Image createFromParcel(Parcel parcel) {
            return new Image(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Image[] newArray(int i) {
            return new Image[i];
        }
    };
    public String TuitionPaymentFragmentbindingInflater1;
    private String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    private long TuitionPaymentFragmentspecialinlinedviewModeldefault2;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Image(long j, String str, String str2) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = j;
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.TuitionPaymentFragmentbindingInflater1 = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return ((Image) obj).TuitionPaymentFragmentbindingInflater1.equalsIgnoreCase(this.TuitionPaymentFragmentbindingInflater1);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.TuitionPaymentFragmentspecialinlinedviewModeldefault2);
        parcel.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        parcel.writeString(this.TuitionPaymentFragmentbindingInflater1);
    }

    protected Image(Parcel parcel) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault2 = parcel.readLong();
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = parcel.readString();
        this.TuitionPaymentFragmentbindingInflater1 = parcel.readString();
    }
}
