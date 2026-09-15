package com.esafirm.imagepicker.features;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes3.dex */
public class ImagePickerSavePath implements Parcelable {
    public final String TuitionPaymentFragmentspecialinlinedviewModeldefault1;
    public final boolean b;
    public static final ImagePickerSavePath TuitionPaymentFragmentbindingInflater1 = new ImagePickerSavePath("Camera", false);
    public static final Parcelable.Creator<ImagePickerSavePath> CREATOR = new Parcelable.Creator<ImagePickerSavePath>() { // from class: com.esafirm.imagepicker.features.ImagePickerSavePath.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ImagePickerSavePath createFromParcel(Parcel parcel) {
            return new ImagePickerSavePath(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ImagePickerSavePath[] newArray(int i) {
            return new ImagePickerSavePath[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ImagePickerSavePath(String str, boolean z) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = str;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.TuitionPaymentFragmentspecialinlinedviewModeldefault1);
        parcel.writeByte(this.b ? (byte) 1 : (byte) 0);
    }

    protected ImagePickerSavePath(Parcel parcel) {
        this.TuitionPaymentFragmentspecialinlinedviewModeldefault1 = parcel.readString();
        this.b = parcel.readByte() != 0;
    }
}
