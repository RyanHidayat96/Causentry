package com.esafirm.imagepicker.features.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.esafirm.imagepicker.features.ImagePickerSavePath;
import com.esafirm.imagepicker.features.ReturnMode;

/* JADX INFO: loaded from: classes3.dex */
public class BaseConfig implements Parcelable {
    public static final Parcelable.Creator<BaseConfig> CREATOR = new Parcelable.Creator<BaseConfig>() { // from class: com.esafirm.imagepicker.features.common.BaseConfig.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BaseConfig createFromParcel(Parcel parcel) {
            return new BaseConfig(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BaseConfig[] newArray(int i) {
            return new BaseConfig[i];
        }
    };
    public ImagePickerSavePath INotificationSideChannelStub;
    public ReturnMode cancelAll;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public BaseConfig() {
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.INotificationSideChannelStub, i);
        ReturnMode returnMode = this.cancelAll;
        parcel.writeInt(returnMode == null ? -1 : returnMode.ordinal());
    }

    public BaseConfig(Parcel parcel) {
        this.INotificationSideChannelStub = (ImagePickerSavePath) parcel.readParcelable(ImagePickerSavePath.class.getClassLoader());
        int i = parcel.readInt();
        this.cancelAll = i == -1 ? null : ReturnMode.values()[i];
    }
}
